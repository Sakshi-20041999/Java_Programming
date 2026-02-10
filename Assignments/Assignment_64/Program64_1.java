////////////////////////////////////////////////////////////////////
//
//  Program Name : Program64_1
//  Description  : Check whether 15th bit is ON or OFF
//  Input        : One integer number
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 05/02/2026
//
////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program64_1
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00004000;   
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
            System.out.println("15th bit is ON");
        else
            System.out.println("15th bit is OFF");

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//  Input  : 16384
//  Output : 15th bit is ON
//
////////////////////////////////////////////////////////////////////