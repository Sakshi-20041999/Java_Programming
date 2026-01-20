////////////////////////////////////////////////////////////////////
//
//  Program Name : Program41_3
//  Description  : Count number of characters in string using recursion
//  Input        : String
//  Output       : Integer count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 01/12/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int Strlen(String str)
    {
        if(str.length() == 0)
            return 0;
        else
            return 1 + Strlen(str.substring(1));
    }
}

class Program41_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.Strlen("Hello");

        System.out.println("Length is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Hello"
//  Output : Length is: 5
//
//  Input  : "Marvellous"
//  Output : Length is: 10
//
////////////////////////////////////////////////////////////////////
