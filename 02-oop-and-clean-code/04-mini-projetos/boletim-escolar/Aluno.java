public class Aluno {
    private final String nomeCompleto;
    private final String matricula;

    public Aluno(String nomeCompleto, String matricula) {
        if (nomeCompleto == null || nomeCompleto.isBlank()) {
            throw new IllegalArgumentException("Nome completo do aluno é obrigatório.");
        }
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula do aluno é obrigatória.");
        }

        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }
}
