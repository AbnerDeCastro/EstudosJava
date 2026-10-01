public class Main {
    public static String verificarIdade(int idade){
        if (idade < 18){
            return "Você é menor de idade.";
        }
        else {
            return "Você é maior de idade.";
        }
    }
    public  static void main(String[] args) {
        System.out.println(verificarIdade(15));
        System.out.println(verificarIdade(18));
        System.out.println(verificarIdade(25));
    }
}