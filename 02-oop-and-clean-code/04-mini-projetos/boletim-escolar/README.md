# Mini Projeto - Boletim Escolar

Este mini projeto reaproveita o tema de notas do módulo 01, mas agora com orientação a objetos.

## Objetivo

Modelar um boletim escolar simples com classes pequenas, nomes claros e responsabilidades separadas.

## Classes

- `Aluno`: guarda nome e matrícula.
- `Disciplina`: guarda nome e notas, validando cada nota adicionada.
- `BoletimEscolar`: liga aluno e disciplinas, calcula média geral e resultado final.
- `RelatorioBoletim`: gera texto de apresentação.
- `AplicacaoBoletimEscolar`: monta o fluxo da aplicação.

## Fluxo

```text
AplicacaoBoletimEscolar
  cria Aluno
  cria Disciplinas
  adiciona Notas
  monta BoletimEscolar
  gera RelatorioBoletim
```

## Executar

```powershell
$saida = Join-Path $env:TEMP "roadmap-modulo-02-boletim"
cmd /c "if not exist `"$saida`" mkdir `"$saida`""
javac -d $saida 02-oop-and-clean-code/04-mini-projetos/boletim-escolar/*.java
java -cp $saida AplicacaoBoletimEscolar
```
