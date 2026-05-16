# OOP e Clean Code em Java

No módulo 01, a média de notas foi calculada com métodos e arrays. Aqui, o mesmo domínio ganha objetos. Isso é uma evolução natural: quando o programa começa a ter regras, dados relacionados e fluxo mais rico, classes ajudam a organizar o pensamento.

## De Funções para Objetos

Código procedural responde bem a perguntas pequenas:

```text
Qual é a média dessas notas?
```

Código orientado a objetos começa a representar conceitos do domínio:

```text
Aluno tem nome.
Disciplina tem notas.
Boletim pertence a um aluno.
Relatorio apresenta o resultado final.
```

## Classe e Objeto

- Classe é o modelo.
- Objeto é uma instância concreta desse modelo.

Exemplo:

```java
Aluno aluno = new Aluno("Ana Silva");
```

`Aluno` é a classe. `aluno` é o objeto usado no fluxo da aplicação.

## Encapsulamento

Encapsular significa proteger dados internos e expor comportamentos claros.

Em vez de permitir que qualquer parte do código altere notas livremente, criamos métodos com validação:

```java
disciplina.adicionarNota(8.5);
```

Assim a regra "nota deve estar entre 0 e 10" fica em um único lugar.

## Composição

Composição acontece quando um objeto é formado por outros objetos.

```text
Boletim
├── Aluno
└── Disciplinas
    ├── Matemática
    └── Português
```

Essa estrutura deixa o código mais próximo da linguagem real do problema.

## Clean Code

Neste módulo, clean code significa:

- nomes que explicam intenção;
- métodos pequenos;
- uma responsabilidade principal por classe;
- validações próximas dos dados que protegem;
- comentários para regras de negócio, não para obviedades.

## Fluxo da Aplicação

```text
Aplicacao cria aluno
Aplicacao cria boletim
Boletim recebe disciplinas
Disciplina valida e armazena notas
Boletim calcula media geral
Relatorio imprime o resultado
```

Esse fluxo é propositalmente simples para que a estrutura OOP fique visível.
