////////////////////////////////////////////////////////////////////
//
//  Program Name : Program40_3
//  Description  : Display numbers from N to 1 using recursion
//  Input        : Integer
//  Output       : 5 4 3 2 1
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
            System.out.print(iNo + "\t");
            Display(iNo - 1);
        }
    }
}

class Program40_3
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
//  Output : 5   4   3   2   1
//
//  Input  : 3
//  Output : 3   2   1
//
////////////////////////////////////////////////////////////////////
