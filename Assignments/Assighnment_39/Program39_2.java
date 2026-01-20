////////////////////////////////////////////////////////////////////
//
//  Program Name : Program39_2
//  Description  : Display numbers 1 to 5 using recursion
//  Input        : None
//  Output       : 1 2 3 4 5
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
            System.out.print(i + "\t");
            i++;
            Display();
        }
    }
}

class Program39_2
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
//  Output : 1   2   3   4   5
//
////////////////////////////////////////////////////////////////////
