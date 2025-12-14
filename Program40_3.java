import java.util.*;

class Program40_3
{
    public static void Display(int no)
    {
        if(no >= 1)
        {
            System.out.print(no + "\t");
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
