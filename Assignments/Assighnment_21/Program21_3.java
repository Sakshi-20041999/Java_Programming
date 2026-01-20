////////////////////////////////////////////////////////////////////
//
//  Program Name : Program21_3
//  Description  : Display all factors of a number
//  Input        : Integer number
//  Output       : Prints all factors
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        System.out.println("Factors of " + num + " are:");

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class Program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 12
//  Output : Factors of 12 are:
//           1 2 3 4 6 12
//
//  Input  : 15
//  Output : Factors of 15 are:
//           1 3 5 15
//
////////////////////////////////////////////////////////////////////
