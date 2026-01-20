////////////////////////////////////////////////////////////////////
//
//  Program Name : Program28_2
//  Description  : Print alternate rows of uppercase and lowercase alphabets
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints alphabets in alternating case
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program28_2
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            char ch;

            if(i % 2 == 1)
                ch = 'A';
            else
                ch = 'a';

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
//           a	b	c	d
//           A	B	C	D
//
//  Input  : 2 3
//  Output : A	B	C
//           a	b	c
//
////////////////////////////////////////////////////////////////////
