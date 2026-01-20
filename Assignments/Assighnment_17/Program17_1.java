////////////////////////////////////////////////////////////////////
//
//  Class Name    : Program17_1
//  Description   : Calculate summation of digits of a number
//  Input         : Integer
//  Output        : Integer
//  Author        : Sakshi Santosh Jadhav
//  Date          : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits is: " + sum);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 1234
//  Output : Sum of digits is: 10
//
//////////////////////////////////////////////////////////////////// 
