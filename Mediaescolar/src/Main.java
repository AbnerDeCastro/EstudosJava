public class Main {
    public static double calcularMedia(double nota1,double nota2,double nota3){
        return (nota1 + nota2 + nota3)/3;
    }
    public static String verificarAprovacao(double media){
        if (media>=7){
            return "Aprovado";
        } else if (media>= 5) {
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }
    public static void main(String[] args) {
    double media = calcularMedia(8.5, 6.0, 4.0);
    System.out.println(verificarAprovacao(media));
    }
}