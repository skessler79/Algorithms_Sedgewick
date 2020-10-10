import java.util.Scanner;

public class q1_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    boolean check = (number1 == number2) && (number2 == number3);
    if(check)
    {
      System.out.println("Equal");
    }
    else
    {
      System.out.println("Not Equal");
    }
  }
}