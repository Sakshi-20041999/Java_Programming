////////////////////////////////////////////////////////////////////
//
//  Program Name : Program35_3
//  Description  : Return difference between small and capital characters
//  Input        : String
//  Output       : Integer (smallCount - capitalCount)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program35_3
{
    public static int Difference(String str)
    {
        int smallCnt = 0;
        int capitalCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                smallCnt++;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                capitalCnt++;
            }
        }
        return (smallCnt - capitalCnt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        int iRet = Difference(str);
        System.out.println(iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : MarvellouS
//  Output : 6
//
//  Input  : HelloWORLD
//  Output : -3
//
////////////////////////////////////////////////////////////////////
