public class CalculadoraMediasTest {
    public static void main(String[] args) {
        deveCalcularMedia();
        deveClassificarMedia();
        deveRejeitarNotaInvalida();
        System.out.println("Todos os testes passaram.");
    }

    static void deveCalcularMedia() {
        double media = CalculadoraMedias.calcularMedia(new double[] {8.0, 7.0, 9.0});
        assert media == 8.0 : "Media deveria ser 8.0";
    }

    static void deveClassificarMedia() {
        assert "excelente".equals(CalculadoraMedias.classificar(9.5));
        assert "aprovado".equals(CalculadoraMedias.classificar(8.0));
        assert "recuperacao".equals(CalculadoraMedias.classificar(6.0));
        assert "reprovado".equals(CalculadoraMedias.classificar(4.0));
    }

    static void deveRejeitarNotaInvalida() {
        boolean lancouExcecao = false;
        try {
            CalculadoraMedias.calcularMedia(new double[] {11.0});
        } catch (IllegalArgumentException exception) {
            lancouExcecao = true;
        }
        assert lancouExcecao : "Nota invalida deveria lancar excecao";
    }
}
