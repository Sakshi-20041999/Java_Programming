////////////////////////////////////////////////////////////////////
//
//  Program Name : Program37_5
//  Description  : Reverse a string
//  Input        : String
//  Output       : Reversed string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    String strRevX(String str)
    {
        char arr[] = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}

class Program37_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        String result = obj.strRevX("abcd");

        System.out.println("Modified string is: " + result);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "abcd"
//  Output : "dcba"
//
//  Input  : "abba"
//  Output : "abba"
//
////////////////////////////////////////////////////////////////////
