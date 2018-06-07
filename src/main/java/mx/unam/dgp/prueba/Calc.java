package mx.unam.dgp.prueba;

public class Calc {
  public static void main(String...argv){
    System.out.println(factorial(5));
  }
  private static int factorial(int n) {
    if(n<2) {
      return 1;
    } else {
     //System.out.println("calculo para n"+n);
     return n*factorial(n-1);
    }
  }
}
