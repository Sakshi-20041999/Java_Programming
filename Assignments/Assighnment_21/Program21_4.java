////////////////////////////////////////////////////////////////////
//
//  Program Name : Program21_4
//  Description  : Count total number of factors of a number
//  Input        : Integer number
//  Output       : Prints total factor count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        int count = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        System.out.println("Total number of factors: " + count);
    }
}

class Program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 20
//  Output : Total number of factors: 6
//
//  Input  : 13
//  Output : Total number of factors: 2
//
////////////////////////////////////////////////////////////////////
