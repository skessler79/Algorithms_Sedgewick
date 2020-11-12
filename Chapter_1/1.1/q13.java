public class q13
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9},
                       {10, 11, 12},
                       {13, 14, 15}};
        
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < cols; i++)
        {
            for(int j = 0; j < rows; j++)
                System.out.print(Integer.toString(arr[j][i]) + ' ');
            System.out.print('\n');
        }   
    }
}