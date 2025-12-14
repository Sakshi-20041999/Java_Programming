import java.util.*;

class Program28_4
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows and columns:");
        iValue1 = sc.nextInt();
        iValue2 = sc.nextInt();

        Pattern(iValue1, iValue2);
    }
}
