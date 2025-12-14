import java.util.*;

class Program32_4
{
    public static void Pattern(int iRow, int iCol)
    {
        int mid = iCol / 2;

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                    System.out.print("*\t");
                else if(j < i && j <= mid)
                    System.out.print("#\t");
                else if(j > i && j > mid)
                    System.out.print("$\t");
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
