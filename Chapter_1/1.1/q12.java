public class q12
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        for(int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for(int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for(int i = 0; i < 10; i++)
            System.out.println(a[i]);

        // Prints the following :
        // 0
        // 1
        // 2
        // 3
        // 4
        // 4
        // 3
        // 2
        // 1
        // 0
    }
}