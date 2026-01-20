////////////////////////////////////////////////////////////////////
//
//  Program Name : Program28_4
//  Description  : Print row numbers in reverse order
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints reverse row numbers in matrix form
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program28_4
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(i + "\t");
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
//  Input  : 4 3
//  Output : 4	4	4
//           3	3	3
//           2	2	2
//           1	1	1
//
//  Input  : 2 5
//  Output : 2	2	2	2	2
//           1	1	1	1	1
//
////////////////////////////////////////////////////////////////////
