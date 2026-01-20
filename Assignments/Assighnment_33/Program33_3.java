////////////////////////////////////////////////////////////////////
//
//  Program Name : Program33_3
//  Description  : Check whether given character is digit (0-9)
//  Input        : Character
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program33_3
{
    public static boolean ChkDigit(char ch)
    {
        if(ch >= '0' && ch <= '9')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkDigit(cValue);

        if(bRet == true)
            System.out.println("It is Digit");
        else
            System.out.println("It is not a Digit");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 7
//  Output : It is Digit
//
//  Input  : d
//  Output : It is not a Digit
//
////////////////////////////////////////////////////////////////////
