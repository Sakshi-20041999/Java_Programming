////////////////////////////////////////////////////////////////////
//
//  Program Name : Program33_1
//  Description  : Check whether given character is alphabet (A-Z, a-z)
//  Input        : Character
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program33_1
{
    public static boolean ChkAlpha(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkAlpha(cValue);

        if(bRet == true)
            System.out.println("It is Character");
        else
            System.out.println("It is not a Character");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : F
//  Output : It is Character
//
//  Input  : &
//  Output : It is not a Character
//
////////////////////////////////////////////////////////////////////
