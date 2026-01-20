////////////////////////////////////////////////////////////////////
//
//  Program Name : Program28_3
//  Description  : Print same alphabet in each row, increment row-wise
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints repeating alphabets in matrix form
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program28_3
{
    public static void Pattern(int iRow, int iCol)
    {
        char ch = 'A';

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
            }
            ch++;
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
//  Output : A	A	A
//           B	B	B
//           C	C	C
//           D	D	D
//
//  Input  : 2 4
//  Output : A	A	A	A
//           B	B	B	B
//
////////////////////////////////////////////////////////////////////
