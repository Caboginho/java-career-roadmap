# 📐 Template: architecture.md

Use este template para documentar a arquitetura de cada projeto.

---

# Arquitetura - [Nome do Projeto]

**Versão**: 1.0.0  
**Status**: ✅ In Progress  
**Última atualização**: [Data]

## 🎯 Visão Geral

[Descrição breve: O que é o projeto? Que problema resolve?]

**Exemplo**:
> O ERP Lite é um sistema de gestão empresarial leve com módulos de estoque, vendas e financeiro. Utiliza uma arquitetura em 3 camadas com Spring Boot no backend e React no frontend.

## 📊 Diagrama de Arquitetura de Alto Nível

```
┌─────────────┐
│   React     │ Frontend
│  (SPA)      │
└──────┬──────┘
       │ HTTP/REST
┌──────▼──────────────────────┐
│  Spring Boot API Layer       │
│  ├─ Controllers             │
│  ├─ Services               │
│  └─ Repositories           │
└──────┬──────────────────────┘
       │ SQL
┌──────▼──────────────────────┐
│  PostgreSQL Database         │
│  (Transactional Store)      │
└─────────────────────────────┘
```

## 🏗️ Stack Tecnológico

### Backend
- **Framework**: Spring Boot 3.x
- **ORM**: Hibernate/JPA
- **Build**: Maven
- **Testing**: JUnit 5, Mockito, TestContainers

### Frontend
- **Library**: React 18+
- **State**: Context API / Redux
- **HTTP**: Axios
- **Build**: Vite
- **Testing**: Jest, React Testing Library

### Infraestrutura
- **Database**: PostgreSQL 14+
- **Cache**: Redis (opcional)
- **Message Queue**: RabbitMQ (opcional)
- **Container**: Docker
- **Orquestração**: Docker Compose (dev), Kubernetes (prod)

### DevOps
- **CI/CD**: GitHub Actions
- **Monitoring**: Prometheus + Grafana (opcional)
- **Logs**: ELK Stack (opcional)

## 🏛️ Camadas da Arquitetura

### 1. Presentation Layer (Frontend)

**Responsabilidade**: Renderizar UI, capturar input do usuário

```
React Components
├── Pages (routes)
├── Components (reusáveis)
├── Hooks (custom)
└── Services (API calls)
```

**Exemplo**:
```javascript
// src/pages/Products.jsx
export function ProductsPage() {
  const [products, setProducts] = useState([]);
  
  useEffect(() => {
    productService.getAll().then(setProducts);
  }, []);
  
  return (
    <div>
      {products.map(p => <ProductCard key={p.id} product={p} />)}
    </div>
  );
}
```

### 2. API Layer (Backend)

**Responsabilidade**: Receber requisições HTTP, validar, delegar para service

```
Controller
├── Recebe HTTP Request
├── Valida input
├── Converte para DTO
├── Chama Service
└── Retorna JSON Response
```

**Exemplo**:
```java
@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    
    @GetMapping
    public ResponseEntity<Page<ProductDTO>> list(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }
    
    @PostMapping
    public ResponseEntity<ProductDTO> create(@Valid @RequestBody CreateProductDTO dto) {
        ProductDTO created = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
```

### 3. Business Logic Layer (Service)

**Responsabilidade**: Implementar regras de negócio, orquestração

```
Service
├── Validação de regras de negócio
├── Chamada de múltiplos repositórios
├── Transações
├── Eventos de domínio
└── Logging
```

**Exemplo**:
```java
@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;
    
    public Page<ProductDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable)
            .map(mapper::toDTO);
    }
    
    public ProductDTO create(CreateProductDTO dto) {
        // Validação de negócio
        if (dto.getPrice() < 0) {
            throw new InvalidProductException("Price must be positive");
        }
        
        Product product = mapper.toEntity(dto);
        Product saved = repository.save(product);
        
        return mapper.toDTO(saved);
    }
}
```

### 4. Data Access Layer (Repository)

**Responsabilidade**: Acesso a dados, queries

```
Repository
├── CRUD operations
├── Custom queries
├── Paginação
└── Filtros
```

**Exemplo**:
```java
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategoryId(Long categoryId, Pageable pageable);
    
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
    List<Product> findByPriceRange(@Param("min") BigDecimal min, 
                                   @Param("max") BigDecimal max);
}
```

### 5. Database Layer

**Responsabilidade**: Persistência de dados

```sql
-- Schema
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT NOW()
);

-- Índices
CREATE INDEX idx_products_name ON products(name);
```

## 🔄 Fluxo de Requisição

```
1. Frontend (React)
   └─ axios.get('/api/v1/products')

2. HTTP Request
   └─ GET /api/v1/products?page=0&size=20

3. Controller
   ├─ Recebe: GetRequest
   ├─ Valida: Pageable
   └─ Chama: service.findAll(pageable)

4. Service
   ├─ Aplica regras de negócio
   ├─ Chama: repository.findAll(pageable)
   └─ Mapeia: Product → ProductDTO

5. Repository
   ├─ Executa: SELECT query
   └─ Retorna: Page<Product>

6. Database
   └─ PostgreSQL executa query

7. Response
   ├─ HTTP 200 OK
   ├─ Content-Type: application/json
   └─ Body: { content: [...], totalElements: 100 }

8. Frontend (React)
   ├─ Recebe response
   ├─ setState(products)
   └─ Re-renderiza UI
```

## 📐 Padrões de Projeto Utilizados

### 1. Repository Pattern
Abstração do acesso a dados.

