////////////////////////////////////////////////////////////////////
//
//  Program Name : Program20_2
//  Description  : Print numbers from N down to 1
//  Input        : Integer N
//  Output       : Prints numbers in reverse order
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Program20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 10
//  Output : 10 9 8 7 6 5 4 3 2 1
//
//  Input  : 5
//  Output : 5 4 3 2 1
//
////////////////////////////////////////////////////////////////////
