# Módulo 02 - OOP and Clean Code

Este módulo transforma lógica procedural em código orientado a objetos. Vamos reaproveitar o domínio de notas do módulo 01 e evoluir para alunos, disciplinas, boletins, serviços e relatórios.

## Objetivo

Aprender a criar classes com responsabilidades claras, encapsular dados, nomear bem variáveis e métodos, reduzir duplicação e escrever código que explique o fluxo da aplicação.

## O que você vai praticar

- classes e objetos;
- encapsulamento;
- construtores;
- métodos de domínio;
- composição entre objetos;
- separação de responsabilidades;
- comentários úteis;
- testes simples com `assert`;
- refatoração de código procedural para OOP.

## Estrutura

```text
02-oop-and-clean-code/
├── 01-teoria/
├── 02-exemplos/
├── 03-exercicios/
├── 04-mini-projetos/
├── 05-diagramas/
├── 06-testes/
└── 07-solutions/
```

## Ordem de Estudo

1. Leia [01-teoria/01-oop-clean-code.md](01-teoria/01-oop-clean-code.md).
2. Compile e execute os exemplos em `02-exemplos/`.
3. Resolva os exercícios por dificuldade.
4. Estude o mini projeto `boletim-escolar`.
5. Rode os testes.
6. Refatore: melhore nomes, reduza repetição e simplifique fluxos.

## Compilar Exemplos

```powershell
$saida = Join-Path $env:TEMP "roadmap-modulo-02-exemplos"
cmd /c "if not exist `"$saida`" mkdir `"$saida`""
javac -d $saida 02-oop-and-clean-code/02-exemplos/*.java
java -cp $saida ExemploBoletim
```

## Rodar Mini Projeto

```powershell
$saida = Join-Path $env:TEMP "roadmap-modulo-02-boletim"
cmd /c "if not exist `"$saida`" mkdir `"$saida`""
javac -d $saida 02-oop-and-clean-code/04-mini-projetos/boletim-escolar/*.java
java -cp $saida AplicacaoBoletimEscolar
```

## Rodar Testes

```powershell
$saida = Join-Path $env:TEMP "roadmap-modulo-02-testes"
cmd /c "if not exist `"$saida`" mkdir `"$saida`""
javac -d $saida 02-oop-and-clean-code/04-mini-projetos/boletim-escolar/*.java 02-oop-and-clean-code/06-testes/*.java
java -ea -cp $saida BoletimEscolarTest
```

## Checklist de Conclusão

- [ ] Sei diferenciar classe, objeto, atributo e método.
- [ ] Criei objetos com estado válido.
- [ ] Usei nomes em português que explicam o domínio.
- [ ] Separei cálculo, entidade e relatório.
- [ ] Escrevi comentários apenas onde havia fluxo importante.
- [ ] Rodei os testes com `java -ea`.
- [ ] Refatorei pelo menos um trecho para melhorar clareza.
