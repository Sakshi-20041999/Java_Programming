////////////////////////////////////////////////////////////////////
//
//  Program Name : Program28_1
//  Description  : Print alphabet pattern row-wise starting from A
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints alphabets in matrix form
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program28_1
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            char ch = 'A';
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
                ch++;
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
//  Output : A	B	C	D
//           A	B	C	D
//           A	B	C	D
//
//  Input  : 2 3
//  Output : A	B	C
//           A	B	C
//
////////////////////////////////////////////////////////////////////
