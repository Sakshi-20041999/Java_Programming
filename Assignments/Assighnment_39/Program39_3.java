    ////////////////////////////////////////////////////////////////////
//
//  Program Name : Program39_3
//  Description  : Display numbers 5 to 1 using recursion
//  Input        : None
//  Output       : 5 4 3 2 1
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int i = 5;

    void Display()
    {
        if(i >= 1)
        {
            System.out.print(i + "\t");
            i--;
            Display();
        }
    }
}

class Program39_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.Display();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : None
//  Output : 5   4   3   2   1
//
////////////////////////////////////////////////////////////////////
