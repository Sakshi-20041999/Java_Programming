import java.util.*;

class Program36_5
 {

    public static int CountWhite(char[] str)
     {
        int cnt = 0;

        for(char ch : str)
             {
            if(ch == ' ') 
                {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        int iRet = CountWhite(arr);

        System.out.println(iRet);
    }
}
