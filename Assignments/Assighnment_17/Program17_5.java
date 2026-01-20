////////////////////////////////////////////////////////////////////
//
//  Program Name : Program17_5
//  Description  : Display multiplication table of a number
//  Input        : Integer
//  Output       : Table
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Program17_5
{
    static void printTable(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        printTable(5);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 5
//  Output :
//           5 * 1 = 5
//           5 * 2 = 10
//           5 * 3 = 15
//           ...
//           5 * 10 = 50
//
//////////////////////////////////////////////////////////////////// 
