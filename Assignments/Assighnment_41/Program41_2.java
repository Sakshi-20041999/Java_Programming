////////////////////////////////////////////////////////////////////
//
//  Program Name : Program41_2
//  Description  : Return summation of digits using recursion
//  Input        : Integer
//  Output       : Integer sum
//  Author       : Sakshi Santosh Jadhav
//  Date         : 01/12/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int Sum(int iNo)
    {
        if(iNo == 0)
            return 0;
        else
            return (iNo % 10) + Sum(iNo / 10);
    }
}

class Program41_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.Sum(879);

        System.out.println("Summation is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 879
//  Output : Summation is: 24
//
//  Input  : 123
//  Output : Summation is: 6
//
////////////////////////////////////////////////////////////////////
