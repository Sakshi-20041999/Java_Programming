////////////////////////////////////////////////////////////////////
//
//  Program Name : Program35_1
//  Description  : Count number of capital characters in a string
//  Input        : String
//  Output       : Integer count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program35_1
{
    public static int CountCapital(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        int iRet = CountCapital(str);
        System.out.println(iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous Multi OS
//  Output : 4
//
//  Input  : HELLOworld
//  Output : 5
//
////////////////////////////////////////////////////////////////////
