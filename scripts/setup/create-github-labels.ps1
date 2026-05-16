param(
  [Parameter(Mandatory = $true)]
  [string] $Repository,

  [Parameter(Mandatory = $true)]
  [string] $Token
)

$ErrorActionPreference = "Stop"

if (!(Test-Path ".github/labels.yml")) {
  throw "Arquivo .github/labels.yml nao encontrado."
}

$content = Get-Content ".github/labels.yml"
$labels = @()
$current = $null

foreach ($line in $content) {
  if ($line -match '^\s+- name:\s*(.+)$') {
    if ($null -ne $current) {
      $labels += $current
    }
    $current = @{
      name = ($Matches[1] -replace '"', '').Trim()
    }
  }
  elseif ($line -match '^\s+color:\s*"?(.*?)"?\s*$' -and $null -ne $current) {
    $current.color = $Matches[1].Trim()
  }
  elseif ($line -match '^\s+description:\s*(.+)$' -and $null -ne $current) {
    $current.description = ($Matches[1] -replace '"', '').Trim()
  }
}

if ($null -ne $current) {
  $labels += $current
}

$headers = @{
  Authorization = "Bearer $Token"
  Accept = "application/vnd.github+json"
  "X-GitHub-Api-Version" = "2022-11-28"
}

foreach ($label in $labels) {
  $body = @{
    name = $label.name
    color = $label.color
    description = $label.description
  } | ConvertTo-Json

  try {
    Invoke-RestMethod -Method Post -Uri "https://api.github.com/repos/$Repository/labels" -Headers $headers -Body $body -ContentType "application/json" | Out-Null
    Write-Host "Created label: $($label.name)"
  }
  catch {
    $patchBody = @{
      new_name = $label.name
      color = $label.color
      description = $label.description
    } | ConvertTo-Json

    $encodedName = [uri]::EscapeDataString($label.name)
    Invoke-RestMethod -Method Patch -Uri "https://api.github.com/repos/$Repository/labels/$encodedName" -Headers $headers -Body $patchBody -ContentType "application/json" | Out-Null
    Write-Host "Updated label: $($label.name)"
  }
}
