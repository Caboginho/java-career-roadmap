# Convenção de Commits

Utilizamos **Conventional Commits** para manter um histórico claro e profissional do projeto.

## Formato

```
<tipo>[escopo opcional]: <descrição>

[corpo opcional]

[rodapé(s) opcional(is)]
```

## Tipos de Commit

### `feat` — Adição de funcionalidade
Use quando adicionar uma nova feature, módulo ou projeto.

```bash
git commit -m "feat: add Módulo 1 - Java Fundamentals"
git commit -m "feat: add projeto ERP Lite"
git commit -m "feat(module-5): add SQL aggregation examples"
```

### `fix` — Correção de bug
Use para corrigir erros, problemas, ou conteúdo incorreto.

```bash
git commit -m "fix: corrigir sintaxe SQL na query de exemplo"
git commit -m "fix(module-2): corrigir typo em OOP README"
git commit -m "fix: broken link em INDEX.md"
```

### `docs` — Documentação
Use para adicionar ou atualizar documentação, READMEs, comentários.

```bash
git commit -m "docs: add architecture documentation"
git commit -m "docs(module-6): update Spring Boot examples"
git commit -m "docs: create CONTRIBUTING.md"
```

### `refactor` — Refatoração
Use para reorganizar código/conteúdo sem mudar funcionalidade.

```bash
git commit -m "refactor: reorganize exercise structure"
git commit -m "refactor(projects): standardize folder naming"
```

### `test` — Testes
Use para adicionar ou modificar testes.

```bash
git commit -m "test: add unit tests for calculator module"
git commit -m "test(spring-boot): add controller tests"
```

### `chore` — Manutenção
Use para tarefas de manutenção, atualizações de dependências.

```bash
git commit -m "chore: update Java version to 21"
git commit -m "chore: update Spring Boot to 3.2"
git commit -m "chore: update dependencies"
```

### `style` — Estilo de código
Use para mudanças de formatação, indentação, espaços em branco.

```bash
git commit -m "style: format code with prettier"
git commit -m "style: fix indentation in examples"
```

### `perf` — Performance
Use para melhorias de performance.

```bash
git commit -m "perf: optimize database queries"
git commit -m "perf: improve module loading time"
```

### `build` — Build
Use para mudanças que afetam o build ou dependências externas.

```bash
git commit -m "build: configure Maven POM"
git commit -m "build: add GitHub Actions workflow"
```

### `ci` — Integração Contínua
Use para mudanças em scripts de CI/CD.

```bash
git commit -m "ci: add markdown linter to workflow"
git commit -m "ci: configure GitHub Actions"
```

## Escopo (Opcional)

Especifique a área afetada entre parênteses:

```bash
# Exemplos
git commit -m "feat(module-1): add new exercise"
git commit -m "docs(project-1): update architecture"
git commit -m "fix(readme): broken link"
```

**Escopos recomendados**:
- `module-1` até `module-17`
- `project-1` até `project-10`
- `readme`, `roadmap`, `index`, `docs`
- `github-actions`, `config`, `structure`

## Descrição

A descrição deve ser:
- ✅ Clara e concisa
- ✅ Imperativa (não "added" ou "adds", use "add")
- ✅ Sem ponto final
- ✅ Em português ou inglês (consistente)

```bash
# ✅ Bom
git commit -m "feat: add 100 exercises for module 1"
git commit -m "fix: correct SQL syntax in example"

# ❌ Evitar
git commit -m "Added new stuff"
git commit -m "Fixed things."
git commit -m "Updates"
```

## Corpo (Opcional)

Use para explicar **o quê** e **por quê**, não **como**.

```bash
git commit -m "docs(module-5): add SQL performance tips

These tips help students understand query optimization
before diving into Spring Data JPA. Includes real-world
examples from production code."
```

## Rodapé (Opcional)

Use para referências, breaking changes, ou relacionamentos.

```bash
# Fechando uma issue
git commit -m "fix: resolve login bug

Fixes #123"

# Breaking change
git commit -m "refactor: restructure module layout

BREAKING CHANGE: module numbering changed from 0-indexed to 1-indexed"

# Co-author
git commit -m "feat: add new module

Co-authored-by: John Doe <john@example.com>"
```

## Exemplos de Boas Práticas

### Exemplo 1: Novo Módulo
```bash
git commit -m "feat(module-7): add Spring Security basics

- JWT authentication
- OAuth2 overview
- Role-based access control
- 50+ exercises
- 2 mini projects

This module bridges backend API security with real-world patterns."
```

### Exemplo 2: Correção de Documentação
```bash
git commit -m "fix(module-3): correct array sorting examples

The merge sort example had incorrect implementation.
Updated with correct version and added complexity analysis."
```

### Exemplo 3: Novo Projeto
```bash
git commit -m "feat(project-1): scaffold ERP Lite structure

- Backend: Spring Boot + PostgreSQL
- Frontend: React + TypeScript
- Docker setup
- GitHub Actions CI/CD
- Swagger documentation

Includes initial architecture and deployment guides."
```

### Exemplo 4: Refatoração
```bash
git commit -m "refactor: standardize project structure

All projects now follow:
- /backend
- /frontend
- /docs
- /.github/workflows

No functional changes, better consistency."
```

## Validação de Commits

### Checklist Antes de Fazer Commit

- [ ] Tipo de commit está correto?
- [ ] Escopo está entre parênteses (se aplicável)?
- [ ] Descrição é clara e imperativa?
- [ ] Primeira letra é maiúscula?
- [ ] Sem ponto final?
- [ ] Corpo explica o "porquê" (se necessário)?
- [ ] Referencia issues/PRs (se aplicável)?

### Exemplo de Validação

```bash
# ❌ Evitar
git commit -m "add stuff"
git commit -m "Updated module 1"
git commit -m "Fix bug in exercises."

# ✅ Correto
git commit -m "feat(module-1): add 50 basic exercises"
git commit -m "fix(module-3): correct binary search example"
git commit -m "docs: update README with new sections"
```

## Mensagens de Commit Multilinha

Para commits com mais detalhes:

```bash
git commit -m "feat(module-5): add advanced SQL queries" -m "
- Window functions
- CTEs (Common Table Expressions)
- JSON operators in PostgreSQL
- 5 real-world examples
- Exercise set (20+ problems)

Prepares students for complex database design patterns
commonly used in production systems."
```

## Integração com Git Hooks

### Pre-commit Hook (opcional)

Você pode adicionar um hook para validar commits:

```bash
# .git/hooks/pre-commit
#!/bin/bash

# Validar formato de commit
message=$(git log -1 --pretty=%B)
if ! echo "$message" | grep -E '^(feat|fix|docs|refactor|test|chore|style|perf|build|ci)(\(.+\))?: .+$'; then
    echo "❌ Commit message must follow Conventional Commits format"
    echo "Formato: <tipo>[escopo]: <descrição>"
    exit 1
fi
```

## Leitura Adicional

- [Conventional Commits](https://www.conventionalcommits.org/pt-br/)
- [Angular Commit Guidelines](https://github.com/angular/angular/blob/main/CONTRIBUTING.md#commit)
- [Semantic Versioning](https://semver.org/lang/pt-BR/)

## Padrão no Roadmap

**Padrão para commits neste repositório**:

```
feat(module-X): <descrição>
fix: <descrição>
docs: <descrição>
refactor: <descrição>
test: <descrição>
chore: <descrição>
```

---

**Ative esta convenção agora**:
```bash
git config commit.template .gitmessage
```

---

**Última atualização**: Maio 2026

