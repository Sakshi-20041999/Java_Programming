import java.util.*;

class Program41_3
{
    public static int Strlen(char[] str, int index)
    {
        if(index == str.length)
        {
            return 0;
        }

        return 1 + Strlen(str, index + 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char arr[] = sc.nextLine().toCharArray();

        System.out.println(Strlen(arr, 0));
    }
}
