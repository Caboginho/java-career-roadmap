import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        double[] notas = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(notas);
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Status: " + classificar(media));
    }

    static double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            throw new IllegalArgumentException("A lista de notas nao pode estar vazia.");
        }

        double soma = 0.0;
        for (double nota : notas) {
            validarNota(nota);
            soma += nota;
        }
        return soma / notas.length;
    }

    static String classificar(double media) {
        if (media >= 9.0) {
            return "excelente";
        }
        if (media >= 7.0) {
            return "aprovado";
        }
        if (media >= 5.0) {
            return "recuperacao";
        }
        return "reprovado";
    }

    static void validarNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
    }
}
