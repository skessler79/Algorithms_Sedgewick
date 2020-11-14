import java.util.Scanner;

public class q21
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

		System.out.print("Input number of lines : ");
		int lines = input.nextInt();
		String[] names = new String[lines];
		int[] num1 = new int[lines];
		int[] num2 = new int[lines];

		for(int i = 0; i < lines; ++i)
		{
			names[i] = input.next();
			num1[i] = input.nextInt();
			num2[i] = input.nextInt();
		}

		table(names, num1, num2, lines);
    }

	private static void table(String[] names, int[] num1, int[] num2, int lines)
	{
		for(int i = 0; i < lines; ++i)
		{
			double num3 = ((double)num1[i]) / num2[i];
			System.out.print(names[i].format("%-20s | %-5d | %-5d | %.3f",
											 names[i],
											 num1[i],
											 num2[i],
											 num3));
			System.out.print('\n');
		}
	}
}