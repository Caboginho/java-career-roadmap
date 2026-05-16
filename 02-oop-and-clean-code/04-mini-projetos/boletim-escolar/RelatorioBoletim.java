public class RelatorioBoletim {
    public String gerar(BoletimEscolar boletim) {
        StringBuilder relatorio = new StringBuilder();

        relatorio.append("Boletim Escolar").append(System.lineSeparator());
        relatorio.append("Aluno: ").append(boletim.getAluno().getNomeCompleto()).append(System.lineSeparator());
        relatorio.append("Matrícula: ").append(boletim.getAluno().getMatricula()).append(System.lineSeparator());
        relatorio.append(System.lineSeparator());

        // A apresentação fica separada das regras de cálculo para preservar clareza.
        for (Disciplina disciplina : boletim.getDisciplinas()) {
            relatorio
                .append("- ")
                .append(disciplina.getNome())
                .append(": média ")
                .append(String.format("%.2f", disciplina.calcularMedia()))
                .append(System.lineSeparator());
        }

        relatorio.append(System.lineSeparator());
        relatorio.append("Média geral: ").append(String.format("%.2f", boletim.calcularMediaGeral())).append(System.lineSeparator());
        relatorio.append("Resultado: ").append(boletim.classificarResultadoFinal()).append(System.lineSeparator());

        return relatorio.toString();
    }
}
