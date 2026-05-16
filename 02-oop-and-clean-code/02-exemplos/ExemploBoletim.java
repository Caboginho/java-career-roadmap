public class ExemploBoletim {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Silva");
        Disciplina logica = new Disciplina("Lógica de Programação");

        logica.adicionarNota(8.5);
        logica.adicionarNota(9.0);
        logica.adicionarNota(7.5);

        System.out.println("Aluno: " + aluno.getNomeCompleto());
        System.out.println("Disciplina: " + logica.getNome());
        System.out.printf("Média: %.2f%n", logica.calcularMedia());
    }
}
