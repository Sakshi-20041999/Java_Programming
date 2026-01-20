////////////////////////////////////////////////////////////////////
//
//  Program Name : Program32_1
//  Description  : Print * and # diagonal pattern
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints diagonal shifted # pattern
//  Author       : Sakshi Santosh Jadhav
//  Date         : 21/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program32_1
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j == iCol - i + 1)
                    System.out.print("#\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        System.out.println("Enter number of rows and columns:");
        iValue1 = sc.nextInt();
        iValue2 = sc.nextInt();

        Pattern(iValue1, iValue2);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 4 4
//  Output : *	*	*	#
//           *	*	#	*
//           *	#	*	*
//           #	*	*	*
//
//  Input  : 3 3
//  Output : *	*	#
//           *	#	*
//           #	*	*
//
////////////////////////////////////////////////////////////////////
