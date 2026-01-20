////////////////////////////////////////////////////////////////////
//
//  Program Name : Program26_2
//  Description  : Print numbers from N to 1 with #
//  Input        : Integer N
//  Output       : Prints pattern: N # N-1 # ...
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program26_2
{
    public static void Pattern(int iNo)
    {
        for(int i = iNo; i >= 1; i--)
        {
            System.out.print(i + "\t#\t");
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
//  Output : 5	#	4	#	3	#	2	#	1	#
//
//  Input  : 3
//  Output : 3	#	2	#	1	#
//
////////////////////////////////////////////////////////////////////
