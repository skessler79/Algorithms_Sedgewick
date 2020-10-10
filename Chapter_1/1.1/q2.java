public class q2 {
  public static void main(String[] args) {
    System.out.println((1 + 2.236) / 2);
    System.out.println("float");
    System.out.println(1 + 2 + 3 + 4.0);
    System.out.println("float");
    System.out.println(4.1 >= 4);
    System.out.println("boolean");
    printType(1 + 2 + "3");
  }

  public static void printType(String x) {
    System.out.println("String");
  }

  public static void printType(int x) {
    System.out.println("Int");
  }
}