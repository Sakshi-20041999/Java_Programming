import java.util.*;

class Program36_2 
{

    public static void struprx(char[] str) 
    {
        for(int i = 0; i < str.length; i++) 
            {
            if(str[i] >= 'a' && str[i] <= 'z') {
                str[i] = (char)(str[i] - 32);
            }
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        struprx(arr);

        System.out.println("Modified string is " + new String(arr));
    }
}
