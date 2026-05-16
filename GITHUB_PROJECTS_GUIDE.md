# 🗂️ GitHub Projects Setup Guide

Como configurar GitHub Projects para gerenciar este roadmap como uma empresa real.

## 📋 Passo 1: Criar Project

### Via Web
1. Acesse o repositório no GitHub
2. Clique em **Projects** tab
3. Clique em **New project**
4. Selecione **Table** ou **Board** (recomendado: Board)
5. Nome: "Java Career Roadmap - Development"
6. Descrição: "Tracking development of modules, projects, and content"
7. Clique **Create**

## 📊 Passo 2: Configurar Estrutura (Board View)

### Colunas Padrão

Renomear/criar as colunas assim:

```
Backlog → Em Andamento → Em Revisão → Finalizado
```

#### 1️⃣ **Backlog**
Tarefas não iniciadas.

**Status**: Aberto  
**Prioridade**: Qualquer  
**Exemplo**:
- [ ] Módulo 10: Frontend Moderno
- [ ] Projeto 5: Chat Real Time
- [ ] Adicionar exemplos de Docker

#### 2️⃣ **Em Andamento**
Tarefas em progresso.

**Regra**: Máximo 5 items por pessoa  
**Status**: Em Progresso  
**Exemplo**:
- [ ] Módulo 6: Spring Boot (90% completo)
- [ ] Projeto 1: ERP Lite (60% completo)

#### 3️⃣ **Em Revisão**
Tarefas prontas, aguardando review.

**Status**: Aguardando Review  
**Exemplo**:
- [ ] Módulo 5: Database (pronto para merge)
- [ ] Exercícios Module 4 (100 exercícios)

#### 4️⃣ **Finalizado**
Tarefas completadas.

**Regra**: Arquivar após 2 semanas  
**Status**: Completo  
**Exemplo**:
- [x] Módulo 1: Java Fundamentals
- [x] README principal

## 🏷️ Passo 3: Configurar Labels

Crie labels para categorizar issues:

### Tipo
- `type:module` - Relacionado a módulo
- `type:project` - Relacionado a projeto
- `type:documentation` - Documentação
- `type:infrastructure` - CI/CD, configuração

### Prioridade
- `priority:critical` - 🔴 Bloqueante
- `priority:high` - 🟠 Importante
- `priority:medium` - 🟡 Normal
- `priority:low` - 🟢 Pode esperar

### Status
- `status:backlog` - Na lista de espera
- `status:in-progress` - Sendo trabalhado
- `status:review` - Aguardando review
- `status:done` - Finalizado

### Módulos (opcional)
- `module:01-fundamentals`
- `module:02-oop`
- `module:03-datastructures`
- ... etc para cada módulo

### Projetos
- `project:01-erp-lite`
- `project:02-ecommerce`
- ... etc para cada projeto

## 📌 Passo 4: Estrutura de Issues

### Template: Novo Módulo

**Title**: `feat: Módulo X - [Nome]`

**Labels**: `type:module`, `priority:high`, `module:0X`

**Body**:
```markdown
## 📚 Objetivo
[Descrever objetivo do módulo]

## ⏱️ Duração Estimada
[X semanas]

## 📋 Checklist
- [ ] Criar estrutura de diretórios
- [ ] Escrever teoria (01-teoria/)
- [ ] Criar exemplos (02-exemplos/)
- [ ] Fazer exercícios (03-exercicios/)
- [ ] Implementar mini projetos (04-mini-projetos/)
- [ ] Criar diagramas (05-diagramas/)
- [ ] Escrever testes (06-testes/)
- [ ] Criar README.md
- [ ] Revisar conteúdo
- [ ] Fazer merge

## 🔗 Relacionado
- Módulo anterior: [Link]
- Próximo módulo: [Link]
```

### Template: Novo Projeto

**Title**: `feat: Projeto X - [Nome]`

**Labels**: `type:project`, `priority:high`, `project:0X`

**Body**:
```markdown
## 📋 Especificações
- **Nível**: [Intermediário/Avançado]
- **Stack**: [Tecnologias]
- **Duração**: [X semanas]

## 🎯 Funcionalidades
- [ ] Feature 1
- [ ] Feature 2
- [ ] Feature 3

## 📊 Arquitetura
- [ ] Diagrama de arquitetura
- [ ] Documentação de database
- [ ] API documentation

## 🧪 Qualidade
- [ ] Unit tests (mín 80%)
- [ ] Integration tests
- [ ] Documentation

## 🚀 Deploy
- [ ] Docker + Docker Compose
- [ ] GitHub Actions CI/CD
- [ ] Deploy guide

## 📚 Documentação
- [ ] README.md profissional
- [ ] docs/architecture.md
- [ ] docs/database.md
- [ ] docs/api.md
- [ ] docs/deployment.md
```

### Template: Documentação

**Title**: `docs: [Descrição]`

**Labels**: `type:documentation`, `priority:medium`

**Body**:
```markdown
## 📝 O Quê Documentar
[Descrever o que precisa ser documentado]

## 📍 Onde
[Path do arquivo]

## 📋 Seções
- [ ] Seção 1
- [ ] Seção 2
- [ ] Exemplos
- [ ] Diagramas
```

## 🔄 Passo 5: Automação

### Regras de Automação

**GitHub permite automação nativa**:

