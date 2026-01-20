////////////////////////////////////////////////////////////////////
//
//  Program Name : Program40_1
//  Description  : Display * pattern using recursion
//  Input        : Integer
//  Output       : * * * * *
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
            System.out.print("*\t");
            Display(iNo - 1);
        }
    }
}

class Program40_1
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
//  Output : *   *   *   *   *
//
//  Input  : 3
//  Output : *   *   *
//
////////////////////////////////////////////////////////////////////
