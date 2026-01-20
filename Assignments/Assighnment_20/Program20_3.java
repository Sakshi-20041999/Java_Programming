////////////////////////////////////////////////////////////////////
//
//  Program Name : Program20_3
//  Description  : Check whether a number is perfect or not
//  Input        : Integer number
//  Output       : Prints whether number is perfect
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;

        for(int i = 1; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }
    }
}

class Program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 6
//  Output : 6 is a perfect number
//
//  Input  : 10
//  Output : 10 is not a perfect number
//
////////////////////////////////////////////////////////////////////
