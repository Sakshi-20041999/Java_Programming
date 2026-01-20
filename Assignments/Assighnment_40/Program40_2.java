////////////////////////////////////////////////////////////////////
//
//  Program Name : Program40_2
//  Description  : Display numbers from 1 to N using recursion
//  Input        : Integer
//  Output       : 1 2 3 4 5
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void Display(int iNo)
    {
        if(iNo > 0)
        {
            Display(iNo - 1);
            System.out.print(iNo + "\t");
        }
    }
}

class Program40_2
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
//  Output : 1   2   3   4   5
//
//  Input  : 4
//  Output : 1   2   3   4
//
////////////////////////////////////////////////////////////////////
