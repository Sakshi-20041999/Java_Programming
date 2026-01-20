////////////////////////////////////////////////////////////////////
//
//  Program Name : Program29_3
//  Description  : Print alphabets in odd rows and numbers in even rows
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints alternate alphabet and number patterns
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program29_3
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            if(i % 2 == 1)
            {
                char ch = 'a';
                for(int j = 1; j <= iCol; j++)
                {
                    System.out.print(ch + "\t");
                    ch++;
                }
            }
            else
            {
                for(int j = 1; j <= iCol; j++)
                {
                    System.out.print(j + "\t");
                }
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
//  Output : a	b	c	d
//           1	2	3	4
//           a	b	c	d
//
//  Input  : 2 5
//  Output : a	b	c	d	e
//           1	2	3	4	5
//
////////////////////////////////////////////////////////////////////
