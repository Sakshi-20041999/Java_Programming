////////////////////////////////////////////////////////////////////
//
//  Program Name : Program41_5
//  Description  : Return product of digits using recursion
//  Input        : Integer
//  Output       : Integer product
//  Author       : Sakshi Santosh Jadhav
//  Date         : 01/12/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int Mult(int iNo)
    {
        if(iNo == 0)
            return 1;
        else
            return (iNo % 10) * Mult(iNo / 10);
    }
}

class Program41_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.Mult(523);

        System.out.println("Product is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 523
//  Output : Product is: 30
//
//  Input  : 105
//  Output : Product is: 0
//
////////////////////////////////////////////////////////////////////
