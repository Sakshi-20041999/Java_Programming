/////////////////////////////////////////////////////////////////////
//
//  Program Name : Program16_4
//  Description  : Reverse a given number
//  Author       : Sakshi Santosh Jadhav
//  Date         : 22/10/2025
//
/////////////////////////////////////////////////////////////////////

class Program16_4
{
    void reverseNumber(int num)
    {
        int rev = 0;

        while(num > 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number is: " + rev);
    }

////////////////////////////////////////////////////////////////////
//
//  Entry point function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        Program16_4 obj = new Program16_4();
        obj.reverseNumber(1234);
    }
}

/////////////////////////////////////////////////////////////////////
//
// Test Case
//
// Input  : 1234
// Output : Reversed number is: 4321
//
/////////////////////////////////////////////////////////////////////
