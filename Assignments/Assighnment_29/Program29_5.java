////////////////////////////////////////////////////////////////////
//
//  Program Name : Program29_5
//  Description  : Print incremental numbers starting from row number
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints increasing sequence per row
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program29_5
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            int num = i;

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
//           2	3	4	5
//           3	4	5	6
//
//  Input  : 2 5
//  Output : 1	2	3	4	5
//           2	3	4	5	6
//
////////////////////////////////////////////////////////////////////
