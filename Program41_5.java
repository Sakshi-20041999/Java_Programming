import java.util.*;

class Program41_5
{
    public static int Mult(int no)
    {
        if(no == 0)
        {
            return 1;
        }

        return (no % 10) * Mult(no / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Mult(n));
    }
}
