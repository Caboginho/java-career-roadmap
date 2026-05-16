# Plano de Implementacao Gradual

Este documento guia a construcao progressiva do repertorio do repositório. A regra é simples: cada pasta deve ganhar conteudo real, validavel e reutilizavel antes de avançarmos para a proxima camada.

## Principios

- Reutilizar ideias, fluxos e exemplos já existentes.
- Evoluir do simples para o profissional.
- Manter nomes claros e em portugues brasileiro quando o contexto for educacional.
- Separar responsabilidades em arquivos, classes e metodos pequenos.
- Documentar o motivo das decisoes, nao apenas a existencia dos arquivos.
- Validar cada etapa com scripts, compilacao ou testes simples.

## Ordem Recomendada

1. `01-java-fundamentals`: fundamentos procedurais e programas pequenos.
2. `02-oop-and-clean-code`: transformar fluxos procedurais em objetos e responsabilidades.
3. `03-data-structures`: criar estruturas próprias e reutilizar casos dos módulos anteriores.
4. `04-java-moderno`: refatorar exemplos com streams, records, optionals e APIs modernas.
5. `05-databases`: persistir dados dos mini projetos em SQL.
6. `06-spring-boot`: expor os casos de uso como APIs REST.
7. `07-security`: proteger endpoints e fluxos de autenticação.
8. `08-jpa-hibernate`: modelar entidades reais com ORM.
9. `09-testing`: ampliar testes unitários, integração e cobertura.
10. `10-react-frontend`: criar interface para consumir APIs.
11. `11-microservices`: quebrar dominios em serviços.
12. `12-cloud`: empacotar, publicar e operar.
13. `13-system-design`: documentar escalabilidade e trade-offs.
14. `14-design-patterns`: consolidar padrões recorrentes.

## Definition of Done por Pasta

- README explica objetivo, fluxo e comandos.
- Existe pelo menos um exemplo executável.
- Existem exercícios organizados por dificuldade.
- Existe mini projeto ou caso de uso.
- Existe teste, validação ou checklist objetivo.
- Variáveis e nomes ilustram o contexto da aplicação.
- Comentários explicam blocos com regra de negócio ou decisão relevante.

## Estratégia de Reuso

O repositório deve reaproveitar o mesmo domínio de forma evolutiva. Exemplo:

- Módulo 01: calcular média com métodos e arrays.
- Módulo 02: modelar aluno, disciplina e boletim com objetos.
- Módulo 05: persistir aluno e notas em banco.
- Módulo 06: expor boletins por API REST.
- Módulo 10: consumir os boletins em uma UI React.

Assim o aprendizado deixa de ser uma coleção solta de exemplos e vira uma aplicação que amadurece ao longo do roadmap.
