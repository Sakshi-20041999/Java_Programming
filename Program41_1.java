import java.util.*;

class Program41_1
{
    public static void Display(int no)
    {
        if(no > 0)
        {
            System.out.print(no + "\t*\t");
            Display(no - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Display(n);
    }
}
