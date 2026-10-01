public class Main {
    public static int calcularMaior(int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        int maior = calcularMaior(2,3);
        int maior2 = calcularMaior(10,5);
        int maior3 = calcularMaior(7,7);
        System.out.println("O maior é o : "+maior);
        System.out.println("O maior2 : "+maior2);
        System.out.println("O maior3 : "+maior3);
    }
}
