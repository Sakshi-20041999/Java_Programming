////////////////////////////////////////////////////////////////////
//
//  Program Name : Program35_5
//  Description  : Display string in reverse order
//  Input        : String
//  Output       : Reversed string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program35_5
{
    public static void Reverse(String str)
    {
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        Reverse(str);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : MarvellouS
//  Output : SuollevraM
//
//  Input  : Hello
//  Output : olleH
//
////////////////////////////////////////////////////////////////////
