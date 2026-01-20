////////////////////////////////////////////////////////////////////
//
//  Program Name : Program17_2
//  Description  : Check whether number is palindrome
//  Input        : Integer
//  Output       : Boolean message
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Program17_2
{
    static void checkPalindrome(int num)
    {
        int original = num;
        int reverse = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse)
        {
            System.out.println(original + " is a palindrome.");
        }
        else
        {
            System.out.println(original + " is not a palindrome.");
        }
    }

////////////////////////////////////////////////////////////////////
//
//  Entry Point Function
//
////////////////////////////////////////////////////////////////////

    public static void main(String args[])
    {
        checkPalindrome(121);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Case
//
//  Input  : 121
//  Output : 121 is a palindrome.
//
//////////////////////////////////////////////////////////////////// 
