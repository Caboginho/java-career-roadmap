public class MetodosArrays {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 16, 23, 42};

        System.out.println("Soma: " + somar(numeros));
        System.out.println("Maior: " + encontrarMaior(numeros));
    }

    static int somar(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }

    static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}
