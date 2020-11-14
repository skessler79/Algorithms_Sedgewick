public class q20
{
    public static void main(String[] args)
    {
        System.out.println(Math.log(factorial(10)));
        // Expected : 15.1044126
    }

    private static int factorial(int n)
    {
        if(n == 1) return 1;
        return factorial(n - 1) * n;
    }
}