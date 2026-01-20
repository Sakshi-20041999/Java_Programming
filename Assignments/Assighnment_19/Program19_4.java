////////////////////////////////////////////////////////////////////
//
//  Program Name : Program19_4
//  Description  : Display digits of a number
//  Input        : Integer num
//  Output       : Prints digits of the number
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int num)
    {
        System.out.println("Digits of " + num + " are:");

        while(num > 0)
        {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}

class Program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 9876
//  Output : 6 7 8 9 (each digit on new line)
//
//  Input  : 12345
//  Output : 5 4 3 2 1 (each digit on new line)
//
////////////////////////////////////////////////////////////////////
