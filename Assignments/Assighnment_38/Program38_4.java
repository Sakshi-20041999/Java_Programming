////////////////////////////////////////////////////////////////////
//
//  Program Name : Program38_4
//  Description  : Copy string converting capital letters into small case
//  Input        : String
//  Output       : Small case string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    String StrCpySmall(String src)
    {
        String dest = "";

        for(int i = 0; i < src.length(); i++)
        {
            char ch = src.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                dest = dest + (char)(ch + 32);
            else
                dest = dest + ch;
        }
        return dest;
    }
}

class Program38_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        String result = obj.StrCpySmall("Marvellous Python 2");

        System.out.println(result);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Python 2"
//  Output : "marvellous python 2"
//
//  Input  : "HELLO"
//  Output : "hello"
//
////////////////////////////////////////////////////////////////////
