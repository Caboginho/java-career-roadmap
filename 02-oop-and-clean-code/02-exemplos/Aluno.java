public class Aluno {
    private final String nomeCompleto;

    public Aluno(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.isBlank()) {
            throw new IllegalArgumentException("Nome do aluno é obrigatório.");
        }
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
