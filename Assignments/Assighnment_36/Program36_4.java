////////////////////////////////////////////////////////////////////
//
//  Program Name : Program36_4
//  Description  : Display only digits from a string
//  Input        : String
//  Output       : Digits present in string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program36_4
{
    public static void DisplayDigit(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9')
            {
                System.out.print(ch);
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        DisplayDigit(str);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : marve89llous121
//  Output : 89121
//
//  Input  : Demo
//  Output : (No output)
//
////////////////////////////////////////////////////////////////////
