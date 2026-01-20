////////////////////////////////////////////////////////////////////
//
//  Program Name : Program19_5
//  Description  : Calculate power of a number
//  Input        : Integer base, Integer exponent
//  Output       : Prints result of base^exponent
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    {
        int result = 1;

        for(int i = 1; i <= exp; i++)
        {
            result = result * base;
        }

        System.out.println(base + " raised to the power " + exp + " is: " + result);
    }
}

class Program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 2, 5
//  Output : 2 raised to the power 5 is: 32
//
//  Input  : 3, 3
//  Output : 3 raised to the power 3 is: 27
//
//  Input  : 5, 0
//  Output : 5 raised to the power 0 is: 1
//
///////////////////////////////////////////////////////////////////