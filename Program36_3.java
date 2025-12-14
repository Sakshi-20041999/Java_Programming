import java.util.*;

class Program36_3 
{

    public static void strtogglex(char[] str)
     {
        for(int i = 0; i < str.length; i++) 
            {
            if(str[i] >= 'A' && str[i] <= 'Z')
             {
                str[i] = (char)(str[i] + 32);
            } 
            else if(str[i] >= 'a' && str[i] <= 'z') 
                {
                str[i] = (char)(str[i] - 32);
            }
        }
    }

    public static void main(String[] args) 
    
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        strtogglex(arr);

        System.out.println("Modified string is " + new String(arr));
    }
}
