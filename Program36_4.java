import java.util.*;

class Program36_4
 {

    public static void DisplayDigit(char[] str) 
    {
        for(char ch : str) {
            if(ch >= '0' && ch <= '9') 
                {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) 
    
    {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.nextLine().toCharArray();

        DisplayDigit(arr);
    }
}
