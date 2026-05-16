import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disciplina {
    private final String nome;
    private final List<Double> notas = new ArrayList<>();

    public Disciplina(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da disciplina é obrigatório.");
        }
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        validarNota(nota);
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double somaDasNotas = 0.0;
        for (double nota : notas) {
            somaDasNotas += nota;
        }
        return somaDasNotas / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return Collections.unmodifiableList(notas);
    }

    private void validarNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
    }
}
