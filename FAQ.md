# ❓ FAQ - Java Career Roadmap

Respostas rápidas para perguntas comuns.

---

## 🛠️ Instalação & Setup

### P: Como instalar JDK 21?

**R:**
```bash
# Windows
choco install openjdk21
# ou baixe em: https://jdk.java.net/21

# macOS
brew install openjdk@21

# Linux (Ubuntu)
sudo apt-get install openjdk-21-jdk

# Verificar
java -version
```

### P: Qual IDE devo usar?

**R:** Qualquer uma funciona!

| IDE | Custo | Recomendação |
|-----|-------|--------------|
| IntelliJ IDEA Community | Grátis | ⭐⭐⭐⭐⭐ Melhor |
| VS Code | Grátis | ⭐⭐⭐⭐ Ótima |
| Eclipse | Grátis | ⭐⭐⭐ Boa |
| NetBeans | Grátis | ⭐⭐⭐ Boa |

**Para este roadmap, use IntelliJ Community (melhor experiência)**.

### P: Preciso de Maven/Gradle já?

**R:** Não no Módulo 1!

```
Módulo 1-3: Sem build tools (Java puro)
Módulo 4: Aprenda Gradle ou Maven
Módulo 5+: Use Maven nos projetos
```

### P: E versão Python/Node.js?

**R:** Não precisa! Java 21+ é tudo que precisa.

(Exceto se for fazer projetos com fullstack - aí precisa Node.js para React)

---

## 📚 Aprendizado

### P: Quanto tempo cada módulo leva?

**R:** Varie segundo sua dedicação:

```
Dedicação | Módulo 1 | Total (14 mods)
-----------|----------|----------
4h/dia    | 2-3 sem  | 8-12 meses
2h/dia    | 4-6 sem  | 14-18 meses
1h/dia    | 8-12 sem | 24-30 meses
```

### P: Posso pular módulos?

**R:** ⚠️ Não recomendo!

```
❌ Pular teoria → Vai se perder depois
❌ Pular exercícios → Não aprende
❌ Pular mini projetos → Sem portfólio

✅ Fazer em ordem
✅ Fazer TODOS exercícios
✅ Fazer TODOS mini projetos
```

### P: Preciso memorizar tudo?

**R:** Não! Memória é skill secundária.

**Importante**:
- ✅ Entender conceitos
- ✅ Saber onde procurar
- ✅ Saber implementar
- ❌ Memorizar sintaxe exata

### P: Qual velocidade é boa?

**R:** Consistência > Velocidade!

```
✅ 1h/dia por 1 ano = 365h aprendizado
❌ 10h/dia por 1 mês = 300h + burnout

✅ Regular e sustentável
❌ Esgotado em 3 meses
```

### P: E se ficar preso em um exercício?

**R:** Passo a passo:

1. **Releia** a teoria (solução está ali)
2. **Veja** exemplos similares
3. **Google** o erro específico
4. **Debugue** passo a passo (IDE tem debugger)
5. **Pergunte** no Stack Overflow
6. **Durma** sobre (criatividade volta)
7. **Skip** se muito difícil (volta depois)

### P: Devo seguir outras tutoriais?

**R:** Sim, mas seja inteligente:

```
✅ Usar tutoriais PARA complementar
❌ Usar tutoriais EM LUGAR DE estudar

Exemplo bom:
- Aprenda teoria em 01-teoria/
- Procure video no YouTube
- Veja exemplo aqui
- Faça exercício

Exemplo ruim:
- Só assista videos
- Não faça exercícios
- Pule para próximo módulo
```

---

## 💻 Codificação

### P: Meu código não compila. E agora?

**R:** 99% dos erros têm **solution no erro message**:

```java
// Erro comum
Error: incompatible types: int cannot be converted to String

// IDE mostra linha exata
// IDE sugere fix
// Use Fix (Ctrl+1 em IntelliJ)
```

**Dicas**:
1. Leia a **linha do erro** (primeira número)
2. Procure **palavra vermelha** no código
3. IDE sugere fix automático
4. Google o **tipo do erro**

### P: Como debugar código?

**R:** Use o Debugger da IDE (melhor skill de dev):

```java
// Marque breakpoint
public static void main(String[] args) {
    int x = 5;  // ← Clique na margem para breakpoint
    int y = 10;
    System.out.println(x + y);
}

// Aperte "Debug" em vez de "Run"
// Code para no breakpoint
// Veja valores das variáveis
// Use "Step Over" para avanço linha
// Use "Step Into" para entrar em methods
```

### P: Quando usar arrays vs Lists?

**R:** Simplificado:

```java
// Arrays - tamanho fixo
int[] numbers = new int[10];  // Sempre 10 elementos

// Lists - tamanho dinâmico
List<Integer> numbers = new ArrayList<>();  // Cresce

// Regra prática
✅ Arrays para tamanho conhecido
✅ Lists para tamanho variável
```

Aprenderá em Módulo 3.

### P: String with == ou equals()?

