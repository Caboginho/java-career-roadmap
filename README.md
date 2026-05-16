# Java Career Roadmap 2026

[![Java](https://img.shields.io/badge/Java-21-red)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green)](https://spring.io/projects/spring-boot)
[![React](https://img.shields.io/badge/React-19-blue)](https://react.dev)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14%2B-336791)](https://www.postgresql.org)
[![Docker](https://img.shields.io/badge/Docker-24%2B-2496ED)](https://www.docker.com)
[![License](https://img.shields.io/badge/license-MIT-yellow)](LICENSE)
[![Status](https://img.shields.io/badge/status-in_progress-orange)]()
[![Commits](https://img.shields.io/badge/commits-conventional-blue)](COMMITS_CONVENTION.md)

Roadmap completo para evoluir de fundamentos de programação até desenvolvimento Java fullstack profissional, com módulos de estudo, exercícios, mini projetos, documentação técnica, automação e projetos de portfólio.

## Visão Geral

Este repositório foi estruturado para funcionar como:

- projeto open source sério;
- laboratório de engenharia;
- plataforma educacional;
- portfólio enterprise.

O plano combina estudo guiado, prática progressiva e projetos reais usando Java, Spring Boot, PostgreSQL, React, Docker, cloud, testes e arquitetura.

## Estrutura Principal

```text
java-career-roadmap/
├── .github/
│   ├── ISSUE_TEMPLATE/
│   ├── workflows/
│   ├── dependabot.yml
│   ├── labels.yml
│   └── pull_request_template.md
├── 01-java-fundamentals/
├── 02-oop-and-clean-code/
├── 03-data-structures/
├── 04-java-moderno/
├── 05-databases/
├── 06-spring-boot/
├── 07-security/
├── 08-jpa-hibernate/
├── 09-testing/
├── 10-react-frontend/
├── 11-microservices/
├── 12-cloud/
├── 13-system-design/
├── 14-design-patterns/
├── projects/
├── docs/
├── notes/
├── diagrams/
├── portfolio/
├── certificates/
└── scripts/
```

## Módulos

| Módulo | Tema | Resultado esperado |
|---|---|---|
| 01 | Java Fundamentals | Programas Java simples, métodos, arrays e lógica procedural |
| 02 | OOP and Clean Code | Classes, objetos, SOLID e código limpo |
| 03 | Data Structures | Estruturas de dados e complexidade |
| 04 | Java Moderno | Streams, lambdas, records, optionals e concorrência |
| 05 | Databases | SQL, modelagem e PostgreSQL |
| 06 | Spring Boot | APIs REST profissionais |
| 07 | Security | JWT, OAuth2, OWASP e segurança de APIs |
| 08 | JPA and Hibernate | ORM, entidades, queries e transações |
| 09 | Testing | JUnit, Mockito, TDD e testes de integração |
| 10 | React Frontend | UI moderna, TypeScript e integração com APIs |
| 11 | Microservices | Serviços distribuídos, filas, gateway e resiliência |
| 12 | Cloud | Docker, deploy, CI/CD e cloud |
| 13 | System Design | Escalabilidade, cache, filas e trade-offs |
| 14 | Design Patterns | Padrões criacionais, estruturais e comportamentais |

## Projetos de Portfólio

Os projetos ficam em `projects/` e seguem o mesmo padrão profissional: `backend/`, `frontend/`, `docs/`, `docker/`, `docker-compose.yml`, `Makefile` e documentação arquitetural.

1. ERP Lite
2. E-commerce
3. Plataforma Educacional
4. Sistema Financeiro
5. Chat Realtime
6. SaaS Multitenant
7. API Gateway Ecosystem
8. Sistema de Filas
9. Observabilidade
10. Sistema Distribuído

## Como Começar

1. Leia [QUICK_START.md](QUICK_START.md).
2. Abra [01-java-fundamentals](01-java-fundamentals/README.md).
3. Estude a teoria.
4. Execute os exemplos.
5. Resolva os exercícios.
6. Faça o mini projeto.
7. Rode os testes.
8. Faça commits pequenos e bem descritos.

## Fluxo Profissional

- Issues usam os templates em `.github/ISSUE_TEMPLATE/`.
- Pull requests usam `.github/pull_request_template.md`.
- Labels ficam documentadas em `.github/labels.yml`.
- O board recomendado está em `.github/project-board.yml`.
- Validação local: `./scripts/validation/validate-structure.ps1`.
- Commits seguem [COMMITS_CONVENTION.md](COMMITS_CONVENTION.md).

## Documentação

- [INDEX.md](INDEX.md): índice geral.
- [ROADMAP.md](ROADMAP.md): plano detalhado.
- [CONTRIBUTING.md](CONTRIBUTING.md): guia de contribuição.
- [ARCHITECTURE_PATTERN.md](ARCHITECTURE_PATTERN.md): padrão de arquitetura.
- [docs/roadmap/repository-structure.md](docs/roadmap/repository-structure.md): estrutura profissional.
- [docs/setup/github-project.md](docs/setup/github-project.md): board e fluxo GitHub.

## Qualidade

O repositório inclui:

- GitHub Actions para Java, Markdown e saúde do projeto;
- Dependabot para GitHub Actions, Maven e npm;
- templates de issue e pull request;
- estrutura padronizada por módulo e projeto;
- política de segurança, licença MIT e código de conduta.

## Status

Em desenvolvimento ativo. O primeiro módulo real é `01-java-fundamentals`, com teoria, exemplos compiláveis, exercícios e mini projeto inicial.
