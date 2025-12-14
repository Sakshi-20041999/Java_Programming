import java.util.*;

class Program37_3 
{

    public static int FirstChar(char[] str, char ch) 
    {
        for(int i = 0; i < str.length; i++) 
            {
            if(str[i] == ch) return i;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();
        char cValue = sc.next().charAt(0);

        int iRet = FirstChar(arr, cValue);

        System.out.println("Character location is " + iRet);
    }
}
