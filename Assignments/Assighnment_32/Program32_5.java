////////////////////////////////////////////////////////////////////
//
//  Program Name : Program32_5
//  Description  : Print border number pattern
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints numbers on border and diagonal
//  Author       : Sakshi Santosh Jadhav
//  Date         : 21/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program32_5
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow)
                    System.out.print(j + "\t");
                else if(j == 1 || j == iCol)
                    System.out.print(j + "\t");
                else if(i == j)
                    System.out.print(j + "\t");
                else
                    System.out.print("\t");
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
//  Input  : 5 5
//  Output : 1	2	3	4	5
//           1	2			5
//           1		3		5
//           1			4	5
//           1	2	3	4	5
//
//  Input  : 4 4
//  Output : 1	2	3	4
//           1	2		4
//           1		3	4
//           1	2	3	4
//
////////////////////////////////////////////////////////////////////
