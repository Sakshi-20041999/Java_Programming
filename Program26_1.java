import java.util.*;

class Program26_1
{
    public static void Pattern(int iNo)
    {
        char ch = 'A';
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print(ch + "\t");
            ch++;
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
