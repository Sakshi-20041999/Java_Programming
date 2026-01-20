////////////////////////////////////////////////////////////////////
//
//  Program Name : Program38_1
//  Description  : Copy string into another string in reverse order
//  Input        : String
//  Output       : Reversed copied string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    String StrCpyRev(String src)
    {
        String dest = "";

        for(int i = src.length() - 1; i >= 0; i--)
        {
            dest = dest + src.charAt(i);
        }

        return dest;
    }
}

class Program38_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        String result = obj.StrCpyRev("Marvellous Python");

        System.out.println(result);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Python"
//  Output : "nohtyP suollevraM"
//
//  Input  : "Hello"
//  Output : "olleH"
//
////////////////////////////////////////////////////////////////////
