public class AplicacaoBoletimEscolar {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Silva", "2026-001");

        Disciplina javaFundamentos = new Disciplina("Java Fundamentos");
        javaFundamentos.adicionarNota(8.5);
        javaFundamentos.adicionarNota(9.0);
        javaFundamentos.adicionarNota(8.0);

        Disciplina oopCleanCode = new Disciplina("OOP e Clean Code");
        oopCleanCode.adicionarNota(9.5);
        oopCleanCode.adicionarNota(9.0);
        oopCleanCode.adicionarNota(10.0);

        BoletimEscolar boletim = new BoletimEscolar(aluno);
        boletim.adicionarDisciplina(javaFundamentos);
        boletim.adicionarDisciplina(oopCleanCode);

        RelatorioBoletim relatorioBoletim = new RelatorioBoletim();
        System.out.println(relatorioBoletim.gerar(boletim));
    }
}