1. **Auto-move on open**: Issues criadas → Backlog
2. **Auto-move on comment**: Se houver "in progress" → Em Andamento
3. **Auto-move on PR**: PR criado → Em Revisão
4. **Auto-move on merge**: PR merged → Finalizado

### Configuração (via GitHub UI)

1. Abra seu Project Board
2. Clique **Workflows** (topo)
3. Habilite:
   - "Auto add to project"
   - "Auto-add pull requests"
   - "Auto-update project fields"

## 📊 Passo 6: Views Diferentes

Crie múltiplas views no mesmo projeto:

### View 1: Board (Kanban)
```
Backlog → Em Andamento → Em Revisão → Finalizado
```

### View 2: Roadmap (Timeline)
```
Fase 1 (Mai-Jul 2026)
├─ Módulo 1
├─ Módulo 2
└─ Módulo 3

Fase 2 (Ago-Out 2026)
├─ Módulo 5
├─ Módulo 6
└─ Módulo 7
```

### View 3: Tabela (com filtros)
```
| Title | Status | Priority | Assigned | Due Date |
|-------|--------|----------|----------|----------|
```

## 👥 Passo 7: Configurar Equipe

Se trabalhar com mais pessoas:

1. **Adicionar colaboradores**: Settings → Manage access
2. **Atribuir issues**: Assign to @username
3. **Defina responsabilidades**:
   - Módulos 1-5: Person A
   - Módulos 6-10: Person B
   - Módulos 11-14: Person C
   - Projetos 1-5: Person A
   - Projetos 6-10: Person B

## 📊 Exemplos de Board Completo

### Initial State (Dia 1)

```
BACKLOG (15 itens)
├─ feat: Módulo 1 - Java Fundamentals
├─ feat: Módulo 2 - OOP
├─ feat: Módulo 3 - Data Structures
├─ feat: Módulo 4 - Java Moderno
├─ feat: Módulo 5 - Databases
├─ feat: Módulo 6 - Spring Boot
├─ feat: Módulo 7 - Security
├─ feat: Módulo 8 - JPA/Hibernate
├─ feat: Módulo 9 - Testing
├─ feat: Módulo 10 - React Frontend
├─ feat: Módulo 11 - React Advanced
├─ feat: Módulo 12 - Docker
├─ feat: Módulo 13 - CI/CD
├─ feat: Módulo 14 - Cloud
└─ feat: Projeto 1 - ERP Lite

EM ANDAMENTO (0 itens)

EM REVISÃO (0 itens)

FINALIZADO (0 itens)
```

### Mid-Progress (Mês 3)

```
BACKLOG (8 itens)
├─ feat: Módulo 7 - Security
├─ feat: Módulo 8 - JPA/Hibernate
├─ feat: Projeto 2 - E-commerce
├─ feat: Projeto 3 - Educational
└─ ...

EM ANDAMENTO (3 itens)
├─ feat: Módulo 5 - Databases (70%)
├─ feat: Módulo 6 - Spring Boot (50%)
└─ feat: Projeto 1 - ERP Lite (40%)

EM REVISÃO (2 itens)
├─ feat: Módulo 4 - Java Moderno (pronto)
└─ docs: Atualizar README

FINALIZADO (5 itens)
├─ feat: Módulo 1 - Java Fundamentals ✓
├─ feat: Módulo 2 - OOP ✓
├─ feat: Módulo 3 - Data Structures ✓
├─ docs: Criar ROADMAP.md ✓
└─ chore: Setup GitHub ✓
```

## 📈 Métricas para Rastrear

1. **Velocity**: Issues finalizadas por sprint
2. **Burndown**: Itens reduzindo ao longo do tempo
3. **Cycle Time**: Tempo de Backlog → Finalizado
4. **Lead Time**: Tempo de criação → Finalizado

## 🎯 Template de Sprint (Opcional)

Se usar sprints:

**Cada Sprint = 2 semanas**

### Sprint 1 (Sem 1-2 Maio 2026)
```
Goal: Completar Módulo 1

In Sprint:
- feat: Módulo 1 - Java Fundamentals
- docs: Write README for Module 1
- test: Add test templates

Sprint Details:
- Start: 2026-05-01
- End: 2026-05-14
- Capacity: 40 points
```

## 🚀 Quick Start

### Para usar HOJE:

1. Crie um Project
2. Adicione 4 colunas: Backlog, Em Andamento, Em Revisão, Finalizado
3. Crie issues para cada módulo e projeto
4. Mova a primeira tarefa para "Em Andamento"
5. Comece a trabalhar! 🎯

## 📚 Recursos

- [GitHub Projects Docs](https://docs.github.com/en/issues/planning-and-tracking-with-projects)
- [GitHub Issues Templates](https://docs.github.com/en/communities/using-templates-to-encourage-useful-issues-and-pull-requests)
- [Project Automation](https://docs.github.com/en/issues/planning-and-tracking-with-projects/automating-your-project)

## 💡 Pro Tips

1. **Use milestones** para phases: FASE 1, FASE 2, etc
2. **Link PRs to issues**: "Closes #123" auto-moves item
3. **Use templates**: Padroniza criação de issues
4. **Archive often**: Keep board clean
5. **Review metrics**: Entenda seu velocity

---

**Status**: 🚀 Pronto para configurar!

Após configurar, seu repositório parecerá **enterprise-grade** instantaneamente.

