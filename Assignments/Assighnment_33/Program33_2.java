////////////////////////////////////////////////////////////////////
//
//  Program Name : Program33_2
//  Description  : Check whether given character is capital (A-Z)
//  Input        : Character
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program33_2
{
    public static boolean ChkCapital(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkCapital(cValue);

        if(bRet == true)
            System.out.println("It is Capital Character");
        else
            System.out.println("It is not a Capital Character");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : F
//  Output : It is Capital Character
//
//  Input  : d
//  Output : It is not a Capital Character
//
////////////////////////////////////////////////////////////////////
