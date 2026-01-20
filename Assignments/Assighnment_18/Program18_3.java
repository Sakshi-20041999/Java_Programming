////////////////////////////////////////////////////////////////////
//
//  Program Name : Program18_3
//  Description  : Display odd numbers up to given number
//  Input        : Integer n
//  Output       : Odd numbers up to n
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void printOddNumbers(int n)
    {
        System.out.println("Odd numbers up to " + n + ":");
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

class Program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}


////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 20
//  Output : Odd numbers up to 20: 1 3 5 7 9 11 13 15 17 19
//
////////////////////////////////////////////////////////////////////