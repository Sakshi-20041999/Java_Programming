import java.util.*;

class Program37_4 
{

    public static int LastChar(char[] str, char ch) 
    {
        int last = -1;
        for(int i = 0; i < str.length; i++)
             {
            if(str[i] == ch) last = i;
        }
        return last;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();
        char cValue = sc.next().charAt(0);

        int iRet = LastChar(arr, cValue);

        System.out.println("Character location is " + iRet);
    }
}