**R:** Use **equals()**!

```java
// ❌ NUNCA use ==
String a = "hello";
String b = "hello";
if (a == b) { }  // Pode não funcionar!

// ✅ SEMPRE use equals()
if (a.equals(b)) { }  // Funciona sempre!

// ✅ Ou equalsIgnoreCase()
if (a.equalsIgnoreCase(b)) { }  // Case-insensitive
```

### P: Como escrever código "clean"?

**R:** Regras simples:

```java
// ❌ Ruim
int a = 5;
int b = 10;
int c = a + b;
System.out.println(c);

// ✅ Bom
int sum = firstNumber + secondNumber;
System.out.println("Soma: " + sum);
```

**Dicas**:
- Use nomes descritivos
- Um método = uma responsabilidade
- Máximo 20 linhas por method
- Indentação consistente
- Adicione comentários em lógica complexa

---

## 🧪 Testes

### P: Quando começar a escrever testes?

**R:** Idealmente desde o Módulo 1!

```java
// Teste simples
@Test
public void testAddition() {
    int result = 5 + 3;
    assertEquals(8, result);
}
```

Aprenderá proper testing no Módulo 9.

### P: Como rodar testes?

**R:** Depende da IDE/Build tool:

```bash
# Maven
mvn test

# Gradle
gradle test

# IDE
Clique direito no arquivo → Run Tests
```

---

## 🚀 GitHub & Commits

### P: Como fazer commit profissional?

**R:** Use Conventional Commits:

```bash
# ❌ Ruim
git commit -m "fix"
git commit -m "updated code"

# ✅ Bom
git commit -m "feat(module-1): add array exercises

- Add 20 array manipulation exercises
- Include solution guide
- Add test cases"
```

Veja: [COMMITS_CONVENTION.md](COMMITS_CONVENTION.md)

### P: Como fazer PR?

**R:** Passo a passo:

```bash
# 1. Crie branch
git checkout -b feat/module-1-exercises

# 2. Faça commits
git add exercicio01.java
git commit -m "feat(module-1): implement exercise 01"

# 3. Push
git push origin feat/module-1-exercises

# 4. Abra PR no GitHub (UI)
# Título: "feat: Complete Module 1 Exercises"
# Descrição: "Adiciona 30 exercícios resolvidos"

# 5. Merge após review
```

### P: Preciso de fork ou posso usar main?

**R:** Use branches profissionais:

```bash
# ✅ Profissional
git checkout -b feat/module-1
git commit -m "feat: ..."
# Depois merge para main

# ❌ Amador
git commit direto em main
```

### P: Como estruturar PR?

**R:** Template recomendado:

```markdown
## 🎯 Descrição
O que foi feito.

## 📝 Tipo
- [x] Novo módulo
- [ ] Fix
- [ ] Documentação

## ✅ Checklist
- [x] Código segue padrões
- [x] Documentação atualizada
- [x] Testes passam

## 🔗 Relacionado
Closes #123
```

---

## 📊 Projeto & Portfólio

### P: Como usar isso para portfólio?

**R:** Mostrar para recrutadores:

1. **Link do GitHub** (este repo)
2. **README profissional** (já tem aqui)
3. **Commits convencionais** (mostra profissionalismo)
4. **10 Projetos completos** (prova de skill)
5. **Documentação** (enterprise-grade)

### P: Quando começar projetos?

**R:** Cronograma recomendado:

```
Módulo 1-2  → Pequenos exercícios
Módulo 3-4  → Mini projetos simples
Módulo 5-6  → Projetos médios (Backend)
Módulo 10-11 → Full stack projects
Projeto 1 → Após Módulo 6 (Spring Boot)
```

### P: Como estruturar um projeto?

**R:** Use template:

```
projeto-1-erp/
├── backend/          # Spring Boot
├── frontend/         # React
├── docs/             # Documentação
├── docker-compose.yml
├── README.md
└── .github/workflows/  # CI/CD
```

Veja: [ARCHITECTURE_PATTERN.md](ARCHITECTURE_PATTERN.md)

### P: Devo fazer projetos sozinho ou com template?

**R:** Gradualmente:

```
Projeto 1: Use 80% template (aprender padrões)
Projeto 2: Use 50% template
Projeto 3: Use 20% template
Projeto 4+: Do zero (seu design)
```

---

## 🎯 Motivation & Progress

### P: Estou desmotivado. E agora?

**R:** Normal! Dica:

```
✅ Divida em metas pequenas (1 exercício/dia)
✅ Veja progresso (git log)
✅ Compartilhe avanços (amigos/Twitter)
✅ Pequenas vitórias (celebre exercício 10!)
✅ Mude ambiente (café, biblioteca)
✅ Assista progress video no YouTube
❌ Tente forçar 10h/dia
❌ Pule para tópicos "interessantes"
```

### P: Estou preso faz 1 semana no Módulo 2!

**R:** Comum! Passo:

