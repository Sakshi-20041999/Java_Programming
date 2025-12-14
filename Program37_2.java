import java.util.*;

class Program37_2
 {

    public static int CountChar(char[] str, char ch) 
    {
        int cnt = 0;
        for(char c : str) 
            {
            if(c == ch) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();
        char cValue = sc.next().charAt(0);

        int iRet = CountChar(arr, cValue);

        System.out.println("Character frequency is " + iRet);
    }
}
