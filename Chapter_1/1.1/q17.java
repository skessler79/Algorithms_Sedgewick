public class q17
{
    public static void main(String[] args)
    {
        System.out.println(exR2(6));
    }

    private static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if(n <= 0) return "";
        return s;
    }
}

// The base case will never be reached.
// A call to exR2(3) will result in calls to exR2(0), exR2(-3), exR2(-6)
// and so forth until a StackOverflowError occurs.