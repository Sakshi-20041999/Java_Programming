////////////////////////////////////////////////////////////////////
//
//  Program Name : Program31_5
//  Description  : Print right-aligned number triangle
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints increasing number pattern
//  Author       : Sakshi Santosh Jadhav
//  Date         : 21/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program31_5
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int space = 1; space < i; space++)
            {
                System.out.print("\t");
            }

            for(int j = i; j <= iCol; j++)
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
//  Input  : 4 4
//  Output : 1	2	3	4
//            	2	3	4
//            		3	4
//            			4
//
//  Input  : 3 3
//  Output : 1	2	3
//            	2	3
//            		3
//
////////////////////////////////////////////////////////////////////
