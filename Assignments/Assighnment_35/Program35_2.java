////////////////////////////////////////////////////////////////////
//
//  Program Name : Program35_2
//  Description  : Count number of small characters in a string
//  Input        : String
//  Output       : Integer count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program35_2
{
    public static int CountSmall(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
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

        int iRet = CountSmall(str);
        System.out.println(iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Marvellous
//  Output : 9
//
//  Input  : HelloWorld
//  Output : 8
//
////////////////////////////////////////////////////////////////////
