////////////////////////////////////////////////////////////////////
//
//  Program Name : Program20_5
//  Description  : Find the smallest digit in a number
//  Input        : Integer number
//  Output       : Prints smallest digit
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int num)
    {
        int digit = 0;
        int min = 9;

        while(num > 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest digit is: " + min);
    }
}

class Program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 45872
//  Output : Smallest digit is: 2
//
//  Input  : 90015
//  Output : Smallest digit is: 0
//
////////////////////////////////////////////////////////////////////
