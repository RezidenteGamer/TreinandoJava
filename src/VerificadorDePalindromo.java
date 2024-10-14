public class VerificadorDePalindromo {
    public static void main(String[] args) {
        String palavra = "radar";

        if (verificarPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String palavra) {
        String palavraInvertida = inverterPalavra(palavra);
        return palavra.equals(palavraInvertida);
    }

    public static String inverterPalavra(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return invertida;
    }
}
