////////////////////////////////////////////////////////////////////
//
//  Program Name : Program36_1
//  Description  : Convert string into lower case
//  Input        : String
//  Output       : Modified string (lower case)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program36_1
{
    public static String strlwrx(String str)
    {
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                result = result + (char)(ch + 32);
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

        String sRet = strlwrx(str);
        System.out.println("Modified string is: " + sRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous Multi OS
//  Output : marvellous multi os
//
//  Input  : HELLO
//  Output : hello
//
////////////////////////////////////////////////////////////////////
