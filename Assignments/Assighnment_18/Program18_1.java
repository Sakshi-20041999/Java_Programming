////////////////////////////////////////////////////////////////////
//
//  Program Name : Program18_1
//  Description  : Check whether number is prime or not
//  Input        : Integer num
//  Output       : Prints whether num is prime or not
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 11
//  Output : 11 is a prime number.
//
//  Input  : 4
//  Output : 4 is not a prime number.
//
//  Input  : 1
//  Output : 1 is not a prime number.
//
//  Input  : 17
//  Output : 17 is a prime number.
//
////////////////////////////////////////////////////////////////////
