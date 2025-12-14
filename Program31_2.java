import java.util.*;

class Program32_2
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j == iCol - i + 1)
                    System.out.print("#\t");
                else if(j > iCol - i + 1)
                    System.out.print("@\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        Pattern(r, c);
    }
}
