# Estrutura Profissional do Repositorio

Este repositorio foi organizado para funcionar como projeto open source serio, laboratorio de engenharia, plataforma educacional e portfolio enterprise.

## Estrutura Principal

```text
java-career-roadmap/
├── .github/
│   ├── ISSUE_TEMPLATE/
│   ├── workflows/
│   ├── pull_request_template.md
│   └── dependabot.yml
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
├── notes/
├── diagrams/
├── certificates/
├── portfolio/
├── docs/
├── scripts/
├── README.md
├── ROADMAP.md
├── INDEX.md
└── MODULO_TEMPLATE.md
```

## Modulos

Cada modulo deve seguir a estrutura padrao:

```text
module/
├── 01-teoria/
├── 02-exemplos/
├── 03-exercicios/
│   ├── 01-basico/
│   ├── 02-intermediario/
│   └── 03-avancado/
├── 04-mini-projetos/
├── 05-diagramas/
├── 06-testes/
├── 07-solutions/
└── README.md
```

## Projetos

Cada projeto de portfolio deve seguir a estrutura:

```text
project/
├── backend/
├── frontend/
├── docs/
│   ├── architecture.md
│   ├── database.md
│   ├── api.md
│   ├── deployment.md
│   └── decisions/
├── docker/
├── .github/
├── README.md
├── docker-compose.yml
└── Makefile
```

## Pastas de Suporte

- `notes/`: anotacoes por area de estudo.
- `diagrams/`: diagramas ER, arquitetura, microsservicos e deploy.
- `certificates/`: certificados e evidencias de estudo.
- `portfolio/`: screenshots, demos, apresentacoes e case studies.
- `docs/`: documentacao tecnica central do repositorio.
- `scripts/`: automacoes de setup, validacao e manutencao.
