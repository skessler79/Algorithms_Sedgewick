public class q10
{
    public static void main(String[] args)
    {
        int[] a;
        for (int i = 0; i < 10; i++)
            a[i] = i * i;

        // It does not allocate memory for a[] with new. This code results in
        // a variable a might not have been initialized compile-time error.
    }
}