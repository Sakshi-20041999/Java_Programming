/////////////////////////////////////////////////////////////////////
//
//  Program Name : Program16_3
//  Description  : Find factorial of a number
//  Author       : Sakshi Santosh Jadhav
//  Date         : 22/10/2025
//
/////////////////////////////////////////////////////////////////////

class Program16_3
{
    void findFactorial(int num)
    {
        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }

////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Program16_3 obj = new Program16_3();
        obj.findFactorial(5);
    }
}

/////////////////////////////////////////////////////////////////////
//
// Test Case
//
// Input  : 5
// Output : Factorial of 5 is: 120
//
/////////////////////////////////////////////////////////////////////
