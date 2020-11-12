public class q11
{
    public static void main(String[] args)
    {
        boolean[][] arr = {{true, false, true},
                           {false, true, false},
                           {true, true, true},
                           {false, false, false}};

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == true)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
        }
        System.out.println("Rows : " + arr.length);
        System.out.println("Columns : " + arr[0].length);
        // Assuming all rows have equal column length
    }
}