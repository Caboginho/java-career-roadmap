# GitHub Projects Board

Board recomendado: `Java Career Roadmap - Development`.

A configuração versionada fica em `.github/project-board.yml`.

## Colunas

```text
Backlog
Todo
In Progress
Review
Testing
Done
```

## Sugestao de Uso

- `Backlog`: ideias, modulos futuros e melhorias.
- `Todo`: tarefas selecionadas para o ciclo atual.
- `In Progress`: trabalho em andamento.
- `Review`: aguardando revisao propria ou externa.
- `Testing`: validacao de build, testes e documentacao.
- `Done`: finalizado e documentado.

## Campos Uteis

- Area: backend, frontend, database, devops, architecture.
- Nivel: beginner, intermediate, advanced.
- Tipo: feat, fix, docs, refactor, test, chore.
- Projeto: modulo ou projeto flagship relacionado.

## Criação via Script

Depois que o repositório existir no GitHub e houver um token com permissão de Projects:

```powershell
./scripts/setup/create-github-project-board.ps1 -Owner "seu-usuario-ou-org" -Token "$env:GH_TOKEN"
```

Para criar ou atualizar labels:

```powershell
./scripts/setup/create-github-labels.ps1 -Repository "owner/repo" -Token "$env:GH_TOKEN"
```
