import java.util.*;

class Program37_5 
{

    public static void StrRevX(char[] str) 
    {
        int i = 0, j = str.length - 1;
        char temp;

        while(i < j) 
            {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        StrRevX(arr);

        System.out.println("Modified string is " + new String(arr));
    }
}
