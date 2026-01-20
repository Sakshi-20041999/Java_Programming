////////////////////////////////////////////////////////////////////
//
//  Program Name : Program27_3
//  Description  : Print reverse column numbers pattern
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints numbers from Col to 1 in each row
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program27_3
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = iCol; j >= 1; j--)
            {
                System.out.print(j + "\t");
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
//  Output : 4	3	2	1
//           4	3	2	1
//           4	3	2	1
//
//  Input  : 2 3
//  Output : 3	2	1
//           3	2	1
//
////////////////////////////////////////////////////////////////////
