////////////////////////////////////////////////////////////////////
//
//  Program Name : Program29_2
//  Description  : Print even numbers in odd rows and odd numbers in even rows
//  Input        : Integer Rows, Integer Columns
//  Output       : Prints alternate even and odd number patterns
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program29_2
{
    public static void Pattern(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            int num;

            if(i % 2 == 1)  
                num = 2;    // even row pattern
            else           
                num = 1;    // odd row pattern

            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(num + "\t");
                num += 2;
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
//  Output : 2	4	6	8
//           1	3	5	7
//           2	4	6	8
//
//  Input  : 2 5
//  Output : 2	4	6	8	10
//           1	3	5	7	9
//
////////////////////////////////////////////////////////////////////
