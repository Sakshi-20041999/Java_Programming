import java.util.*;

class Program41_2
{
    public static int Sum(int no)
    {
        if(no == 0)
        {
            return 0;
        }

        return (no % 10) + Sum(no / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
