import java.util.*;

class Program37_1 
{

    public static boolean ChkChar(char[] str, char ch)
     {
        for(char c : str) 
            {
            if(c == ch) return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkChar(arr, cValue);

        if(bRet) System.out.println("Character found");
        else System.out.println("Character not found");
    }
}
