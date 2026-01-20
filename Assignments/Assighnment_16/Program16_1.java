/////////////////////////////////////////////////////////////////////
//
//  Program Name : Program16_1
//  Description  : Calculate sum of first N natural numbers
//  Author       : Sakshi Santosh Jadhav
//  Date         : 22/10/2025
//
/////////////////////////////////////////////////////////////////////

class Program16_1
{
    void calculateSum(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////////
    public static void main(String args[])
    {
        Program16_1 obj = new Program16_1();
        obj.calculateSum(10);
    }
}

/////////////////////////////////////////////////////////////////////
//
// Test Case
//
// Input  : 10
// Output : Sum of first 10 natural numbers is: 55
//
/////////////////////////////////////////////////////////////////////
