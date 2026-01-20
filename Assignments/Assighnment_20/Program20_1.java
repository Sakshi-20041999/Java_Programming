////////////////////////////////////////////////////////////////////
//
//  Program Name : Program20_1
//  Description  : Find sum of all even numbers up to N
//  Input        : Integer N
//  Output       : Prints sum of even numbers
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;

        for(int i = 2; i <= n; i = i + 2)
        {
            sum = sum + i;
        }

        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
    }
}

class Program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 10
//  Output : Sum of even numbers up to 10 is: 30
//
//  Input  : 5
//  Output : Sum of even numbers up to 5 is: 6
//
////////////////////////////////////////////////////////////////////
