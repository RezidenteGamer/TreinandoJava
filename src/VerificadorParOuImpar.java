public class VerificadorParOuImpar {
    public static void main(String[] args) {
        int numero = 8;

        verificarParOuImpar(numero);

    }
    public static void verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
