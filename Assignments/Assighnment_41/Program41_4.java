////////////////////////////////////////////////////////////////////
//
//  Program Name : Program41_4
//  Description  : Return factorial of a number using recursion
//  Input        : Integer
//  Output       : Integer factorial
//  Author       : Sakshi Santosh Jadhav
//  Date         : 01/12/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int Fact(int iNo)
    {
        if(iNo <= 1)
            return 1;
        else
            return iNo * Fact(iNo - 1);
    }
}

class Program41_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.Fact(5);

        System.out.println("Factorial is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 5
//  Output : Factorial is: 120
//
//  Input  : 4
//  Output : Factorial is: 24
//
////////////////////////////////////////////////////////////////////
