////////////////////////////////////////////////////////////////////
//
//  Program Name : Program17_3
//  Description  : Find maximum of two numbers
//  Input        : Integer, Integer
//  Output       : Integer
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Program17_3
{
    static void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Maximum number is: " + a);
        }
        else if(b > a)
        {
            System.out.println("Maximum number is: " + b);
        }
        else
        {
            System.out.println("Both numbers are equal: " + a);
        }
    }

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        findMax(20, 15);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 20, 15
//  Output : Maximum number is: 20
//
//////////////////////////////////////////////////////////////////// 
