////////////////////////////////////////////////////////////////////
//
//  Program Name : Program18_2
//  Description  : Display even numbers up to given number
//  Input        : Integer n
//  Output       : Even numbers up to n
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void printEvenNumbers(int n)
    {
        System.out.println("Even numbers up to " + n + ":");
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 20
//  Output : Even numbers up to 20: 2 4 6 8 10 12 14 16 18 20
//
////////////////////////////////////////////////////////////////////
