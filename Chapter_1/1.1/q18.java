public class q18
{
    public static void main(String[] args)
    {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));

        System.out.println(mystery2(2, 25));
        System.out.println(mystery2(3, 11));
    }

    private static int mystery(int a, int b)
    {
        if(b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b/2);
        return mystery(a+a, b/2) + a;
    }

    private static int mystery2(int a, int b)
    {
        if(b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b/2);
        return mystery2(a*a, b/2) * a;
    }
}

// mystery(2, 25) returns 50
// mystery(3, 11) returns 33
// It appears to return the product of the two integers.

// When the function is changed according to the question,
// mystery2(2, 25) returns 96
// mystery2(3, 11) returns 135
// The function returns a ^ b