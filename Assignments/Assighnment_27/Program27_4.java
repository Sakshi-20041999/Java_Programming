////////////////////////////////////////////////////////////////////
//
//  Program Name : Program27_4
//  Description  : Print alternate * and # pattern
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints * and # alternately in columns
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program27_4
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(j % 2 == 1)
                    System.out.print("*\t");
                else
                    System.out.print("#\t");
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
//  Input  : 3 5
//  Output : *	#	*	#	*
//           *	#	*	#	*
//           *	#	*	#	*
//
//  Input  : 2 4
//  Output : *	#	*	#
//           *	#	*	#
//
////////////////////////////////////////////////////////////////////
