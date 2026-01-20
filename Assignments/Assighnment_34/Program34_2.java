////////////////////////////////////////////////////////////////////
//
//  Program Name : Program34_2
//  Description  : Toggle case of alphabet character
//  Input        : Character
//  Output       : Converted character
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program34_2
{
    public static void Display(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
            System.out.println((char)(ch + 32));
        else if(ch >= 'a' && ch <= 'z')
            System.out.println((char)(ch - 32));
        else
            System.out.println(ch);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        Display(cValue);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Q
//  Output : q
//
//  Input  : m
//  Output : M
//
//  Input  : 4
//  Output : 4
//
//  Input  : %
//  Output : %
//
////////////////////////////////////////////////////////////////////
