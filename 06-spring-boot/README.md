# Módulo 6: Spring Boot

## 📚 Objetivo

Construir **APIs REST profissionais** e escaláveis com Spring Boot 3.x.

## ⏱️ Duração

**4 semanas** (40 horas de estudo + 80 horas de prática)

## 📋 Tópicos

### Semana 1: Fundamentos Spring
- [ ] Spring Boot setup
- [ ] Auto-configuration
- [ ] Dependency Injection
- [ ] Application properties
- [ ] Spring profiles (dev, test, prod)

### Semana 2: REST APIs
- [ ] Spring MVC
- [ ] Controllers
- [ ] Mapeamento de requisições
- [ ] Métodos HTTP (GET, POST, PUT, DELETE)
- [ ] Status HTTP
- [ ] Content negotiation

### Semana 3: Dados e Validação
- [ ] Spring Data JPA
- [ ] Repositories
- [ ] DTOs (Data Transfer Objects)
- [ ] Mapeamento de entidades
- [ ] Validação (Jakarta Validation)
- [ ] Tratamento de exceções global

### Semana 4: Produção
- [ ] Logging (SLF4J)
- [ ] Swagger/OpenAPI
- [ ] Configuration
- [ ] Testing
- [ ] Documentação

## 🎯 Resultados Esperados

Ao completar este módulo, você será capaz de:

✅ Criar aplicação Spring Boot do zero  
✅ Implementar REST APIs profissionais  
✅ Usar Spring Data JPA  
✅ Validar dados  
✅ Tratar erros globalmente  
✅ Documentar APIs com Swagger  
✅ Logar apropriadamente  
✅ Testar controllers  

## 📁 Estrutura do Módulo

```
06-spring-boot/
├── 01-teoria/
│   ├── 01-spring-setup.md
│   ├── 02-dependency-injection.md
│   ├── 03-rest-apis.md
│   ├── 04-repositories.md
│   ├── 05-validacao.md
│   ├── 06-error-handling.md
│   └── 07-swagger.md
├── 02-exemplos/
│   └── projeto-exemplo/
│       ├── pom.xml
│       ├── src/main/java
│       └── README.md
├── 03-exercicios/
│   └── CRUDExercises/
├── 04-mini-projetos/
│   └── api-profissional/
├── 05-diagramas/
│   ├── spring-architecture.png
│   └── request-flow.png
├── 06-testes/
│   └── ControllerTest.java
└── README.md
```

## 🏗️ Mini Projeto: API Profissional

**Duração**: 2 semanas  
**Stack**: Spring Boot 3.x + PostgreSQL + JPA

### Funcionalidades

```
GET    /api/v1/produtos           # Listar todos
POST   /api/v1/produtos           # Criar novo
GET    /api/v1/produtos/{id}      # Obter um
PUT    /api/v1/produtos/{id}      # Atualizar
DELETE /api/v1/produtos/{id}      # Deletar

Filtros:
GET /api/v1/produtos?categoria=eletrônicos&preco=100
```

### Estrutura do Projeto

```
meu-projeto/
├── src/main/java/com/example/
│   ├── controllers/
│   │   └── ProdutoController.java
│   ├── services/
│   │   └── ProdutoService.java
│   ├── repositories/
│   │   └── ProdutoRepository.java
│   ├── entities/
│   │   └── Produto.java
│   ├── dtos/
│   │   ├── ProdutoDTO.java
│   │   └── ProdutoCreateDTO.java
│   ├── exceptions/
│   │   └── ResourceNotFoundException.java
│   ├── config/
│   │   └── OpenApiConfig.java
│   └── Application.java
├── src/test/java
│   └── ProdutoControllerTest.java
├── pom.xml
└── application.yml
```

### Exemplo de Controller

```java
@RestController
@RequestMapping("/api/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {
    
    private final ProdutoService service;
    
    @GetMapping
    public ResponseEntity<Page<ProdutoDTO>> listar(Pageable pageable) {
        return ResponseEntity.ok(service.listar(pageable));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> obter(@PathVariable Long id) {
        return ResponseEntity.ok(service.obter(id));
    }
    
    @PostMapping
    public ResponseEntity<ProdutoDTO> criar(@Valid @RequestBody ProdutoCreateDTO dto) {
        ProdutoDTO novo = service.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> atualizar(
        @PathVariable Long id,
        @Valid @RequestBody ProdutoUpdateDTO dto
    ) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
```

### Exemplo de Service

```java
@Service
@RequiredArgsConstructor
public class ProdutoService {
    
    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;
    private final Logger logger = LoggerFactory.getLogger(ProdutoService.class);
    
    public Page<ProdutoDTO> listar(Pageable pageable) {
        logger.info("Listando produtos com paginação: {}", pageable);
        return repository.findAll(pageable).map(mapper::toDTO);
    }
    
    public ProdutoDTO obter(Long id) {
        return repository.findById(id)
            .map(mapper::toDTO)
            .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado"));
    }
    
    public ProdutoDTO criar(ProdutoCreateDTO dto) {
        Produto produto = mapper.toEntity(dto);
        Produto salvo = repository.save(produto);
        logger.info("Produto criado: {}", salvo.getId());
        return mapper.toDTO(salvo);
    }
    
    public void deletar(Long id) {
        repository.findById(id)
            .ifPresentOrElse(
                p -> repository.delete(p),
                () -> { throw new ResourceNotFoundException("Produto não encontrado"); }
            );
    }
}
```

## 📚 Como Usar Este Módulo

### Fase 1: Fundamentos (15 horas)
1. Configure seu primeiro projeto Spring Boot
2. Leia a teoria em `01-teoria/`
3. Execute o projeto em `02-exemplos/`

### Fase 2: Prática (30 horas)
1. Resolva exercícios CRUD
2. Implemente validações
3. Teste cada funcionalidade

### Fase 3: Mini Projeto (25 horas)
1. Crie API profissional completa
2. Implemente Swagger
3. Escreva testes

### Fase 4: Refinamento (10 horas)
1. Otimize performance
2. Melhore tratamento de erros
3. Documente tudo

## 🎯 Exercícios

### Básico (0-15)
Controllers simples, CRUD, validation

### Intermediário (16-35)
Relacionamentos, filtros, paginação

### Avançado (36-50)
Custom queries, caching, performance

## ✅ Checklist de Conclusão

- [ ] Projeto Spring Boot completo
- [ ] Mínimo 5 endpoints funcionais
- [ ] Validação de entrada
- [ ] Tratamento de erro global
- [ ] Swagger documentado
- [ ] 80%+ cobertura de testes
- [ ] Application properties
- [ ] Logging estruturado
- [ ] README profissional

## 🚀 Próximos Passos

Depois de completar este módulo:
- **Módulo 7**: Spring Security + JWT
- Adicionar autenticação à sua API
- Controlar acesso com roles

---

**Status**: 🚀 Pronto para começar!  
**Duração Total**: 4 semanas  
**Próximo Módulo**: Spring Security

