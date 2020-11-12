public class q9
{
    public static void main(String[] args)
    {
        int n = 42;
        String s = "";
        for (int k = n; k > 0; k /= 2)
            s = (k % 2) + s;
        
        System.out.println(s);
        // 101010
    }
}