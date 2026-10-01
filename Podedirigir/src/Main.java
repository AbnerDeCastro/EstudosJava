public class Main {
    public static boolean podeDirigir(int idade){
      if (idade >= 18){
          return true;
      }
      else {
          return false;
      }
    }
    public static void main(String[] args) {
        System.out.println(podeDirigir(17));
    }
}
