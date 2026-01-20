////////////////////////////////////////////////////////////////////
//
//  Program Name : Program40_5
//  Description  : Display small letters a to n using recursion
//  Input        : Integer
//  Output       : a b c d e f
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
            char ch = (char)('a' + iNo - 1);
            System.out.print(ch + "\t");
        }
    }
}

class Program40_5
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
//  Output : a   b   c   d   e   f
//
//  Input  : 3
//  Output : a   b   c
//
////////////////////////////////////////////////////////////////////
