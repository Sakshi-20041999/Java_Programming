////////////////////////////////////////////////////////////////////
//
//  Program Name : Program33_4
//  Description  : Check whether given character is small case (a-z)
//  Input        : Character
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program33_4
{
    public static boolean ChkSmall(char ch)
    {
        if(ch >= 'a' && ch <= 'z')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkSmall(cValue);

        if(bRet == true)
            System.out.println("It is Small case Character");
        else
            System.out.println("It is not a Small case Character");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : g
//  Output : It is Small case Character
//
//  Input  : D
//  Output : It is not a Small case Character
//
////////////////////////////////////////////////////////////////////
