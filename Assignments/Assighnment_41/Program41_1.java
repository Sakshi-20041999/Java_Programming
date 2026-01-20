////////////////////////////////////////////////////////////////////
//
//  Program Name : Program41_1
//  Description  : Display pattern 5 * 4 * 3 * 2 * 1 * using recursion
//  Input        : Integer
//  Output       : Pattern (number and * alternately)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 01/12/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print(iNo + "\t*\t");
            Display(iNo - 1);
        }
    }
}

class Program41_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.Display(5);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 5
//  Output : 5   *   4   *   3   *   2   *   1   *
//
//  Input  : 3
//  Output : 3   *   2   *   1   *
//
////////////////////////////////////////////////////////////////////
