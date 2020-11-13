import java.util.Arrays;

public class q15
{
    public static void main(String[] args)
    {
        int[] a = {0,2,3,4,1,2,3};
        int m = 5;
        int[] arr = new int[m];
        arr = histogram(a, m);
        
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(Integer.toString(i) + " : " + Integer.toString(arr[i]));
        }
    }

    private static int[] histogram(int[] a, int m)
    {
        int[] arr = new int[m];
        Arrays.fill(arr, 0);

        for(int i = 0; i < m; ++i)
            for(int j = 0; j < a.length; ++j)
                if(a[j] == i)
                    arr[i]++;
        
        return arr;
    }
}