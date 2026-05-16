public class BoletimEscolarTest {
    public static void main(String[] args) {
        deveCalcularMediaDaDisciplina();
        deveCalcularMediaGeralDoBoletim();
        deveClassificarResultadoFinal();
        deveRejeitarNotaInvalida();
        System.out.println("Todos os testes do módulo 02 passaram.");
    }

    static void deveCalcularMediaDaDisciplina() {
        Disciplina disciplina = new Disciplina("Java Fundamentos");
        disciplina.adicionarNota(8.0);
        disciplina.adicionarNota(10.0);

        assert disciplina.calcularMedia() == 9.0 : "Média da disciplina deveria ser 9.0";
    }

    static void deveCalcularMediaGeralDoBoletim() {
        BoletimEscolar boletim = criarBoletimDeExemplo();

        assert boletim.calcularMediaGeral() == 8.5 : "Média geral deveria ser 8.5";
    }

    static void deveClassificarResultadoFinal() {
        BoletimEscolar boletim = criarBoletimDeExemplo();

        assert "aprovado".equals(boletim.classificarResultadoFinal()) : "Resultado deveria ser aprovado";
    }

    static void deveRejeitarNotaInvalida() {
        Disciplina disciplina = new Disciplina("OOP e Clean Code");
        boolean excecaoLancada = false;

        try {
            disciplina.adicionarNota(12.0);
        } catch (IllegalArgumentException exception) {
            excecaoLancada = true;
        }

        assert excecaoLancada : "Nota inválida deveria lançar exceção";
    }

    static BoletimEscolar criarBoletimDeExemplo() {
        Aluno aluno = new Aluno("Ana Silva", "2026-001");

        Disciplina javaFundamentos = new Disciplina("Java Fundamentos");
        javaFundamentos.adicionarNota(8.0);
        javaFundamentos.adicionarNota(8.0);

        Disciplina oopCleanCode = new Disciplina("OOP e Clean Code");
        oopCleanCode.adicionarNota(9.0);
        oopCleanCode.adicionarNota(9.0);

        BoletimEscolar boletim = new BoletimEscolar(aluno);
        boletim.adicionarDisciplina(javaFundamentos);
        boletim.adicionarDisciplina(oopCleanCode);

        return boletim;
    }
}
