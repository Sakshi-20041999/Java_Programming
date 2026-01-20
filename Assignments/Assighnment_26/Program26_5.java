////////////////////////////////////////////////////////////////////
//
//  Program Name : Program26_5
//  Description  : Print first N even numbers
//  Input        : Integer N
//  Output       : Prints even numbers
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program26_5
{
    public static void Pattern(int iNo)
    {
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print((i * 2) + "\t");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements:");
        iValue = sc.nextInt();

        Pattern(iValue);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 5
//  Output : 2	4	6	8	10
//
//  Input  : 3
//  Output : 2	4	6
//
////////////////////////////////////////////////////////////////////
