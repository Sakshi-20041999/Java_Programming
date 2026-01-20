////////////////////////////////////////////////////////////////////
//
//  Program Name : Program19_3
//  Description  : Check number divisible by 5 and 11
//  Input        : Integer num
//  Output       : Prints divisibility status
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " is divisible by both 5 and 11.");
        else
            System.out.println(num + " is not divisible by both 5 and 11.");
    }
}

class Program19_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 55
//  Output : 55 is divisible by both 5 and 11.
//
//  Input  : 50
//  Output : 50 is not divisible by both 5 and 11.
//
//  Input  : 110
//  Output : 110 is divisible by both 5 and 11.
//
////////////////////////////////////////////////////////////////////
