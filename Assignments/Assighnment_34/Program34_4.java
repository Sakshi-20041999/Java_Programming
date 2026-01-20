////////////////////////////////////////////////////////////////////
//
//  Program Name : Program34_4
//  Description  : Check whether character is special symbol
//  Input        : Character
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program34_4
{
    public static boolean ChkSpecial(char ch)
    {
        if(ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
           ch == '%' || ch == '^' || ch == '&' || ch == '*')
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        boolean bRet = ChkSpecial(cValue);

        if(bRet == true)
            System.out.println("It is special Character");
        else
            System.out.println("It is not a special Character");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : %
//  Output : It is special Character
//
//  Input  : d
//  Output : It is not a special Character
//
////////////////////////////////////////////////////////////////////
