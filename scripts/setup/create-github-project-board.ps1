param(
  [Parameter(Mandatory = $true)]
  [string] $Owner,

  [Parameter(Mandatory = $true)]
  [string] $Token
)

$ErrorActionPreference = "Stop"

$projectName = "Java Career Roadmap - Development"
$headers = @{
  Authorization = "Bearer $Token"
  Accept = "application/vnd.github+json"
}

$viewerQuery = @{
  query = "query { viewer { login id } organization(login: `"$Owner`") { id } }"
} | ConvertTo-Json

$viewer = Invoke-RestMethod -Method Post -Uri "https://api.github.com/graphql" -Headers $headers -Body $viewerQuery -ContentType "application/json"
$ownerId = $viewer.data.organization.id

if ([string]::IsNullOrWhiteSpace($ownerId)) {
  $ownerId = $viewer.data.viewer.id
}

$mutation = @"
mutation {
  createProjectV2(input: { ownerId: "$ownerId", title: "$projectName" }) {
    projectV2 {
      id
      title
      url
    }
  }
}
"@

$body = @{ query = $mutation } | ConvertTo-Json
$result = Invoke-RestMethod -Method Post -Uri "https://api.github.com/graphql" -Headers $headers -Body $body -ContentType "application/json"

Write-Host "Created project board: $($result.data.createProjectV2.projectV2.title)"
Write-Host $result.data.createProjectV2.projectV2.url
