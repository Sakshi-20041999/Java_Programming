////////////////////////////////////////////////////////////////////
//
//  Program Name : Program20_4
//  Description  : Find the largest digit in a number
//  Input        : Integer number
//  Output       : Prints largest digit
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit(int num)
    {
        int digit = 0;
        int max = 0;

        while(num > 0)
        {
            digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit is: " + max);
    }
}

class Program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 83429
//  Output : Largest digit is: 9
//
//  Input  : 10245
//  Output : Largest digit is: 5
//
////////////////////////////////////////////////////////////////////
