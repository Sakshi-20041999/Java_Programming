////////////////////////////////////////////////////////////////////
//
//  Program Name : Program28_5
//  Description  : Print continuous numbers in matrix form
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints numbers continuously
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program28_5
{
    public static void Pattern(int iRow, int iCol)
    {
        int num = 1;

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(num + "\t");
                num++;
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
//  Input  : 3 4
//  Output : 1	2	3	4
//           5	6	7	8
//           9	10	11	12
//
//  Input  : 2 3
//  Output : 1	2	3
//           4	5	6
//
////////////////////////////////////////////////////////////////////
