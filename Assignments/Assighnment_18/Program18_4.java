////////////////////////////////////////////////////////////////////
//
//  Program Name : Program18_4
//  Description  : Display summation of even and odd digits of a number
//  Input        : Integer num
//  Output       : Sum of even and odd digits
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int evenSum = 0, oddSum = 0;

        while(num != 0)
        {
            int digit = num % 10;

            if(digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num = num / 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 123456
//  Output : Sum of even digits: 12
//           Sum of odd digits: 9
//
////////////////////////////////////////////////////////////////////
