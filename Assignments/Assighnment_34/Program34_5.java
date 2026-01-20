////////////////////////////////////////////////////////////////////
//
//  Program Name : Program34_5
//  Description  : Display ASCII value in decimal, octal, hexadecimal
//  Input        : Character
//  Output       : Decimal, Octal, Hexadecimal
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program34_5
{
    public static void Display(char ch)
    {
        int ascii = (int)ch;

        System.out.println("Decimal      : " + ascii);
        System.out.println("Octal        : " + Integer.toOctalString(ascii));
        System.out.println("Hexadecimal  : " + Integer.toHexString(ascii).toUpperCase());
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
//  Input  : A
//  Output : Decimal      : 65
//           Octal        : 101
//           Hexadecimal  : 41
//
//  Input  : a
//  Output : Decimal      : 97
//           Octal        : 141
//           Hexadecimal  : 61
//
////////////////////////////////////////////////////////////////////
