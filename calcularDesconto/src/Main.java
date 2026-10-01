public class Main {
    public static double calcularDesconto(double preco){
    if (preco >= 100){
        return preco-(preco*0.1);
    }
    else {
        return preco;
    }
    }
    public static void main(String[] args) {
        System.out.println(calcularDesconto(150));
        System.out.println(calcularDesconto(80));
        System.out.println(calcularDesconto(100));
    }

}