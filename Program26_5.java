import java.util.*;

class Program26_5
{
    public static void Pattern(int iNo)
    {
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print((i * 2) + "\t");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements:");
        iValue = sc.nextInt();

        Pattern(iValue);
    }
}
