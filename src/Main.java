import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade <= 12) {
            System.out.println("Você é criança");
        } else if (idade <= 17) {
            System.out.println("Você é Adolescente");
        } else if (idade <= 59) {
            System.out.println("Você é Adulto");
        } else {
            System.out.println("Você é Idoso");
        }
        input.close();
    }
}