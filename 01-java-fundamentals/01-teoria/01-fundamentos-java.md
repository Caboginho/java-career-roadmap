# Fundamentos de Java

Java é uma linguagem compilada para bytecode e executada pela JVM. O fluxo básico é:

```text
Codigo fonte (.java) -> javac -> bytecode (.class) -> java/JVM -> programa em execucao
```

## Estrutura Mínima

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

- `public class HelloWorld`: declara uma classe pública.
- `main`: ponto de entrada do programa.
- `System.out.println`: escreve uma linha no console.

## Tipos Primitivos Mais Usados

| Tipo | Uso |
|---|---|
| `int` | números inteiros |
| `long` | inteiros maiores |
| `double` | números com casas decimais |
| `boolean` | verdadeiro ou falso |
| `char` | um caractere |

## Operadores

- Aritméticos: `+`, `-`, `*`, `/`, `%`.
- Comparação: `==`, `!=`, `>`, `>=`, `<`, `<=`.
- Lógicos: `&&`, `||`, `!`.

## Condicionais

Use condicionais quando o programa precisa escolher caminhos.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

## Loops

Use loops para repetir operações.

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
do  {
        int i = 10
        System.out.println(i);
        i=i-1;
    } while ( i > 0 >);

```

## Métodos

Métodos reduzem repetição e deixam a intenção clara.

```java
static double calcularMedia(double a, double b, double c) {
    return (a + b + c) / 3.0;
}
```

## Arrays

Arrays armazenam vários valores do mesmo tipo.

```java
int[] notas = {8, 9, 10};
```

## Regra de Ouro

Faça pequenos programas, compile, execute, leia o erro e ajuste. Fundamento se consolida pelo ciclo rápido de feedback.
