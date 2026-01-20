////////////////////////////////////////////////////////////////////
//
//  Program Name : Program39_1
//  Description  : Display * five times using recursion
//  Input        : None
//  Output       : * * * * *
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int i = 1;

    void Display()
    {
        if(i <= 5)
        {
            System.out.print("*\t");
            i++;
            Display();
        }
    }
}

class Program39_1
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
//  Output : *   *   *   *   *
//
////////////////////////////////////////////////////////////////////
