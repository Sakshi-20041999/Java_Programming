import java.util.*;

class Program36_1 
{

    public static void strlwrx(char[] str) 
    {
        for(int i = 0; i < str.length; i++)
             {
            if(str[i] >= 'A' && str[i] <= 'Z') 
                {
                str[i] = (char)(str[i] + 32);
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        strlwrx(arr);

        System.out.println("Modified string is " + new String(arr));
    }
}
