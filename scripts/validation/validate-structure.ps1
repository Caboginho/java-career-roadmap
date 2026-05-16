$ErrorActionPreference = "Stop"

$requiredFiles = @(
  "README.md",
  "ROADMAP.md",
  "INDEX.md",
  "MODULO_TEMPLATE.md",
  "LICENSE",
  "CODE_OF_CONDUCT.md",
  "CONTRIBUTING.md",
  "SECURITY.md",
  "CHANGELOG.md",
  ".gitignore"
)

$modules = @(
  "01-java-fundamentals",
  "02-oop-and-clean-code",
  "03-data-structures",
  "04-java-moderno",
  "05-databases",
  "06-spring-boot",
  "07-security",
  "08-jpa-hibernate",
  "09-testing",
  "10-react-frontend",
  "11-microservices",
  "12-cloud",
  "13-system-design",
  "14-design-patterns"
)

$projects = @(
  "projects/01-erp-lite",
  "projects/02-ecommerce",
  "projects/03-plataforma-educacional",
  "projects/04-sistema-financeiro",
  "projects/05-chat-realtime",
  "projects/06-saas-multitenant",
  "projects/07-api-gateway-ecosystem",
  "projects/08-sistema-filas",
  "projects/09-observabilidade",
  "projects/10-sistema-distribuido"
)

foreach ($file in $requiredFiles) {
  if (!(Test-Path $file)) {
    throw "Missing required file: $file"
  }
}

foreach ($module in $modules) {
  if (!(Test-Path $module)) {
    throw "Missing module: $module"
  }

  foreach ($child in @("01-teoria", "02-exemplos", "03-exercicios/01-basico", "03-exercicios/02-intermediario", "03-exercicios/03-avancado", "04-mini-projetos", "05-diagramas", "06-testes", "07-solutions", "README.md")) {
    $path = Join-Path $module $child
    if (!(Test-Path $path)) {
      throw "Missing module item: $path"
    }
  }
}

foreach ($project in $projects) {
  foreach ($child in @("backend", "frontend", "docs", "docker", "README.md", "docker-compose.yml", "Makefile")) {
    $path = Join-Path $project $child
    if (!(Test-Path $path)) {
      throw "Missing project item: $path"
    }
  }
}

foreach ($supportPath in @(
  "notes/java-notes",
  "notes/architecture-notes",
  "notes/backend-notes",
  "notes/frontend-notes",
  "diagrams/er",
  "diagrams/architecture",
  "diagrams/microservices",
  "diagrams/deployments",
  "portfolio/screenshots",
  "portfolio/demos",
  "portfolio/presentations",
  "portfolio/case-studies",
  "docs/setup",
  "docs/architecture",
  "docs/api",
  "docs/database",
  "docs/deployment",
  "docs/diagrams",
  "docs/conventions",
  "docs/decisions",
  "docs/roadmap",
  "scripts/setup",
  "scripts/automation",
  "scripts/validation"
)) {
  if (!(Test-Path $supportPath)) {
    throw "Missing support path: $supportPath"
  }
}

Write-Host "Repository structure is valid."
