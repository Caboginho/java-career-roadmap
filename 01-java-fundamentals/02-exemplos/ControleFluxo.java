public class ControleFluxo {
    public static void main(String[] args) {
        int nota = 87;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteudo");
        }

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("7 x " + multiplicador + " = " + (7 * multiplicador));
        }
    }
}