```java
// Interface define contrato
public interface ProductRepository extends JpaRepository<Product, Long> { }

// Service usa abstração
@Service
public class ProductService {
    @Autowired private ProductRepository repo;
}
```

### 2. Service Pattern
Lógica de negócio centralizada.

```java
@Service
public class ProductService {
    // Todas regras de negócio aqui
    public ProductDTO create(CreateProductDTO dto) { }
}
```

### 3. DTO Pattern
Isolamento entre camadas.

```java
// Entity (database)
@Entity
public class Product { }

// DTO (API)
public record ProductDTO(Long id, String name, BigDecimal price) { }
```

### 4. Dependency Injection
Inversão de controle.

```java
@Service
@RequiredArgsConstructor  // Lombok: injeta via construtor
public class ProductService {
    private final ProductRepository repository;
}
```

### 5. Builder Pattern
Construção de objetos complexos.

```java
// Usar Lombok
@Builder
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}

// Uso
Product product = Product.builder()
    .name("Laptop")
    .price(BigDecimal.valueOf(999.99))
    .build();
```

## 🔐 Segurança

### Autenticação
- JWT (JSON Web Token)
- Refresh tokens para sessões longas

### Autorização
- Role-based access control (RBAC)
- Permission-based (se necessário)

### Validação
- Input validation (Jakarta Validation)
- SQL Injection prevention (Prepared Statements via ORM)
- CSRF tokens

### Criptografia
- Senhas: BCrypt
- Tráfego: HTTPS/TLS

```java
@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    // Apenas admins podem acessar
}
```

## 🧪 Testes

### Estrutura

```
src/test/java/com/example/
├── unit/
│   └── ProductServiceTest.java
├── integration/
│   └── ProductControllerTest.java
└── fixtures/
    └── ProductFixture.java
```

### Exemplo: Unit Test

```java
@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    
    @Mock private ProductRepository repository;
    @InjectMocks private ProductService service;
    
    @Test
    void testCreateProduct() {
        // Given
        CreateProductDTO dto = new CreateProductDTO("Laptop", 999.99);
        
        // When
        ProductDTO result = service.create(dto);
        
        // Then
        assertNotNull(result);
        assertEquals("Laptop", result.name());
        verify(repository).save(any());
    }
}
```

### Exemplo: Integration Test

```java
@SpringBootTest
@Testcontainers
public class ProductControllerTest {
    
    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:14");
    
    @Autowired private MockMvc mvc;
    @Autowired private ProductRepository repository;
    
    @Test
    void testListProducts() throws Exception {
        // Given
        Product product = repository.save(new Product("Laptop", 999.99));
        
        // When & Then
        mvc.perform(get("/api/v1/products"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.content[0].name").value("Laptop"));
    }
}
```

## 🚀 Escalabilidade

### Horizontal Scaling
```
Load Balancer (NGINX)
├─ Instance 1: API Pod
├─ Instance 2: API Pod
└─ Instance 3: API Pod
       │
       └─→ Database (PostgreSQL)
```

### Caching
```java
@Service
public class ProductService {
    
    @Cacheable("products")
    public ProductDTO findById(Long id) {
        return repository.findById(id)
            .map(mapper::toDTO)
            .orElseThrow();
    }
}
```

### Async Processing
```java
@Service
public class OrderService {
    
    @Async
    public CompletableFuture<OrderDTO> createAsync(CreateOrderDTO dto) {
        return CompletableFuture.completedFuture(create(dto));
    }
}
```

## 📊 Observabilidade

### Logging
```java
@Slf4j
@Service
public class ProductService {
    
    public ProductDTO create(CreateProductDTO dto) {
        log.info("Creating product: {}", dto.getName());
        // ...
        log.debug("Product created with ID: {}", id);
    }
}
```

### Metrics
```java
@Service
public class ProductService {
    
    @Timed(value = "product.creation.time")
    public ProductDTO create(CreateProductDTO dto) {
        // ...
    }
}
```

### Health Checks
```java
@Component
public class DatabaseHealthCheck implements HealthIndicator {
    
    @Override
    public Health health() {
        try {
            // Check database
            return Health.up().build();
        } catch (Exception e) {
            return Health.down().withDetail("Error", e.getMessage()).build();
        }
    }
}
```

## 📋 Decisões Arquiteturais

Documentadas em `docs/decisions/ADR-*.md`:

- ADR-001: Usar Spring Boot (vs Quarkus, Micronaut)
- ADR-002: PostgreSQL para persistência
- ADR-003: React para frontend
- ADR-004: 3-layer architecture (Controller-Service-Repository)
- ADR-005: JWT para autenticação

## 🔗 Diagramas Detalhados

### Component Diagram
[Incluir: Component relationships]

### Sequence Diagram
[Incluir: Request sequence]

### Data Flow Diagram
[Incluir: Data flow]

## 📚 Documentação Relacionada

- [API Reference](./api.md) - Endpoints da API
- [Database Schema](./database.md) - Modelo de dados
- [Deployment Guide](./deployment.md) - Como fazer deploy
- [Architecture Decisions](./decisions/) - Decisões tomadas

## 🛠️ Próximas Melhorias

- [ ] Adicionar caching em Redis
- [ ] Implementar event sourcing
- [ ] Refatorar para CQRS
- [ ] Adicionar GraphQL API
- [ ] Implementar API versioning avançado

---

**Versão**: 1.0.0  
**Status**: ✅ Completo  
**Próxima revisão**: [Data futura]
