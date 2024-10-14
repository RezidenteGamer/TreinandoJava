public class GeradorDeSenha {
    public static void main(String[] args) {
        int tamanho = 8;
        String senha = gerarSenha(tamanho);
      
        System.out.println("Senha gerada: " + senha);
    }
    public static String gerarSenha(int tamanho) {
        String senha = "";
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        for (int i = 0; i < tamanho; i++) {
            int indice = (int)(Math.random() * caracteres.length());
            senha += caracteres.charAt(indice);
        }

        return senha;

    }
}