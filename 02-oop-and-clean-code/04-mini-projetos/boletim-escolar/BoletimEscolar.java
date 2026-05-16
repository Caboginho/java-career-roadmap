import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoletimEscolar {
    private final Aluno aluno;
    private final List<Disciplina> disciplinas = new ArrayList<>();

    public BoletimEscolar(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Boletim precisa estar associado a um aluno.");
        }
        this.aluno = aluno;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina não pode ser nula.");
        }
        disciplinas.add(disciplina);
    }

    public double calcularMediaGeral() {
        if (disciplinas.isEmpty()) {
            return 0.0;
        }

        double somaDasMedias = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaDasMedias += disciplina.calcularMedia();
        }
        return somaDasMedias / disciplinas.size();
    }

    public String classificarResultadoFinal() {
        double mediaGeral = calcularMediaGeral();

        if (mediaGeral >= 9.0) {
            return "excelente";
        }
        if (mediaGeral >= 7.0) {
            return "aprovado";
        }
        if (mediaGeral >= 5.0) {
            return "recuperação";
        }
        return "reprovado";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public List<Disciplina> getDisciplinas() {
        return Collections.unmodifiableList(disciplinas);
    }
}
