# Módulo 01 - Java Fundamentals

Este módulo transforma fundamentos em prática: sintaxe, tipos, operadores, condicionais, loops, métodos, arrays, entrada/saída e debugging básico.

## Objetivo

Ao final, você deve conseguir escrever pequenos programas Java sem framework, decompor lógica em métodos, validar entradas simples e testar funções puras.

## Pré-requisitos

- JDK 21 instalado.
- Terminal funcionando.
- Editor ou IDE Java.

Verifique:

```powershell
java -version
javac -version
```

## Conteúdo

```text
01-java-fundamentals/
├── 01-teoria/
├── 02-exemplos/
├── 03-exercicios/
├── 04-mini-projetos/
├── 05-diagramas/
├── 06-testes/
└── 07-solutions/
```

## Ordem de Estudo

1. Leia [01-teoria/01-fundamentos-java.md](01-teoria/01-fundamentos-java.md).
2. Compile e execute os exemplos em `02-exemplos/`.
3. Resolva os exercícios em `03-exercicios/`.
4. Implemente ou modifique o mini projeto em `04-mini-projetos/calculadora-medias/`.
5. Rode o teste em `06-testes/`.

## Como Compilar os Exemplos

```powershell
javac 01-java-fundamentals/02-exemplos/HelloWorld.java
java -cp 01-java-fundamentals/02-exemplos HelloWorld
```

Compile todos os exemplos:

```powershell
javac 01-java-fundamentals/02-exemplos/*.java
```

## Mini Projeto: Calculadora de Médias

Compilar:

```powershell
javac -d out 01-java-fundamentals/04-mini-projetos/calculadora-medias/CalculadoraMedias.java
```

Executar:

```powershell
java -cp out CalculadoraMedias
```

## Teste Sem Framework

Este primeiro módulo usa `assert` nativo para manter a barreira de entrada baixa.

```powershell
javac -d out 01-java-fundamentals/04-mini-projetos/calculadora-medias/CalculadoraMedias.java 01-java-fundamentals/06-testes/CalculadoraMediasTest.java
java -ea -cp out CalculadoraMediasTest
```

## Checklist de Conclusão

- [ ] Entendi variáveis, tipos e operadores.
- [ ] Escrevi condicionais com `if`, `else` e `switch`.
- [ ] Usei `for`, `while` e `do while`.
- [ ] Criei métodos pequenos com retorno claro.
- [ ] Trabalhei com arrays.
- [ ] Compilei todos os exemplos.
- [ ] Resolvi os exercícios básicos.
- [ ] Rodei o teste da calculadora de médias.
- [ ] Fiz um commit com meu progresso.

## Próximo Módulo

Depois deste módulo, avance para [02-oop-and-clean-code](../02-oop-and-clean-code/README.md).
