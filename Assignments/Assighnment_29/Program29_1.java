////////////////////////////////////////////////////////////////////
//
//  Program Name : Program29_1
//  Description  : Print continuous numbers from 1 to 9 in matrix form
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints numbers from 1 to 9 repeatedly
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program29_1
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

                if(num == 10)   // after 9 reset to 1
                    num = 1;
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
//  Output : 1	2	3	4	5
//           6	7	8	9	1
//           2	3	4	5	6
//
//  Input  : 2 7
//  Output : 1	2	3	4	5	6	7
//           8	9	1	2	3	4	5
//
////////////////////////////////////////////////////////////////////
