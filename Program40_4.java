import java.util.*;

class Program40_4
{
    public static void Display(int no)
    {
        DisplayX('A', no);
    }

    public static void DisplayX(char ch, int no)
    {
        if(no > 0)
        {
            System.out.print(ch + "\t");
            DisplayX((char)(ch + 1), no - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Display(n);
    }
}