1. **Faça pause** (repouso mental é importante)
2. **Revise teoria** (escrevendo em papel)
3. **Ensine alguém** (explique conceito)
4. **Mude perspectiva** (veja vídeo sobre mesmo tema)
5. **Mude ambiente** (biblioteca vs casa)
6. **Skip e volta** (continue para próximo, volta depois)

### P: Quanto tempo até ser "profissional"?

**R:** Depende:

```
Após Módulo 6:   Consegue dev job (junior)
Após Módulo 10:  Consegue fullstack job
Após Projetos 5: Consegue mid-level job
```

**Importante**: Além de aprender, pratique:
- GitHub contributions
- Tech blogs/Medium
- Stack Overflow respostas
- Projetos pessoais
- Certificações (Oracle)

---

## 🔒 Segurança & Boas Práticas

### P: Onde armazeno senhas?

**R:** ⚠️ NUNCA em código!

```java
// ❌ ERRADO
String password = "admin123";
String dbUrl = "jdbc:mysql://localhost:3306";

// ✅ CERTO
String password = System.getenv("DB_PASSWORD");
String dbUrl = System.getenv("DB_URL");

// Arquivo: .env (add em .gitignore!)
DB_PASSWORD=secret123
DB_URL=jdbc:mysql://localhost:3306
```

### P: Como estruturar projeto seguro?

**R:** Básico desde início:

```java
// Validação de input
if (password.length() < 8) {
    throw new IllegalArgumentException("Password too short");
}

// Não confie em input de user
String query = "SELECT * FROM users WHERE id = ?";  // ✅ Prepared statement
// Não: "SELECT * FROM users WHERE id = " + id;  // ❌ SQL injection!

// Hash de senhas
String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
```

Aprenderá em Módulo 7 (Security).

---

## 📚 Recursos Adicionais

### P: Quais livros devo ler?

**R:** Recomendações (opcionais):

1. **"Clean Code"** - Robert Martin (melhor prática)
2. **"Effective Java"** - Joshua Bloch (intermediário)
3. **"The Pragmatic Programmer"** - Hunt & Thomas (filosofia)
4. **"Design Patterns"** - Gang of Four (avançado)

Mas `code mais, leia menos`. Aprenda codificando!

### P: Certificações valem a pena?

**R:** Sim, mas depois!

```
Ordem recomendada:
1. Complete este roadmap (melhor educação)
2. Trabalhe 1-2 anos
3. Faça certificação Oracle (OCJP)
4. Continue aprendendo
```

### P: Preciso saber Kubernetes/Docker já?

**R:** Não!

```
Módulo 12: Aprenderá Docker
Módulo 13: Aprenderá CI/CD
Depois: Kubernetes (avançado)
```

---

## 🆘 Situações Especiais

### P: Já sou dev em outra linguagem. Quanto tempo?

**R:** Mais rápido!

```
Sem experiência    → 12-18 meses
Dev em Python      → 8-10 meses
Dev em C#/Go       → 6-8 meses
Dev em JavaScript  → 4-6 meses
```

Pule exercícios básicos se entender conceito.

### P: Tenho 2 horas/semana. Conseguiço?

**R:** Sim, mas vai levar tempo:

```
2h/semana = 8-10 horas/mês
14 módulos × 40 horas = 560 horas
560 ÷ 8 = 70 meses (5.8 anos)

Melhor: Tente 5-10h/semana se possível!
```

### P: Já começei roadmap diferente. Devo mudar?

**R:** Depende:

```
Se já fez 2+ módulos → Continue seu roadmap
Se fez < 1 módulo → Mude para este (mais estruturado)
```

Mas este é mais profissional!

---

## 🚀 Success Stories

### P: Alguém conseguiu se colocar fazendo isto?

**R:** Sim! Padrão comum:

```
Mês 6:  Consegue intern/junior role
Mês 12: Consegue junior full-time dev
Mês 24: Mid-level developer
```

**Condição**: Fazer exercícios + projetos + GitHub ativo

---

## 📞 Ainda Com Dúvidas?

1. **Procure em**: Documentação deste roadmap
2. **Procure em**: Stack Overflow (99% de chance resposta existe)
3. **Procure em**: GitHub Issues deste repositório
4. **Pergunte em**: Dev communities (Reddit r/learnprogramming)
5. **Converse em**: Discord communities (Java Discord)

---

## 🎓 Filosofia Final

> "O segredo do sucesso é fazer diariamente aquilo que outros não querem fazer."
> — Mark Cuban

Não é roadmap mágico. É **trabalho consistente**.

- ✅ 1 hora/dia >>> 10 horas/semana
- ✅ Todos os exercícios >>> Pular alguns
- ✅ Entender >>> Memorizar
- ✅ Fazer projetos >>> Só teoria
- ✅ GitHub profissional >>> "local learning"

**Você consegue! 💪**

---

**Última atualização**: 2026-05-16

Dúvida não coberta aqui? 
→ Abra uma [Issue no GitHub](../../issues) ou procure em comunidades de dev!

