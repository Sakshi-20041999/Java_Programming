////////////////////////////////////////////////////////////////////
//
//  Program Name : Program36_3
//  Description  : Toggle the case of string
//  Input        : String
//  Output       : Modified string (toggle case)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program36_3
{
    public static String strtogglex(String str)
    {
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                result = result + (char)(ch + 32);
            else if(ch >= 'a' && ch <= 'z')
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

        String sRet = strtogglex(str);
        System.out.println("Modified string is: " + sRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous Multi OS
//  Output : mARVELLOUS mULTI os
//
//  Input  : Hello123
//  Output : hELLO123
//
////////////////////////////////////////////////////////////////////
