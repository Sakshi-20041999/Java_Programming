////////////////////////////////////////////////////////////////////
//
//  Program Name : Program36_5
//  Description  : Count number of white spaces in string
//  Input        : String
//  Output       : Integer count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program36_5
{
    public static int CountWhite(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
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

        int iRet = CountWhite(str);
        System.out.println(iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : MarvellouS
//  Output : 0
//
//  Input  : MarvellouS Infosystems
//  Output : 1
//
//  Input  : MarvellouS Infosystems by Piyush Manohar Khairnnar
//  Output : 5
//
////////////////////////////////////////////////////////////////////
