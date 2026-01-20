////////////////////////////////////////////////////////////////////
//
//  Program Name : Program40_4
//  Description  : Display capital letters A to N using recursion
//  Input        : Integer
//  Output       : A B C D E F
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
            char ch = (char)('A' + iNo - 1);
            System.out.print(ch + "\t");
        }
    }
}

class Program40_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.Display(6);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 6
//  Output : A   B   C   D   E   F
//
//  Input  : 4
//  Output : A   B   C   D
//
////////////////////////////////////////////////////////////////////
