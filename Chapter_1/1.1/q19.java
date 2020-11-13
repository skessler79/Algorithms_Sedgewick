public class q19
{
    public static long fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fib_fast(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; ++i)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args)
    {
        for(int n = 0; n < 90; n++)
        {
            // StdOut.println(n + " " + fibonacci(n));
            StdOut.println(n + " " + fib_fast(n));
        }
            
    }
}