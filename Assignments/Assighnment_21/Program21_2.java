////////////////////////////////////////////////////////////////////
//
//  Program Name : Program21_2
//  Description  : Count even and odd numbers in a given range
//  Input        : Integer N
//  Output       : Prints count of even and odd numbers
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0, oddCount = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

class Program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 50
//  Output : Even numbers count: 25
//           Odd numbers count: 25
//
//  Input  : 10
//  Output : Even numbers count: 5
//           Odd numbers count: 5
//
////////////////////////////////////////////////////////////////////
