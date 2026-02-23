///////////////////////////////////////////////////////////////////
//
//  Program Name : Program72_1
//  Description  : Addition of diagonal elements from matrix
//  Input        : Matrix elements
//  Output       : Sum of diagonal elements
//  Author       : Sakshi Santosh Jadhav
//  Date         : 20/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program72_1
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements is : " + iRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input :
//  3 2 5 9
//  4 3 2 2
//  8 4 1 5
//  3 9 7 5
//
//  Output : 12
//
///////////////////////////////////////////////////////////////////