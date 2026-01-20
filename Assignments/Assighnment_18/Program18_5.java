////////////////////////////////////////////////////////////////////
//
//  Program Name : Program18_5
//  Description  : Check whether number is positive, negative or zero
//  Input        : Integer num
//  Output       : Sign of number
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
            System.out.println(num + " is a positive number.");
        else if(num < 0)
            System.out.println(num + " is a negative number.");
        else
            System.out.println("The number is zero.");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : -8
//  Output : -8 is a negative number.
//
//  Input  : 0
//  Output : The number is zero.
//
//  Input  : 15
//  Output : 15 is a positive number.
//
//////////////////////////////////////////////////////////////////// 
