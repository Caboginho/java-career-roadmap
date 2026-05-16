# Scripts de Validação

Scripts para validar estrutura, documentação, projetos e convenções do repositório.

Use esta pasta como uma espécie de portão de qualidade local antes de abrir PR, fazer commit importante ou publicar uma nova etapa do roadmap.

## Validação de Estrutura

```powershell
./scripts/validation/validate-structure.ps1
```

## O que o script verifica

- arquivos obrigatórios da raiz;
- módulos numerados de `01` a `14`;
- estrutura padrão de cada módulo;
- projetos flagship em `projects/`;
- pastas de suporte como `docs/`, `notes/`, `portfolio/` e `diagrams/`.

## Próximas Validações Planejadas

- compilar exemplos Java de cada módulo;
- rodar testes sem framework nos módulos iniciais;
- validar links internos de Markdown;
- validar presença de README em cada pasta relevante.
