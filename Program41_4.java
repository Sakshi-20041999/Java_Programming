import java.util.*;

class Program41_4
{
    public static int Fact(int no)
    {
        if(no == 0)
        {
            return 1;
        }

        return no * Fact(no - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
