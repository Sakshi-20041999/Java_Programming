import java.util.*;

class Program40_2
{
    public static void Display(int no)
    {
        DisplayX(1, no);
    }

    public static void DisplayX(int i, int no)
    {
        if(i <= no)
        {
            System.out.print(i + "\t");
            DisplayX(i + 1, no);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Display(n);
    }
}
