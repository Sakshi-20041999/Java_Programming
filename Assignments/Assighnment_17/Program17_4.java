////////////////////////////////////////////////////////////////////
//
//  Program Name : Program17_4
//  Description  : Find minimum of three numbers
//  Input        : Integer, Integer, Integer
//  Output       : Integer
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Program17_4
{
    static void findMin(int a, int b, int c)
    {
        int min;

        if(a < b && a < c)
        {
            min = a;
        }
        else if(b < c)
        {
            min = b;
        }
        else
        {
            min = c;
        }

        System.out.println("Minimum number is: " + min);
    }

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        findMin(3, 7, 2);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 3, 7, 2
//  Output : Minimum number is: 2
//
//////////////////////////////////////////////////////////////////// 
