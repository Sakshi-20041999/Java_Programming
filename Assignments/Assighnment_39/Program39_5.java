////////////////////////////////////////////////////////////////////
//
//  Program Name : Program39_5
//  Description  : Display small letters a to f using recursion
//  Input        : None
//  Output       : a b c d e f
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    char ch = 'a';

    void Display()
    {
        if(ch <= 'f')
        {
            System.out.print(ch + "\t");
            ch++;
            Display();
        }
    }
}

class Program39_5
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
//  Output : a   b   c   d   e   f
//
////////////////////////////////////////////////////////////////////
