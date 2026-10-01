public class Saudacao {
    public static String criarSaudacao(String nome){
        return "Olá," +nome + "!";
    }
    public static void main(String[] args) {
        String mensagem = criarSaudacao("Abner");
        System.out.println(mensagem);
    }
}