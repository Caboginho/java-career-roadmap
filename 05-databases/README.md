# Módulo 5: Banco de Dados

## 📚 Objetivo

Dominar **SQL profissional** e **modelagem de dados** com PostgreSQL.

## ⏱️ Duração

**3 semanas** (30 horas de estudo + 50 horas de prática)

## 📋 Tópicos

### Semana 1: SQL Fundamentals
- [ ] Comandos básicos (SELECT, INSERT, UPDATE, DELETE)
- [ ] WHERE e filtros
- [ ] ORDER BY e LIMIT
- [ ] Agregações (COUNT, SUM, AVG, MIN, MAX)
- [ ] GROUP BY e HAVING
- [ ] DISTINCT

### Semana 2: JOINs e Relacionamentos
- [ ] INNER JOIN
- [ ] LEFT JOIN / RIGHT JOIN / FULL OUTER JOIN
- [ ] Cross JOIN
- [ ] Self JOIN
- [ ] Subqueries
- [ ] Correlated subqueries

### Semana 3: Otimização e Avançado
- [ ] Índices e performance
- [ ] Views
- [ ] Procedures e functions
- [ ] Transactions (ACID)
- [ ] Modelagem ER
- [ ] Normalização

## 🎯 Resultados Esperados

Ao completar este módulo, você será capaz de:

✅ Escrever queries SQL complexas  
✅ Modelar dados normalizados  
✅ Otimizar queries com índices  
✅ Usar JOINs corretamente  
✅ Entender transações  
✅ Criar views e procedures  
✅ Resolver problemas de performance  

## 📁 Estrutura do Módulo

```
05-databases/
├── 01-teoria/
│   ├── 01-sql-basico.md
│   ├── 02-joins.md
│   ├── 03-agregacoes.md
│   ├── 04-modelagem.md
│   ├── 05-indice-performance.md
│   ├── 06-transactions.md
│   └── 07-procedures.md
├── 02-exemplos/
│   ├── create-tables.sql
│   ├── select-basico.sql
│   ├── joins-exemplos.sql
│   └── procedures-exemplos.sql
├── 03-exercicios/
│   ├── 01-basico/
│   ├── 02-intermediario/
│   └── 03-avancado/
├── 04-mini-projetos/
│   └── sistema-financeiro-sql/
├── 05-diagramas/
│   ├── er-diagram.png
│   └── schema-relationships.png
├── 06-testes/
│   └── DatabaseTest.sql
└── README.md (este arquivo)
```

## 🏗️ Mini Projeto: Sistema Financeiro SQL-First

**Duração**: 2 semanas  
**Skills**: Modelagem, JOINs, Transações, Performance

### Schema

```sql
-- Contas
CREATE TABLE contas (
    id SERIAL PRIMARY KEY,
    numero VARCHAR(20) UNIQUE,
    titular VARCHAR(100),
    saldo DECIMAL(15, 2),
    data_criacao TIMESTAMP DEFAULT NOW()
);

-- Transações
CREATE TABLE transacoes (
    id SERIAL PRIMARY KEY,
    conta_id INT REFERENCES contas(id),
    tipo VARCHAR(20), -- 'deposito', 'saque', 'transferencia'
    valor DECIMAL(15, 2),
    data_transacao TIMESTAMP DEFAULT NOW()
);

-- Índices
CREATE INDEX idx_conta_numero ON contas(numero);
CREATE INDEX idx_transacao_conta ON transacoes(conta_id);
CREATE INDEX idx_transacao_data ON transacoes(data_transacao);
```

### Queries Complexas

```sql
-- Saldo por conta
SELECT c.numero, c.titular, SUM(
    CASE WHEN t.tipo = 'deposito' THEN t.valor
         WHEN t.tipo IN ('saque', 'transferencia') THEN -t.valor
         ELSE 0 END
) as saldo
FROM contas c
LEFT JOIN transacoes t ON c.id = t.conta_id
GROUP BY c.id, c.numero, c.titular;

-- Últimas 10 transações por conta
SELECT c.numero, t.tipo, t.valor, t.data_transacao
FROM contas c
JOIN transacoes t ON c.id = t.conta_id
WHERE c.numero = '123456'
ORDER BY t.data_transacao DESC
LIMIT 10;
```

## 📚 Como Usar Este Módulo

### Fase 1: Teoria (10 horas)
1. Leia todos os arquivos em `01-teoria/`
2. Execute cada exemplo em `02-exemplos/`
3. Implemente um schema simples

### Fase 2: Prática (20 horas)
1. Resolva todos os exercícios
2. Teste diferentes abordagens
3. Otimize suas queries

### Fase 3: Mini Projeto (15 horas)
1. Implemente o Sistema Financeiro
2. Crie índices apropriados
3. Teste transações

### Fase 4: Revisão (5 horas)
1. Revise conceitos
2. Prepare-se para Módulo 6 (Spring Data JPA)

## 🎯 Exercícios

### Básico (0-15)
INSERT, SELECT simples, WHERE

### Intermediário (16-35)
JOINs, GROUP BY, agregações

### Avançado (36-50)
Subqueries, performance, transactions

## ✅ Checklist de Conclusão

- [ ] Ler toda a teoria
- [ ] Executar todos os exemplos
- [ ] Resolver 50 exercícios SQL
- [ ] Modelar schema relacional
- [ ] Otimizar queries lentas
- [ ] Implementar mini projeto
- [ ] Testar transações
- [ ] Documentar schema

## 🚀 Próximos Passos

Depois de completar este módulo:
- **Módulo 6**: Spring Boot + Spring Data JPA
- Integrar Java com banco de dados
- Usar ORM (Object-Relational Mapping)

---

**Status**: 🚀 Pronto para começar!  
**Duração Total**: 3 semanas  
**Próximo Módulo**: Spring Boot

