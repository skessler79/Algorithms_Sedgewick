public class q14
{
    public static void main(String[] args)
    {
        // 3
        System.out.println(lg(10));

        // 4
        System.out.println(lg(20));

        // 5
        System.out.println(lg(50));
    }

    private static int lg(int n)
    {
        int log = 0;

        while(n > 0)
        {
            log++;
            n /= 2;
        }
        return log - 1;
    }
}