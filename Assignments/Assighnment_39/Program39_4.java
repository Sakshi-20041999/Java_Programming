////////////////////////////////////////////////////////////////////
//
//  Program Name : Program39_4
//  Description  : Display capital letters A to F using recursion
//  Input        : None
//  Output       : A B C D E F
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    char ch = 'A';

    void Display()
    {
        if(ch <= 'F')
        {
            System.out.print(ch + "\t");
            ch++;
            Display();
        }
    }
}

class Program39_4
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
//  Output : A   B   C   D   E   F
//
////////////////////////////////////////////////////////////////////
