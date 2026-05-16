# Scripts de Setup

Scripts para preparar ambiente local, configurar GitHub e materializar convenções do projeto.

## Scripts disponíveis

- `create-github-labels.ps1`: cria ou atualiza labels no GitHub usando `.github/labels.yml`.
- `create-github-project-board.ps1`: cria o board principal do roadmap no GitHub Projects.

## Exemplo: labels

```powershell
$env:GH_TOKEN = "seu-token"
./scripts/setup/create-github-labels.ps1 -Repository "usuario/java-career-roadmap" -Token $env:GH_TOKEN
```

## Exemplo: project board

```powershell
$env:GH_TOKEN = "seu-token"
./scripts/setup/create-github-project-board.ps1 -Owner "usuario-ou-org" -Token $env:GH_TOKEN
```

## Observação

Esses scripts exigem token com permissões adequadas no GitHub. Sem remoto GitHub, a configuração fica versionada no repositório e pronta para aplicação futura.
