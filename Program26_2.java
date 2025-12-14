import java.util.*;

class Program26_2
{
    public static void Pattern(int iNo)
    {
        for(int i = iNo; i >= 1; i--)
        {
            System.out.print(i + "\t#\t");
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
