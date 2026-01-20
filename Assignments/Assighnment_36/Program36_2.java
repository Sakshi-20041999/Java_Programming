////////////////////////////////////////////////////////////////////
//
//  Program Name : Program36_2
//  Description  : Convert string into upper case
//  Input        : String
//  Output       : Modified string (upper case)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program36_2
{
    public static String struprx(String str)
    {
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
                result = result + (char)(ch - 32);
            else
                result = result + ch;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        String sRet = struprx(str);
        System.out.println("Modified string is: " + sRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous Multi OS
//  Output : MARVELLOUS MULTI OS
//
//  Input  : hello
//  Output : HELLO
//
////////////////////////////////////////////////////////////////////
