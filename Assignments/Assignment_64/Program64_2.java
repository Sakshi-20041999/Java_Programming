////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_2
//  Description  : Check whether 5th and 18th bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program64_2
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00020010;   // 5th and 18th bit
        int iResult = iNo & iMask;

        if(iResult == iMask)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        boolean bRet = ChkBit(iValue);

        if(bRet == true)
            System.out.println("5th and 18th bits are ON");
        else
            System.out.println("5th and 18th bits are OFF");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 131088
//  Output : 5th and 18th bits are ON
//
////////////////////////////////////////////////////////////////////