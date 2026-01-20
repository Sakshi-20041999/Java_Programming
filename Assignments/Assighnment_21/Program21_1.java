////////////////////////////////////////////////////////////////////
//
//  Program Name : Program21_1
//  Description  : Calculate product of digits of a number
//  Input        : Integer number
//  Output       : Prints product of digits
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int num)
    {
        int product = 1;

        while(num > 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of digits is: " + product);
    }
}

class Program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 234
//  Output : Product of digits is: 24
//
//  Input  : 105
//  Output : Product of digits is: 0
//
////////////////////////////////////////////////////////////////////
