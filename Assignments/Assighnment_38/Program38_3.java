////////////////////////////////////////////////////////////////////
//
//  Program Name : Program38_3
//  Description  : Copy string converting small letters into capital case
//  Input        : String
//  Output       : Capital case string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    String StrCpyCap(String src)
    {
        String dest = "";

        for(int i = 0; i < src.length(); i++)
        {
            char ch = src.charAt(i);

            if(ch >= 'a' && ch <= 'z')
                dest = dest + (char)(ch - 32);
            else
                dest = dest + ch;
        }
        return dest;
    }
}

class Program38_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        String result = obj.StrCpyCap("Marvellous Python 2");

        System.out.println(result);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Python 2"
//  Output : "MARVELLOUS PYTHON 2"
//
//  Input  : "hello123"
//  Output : "HELLO123"
//
////////////////////////////////////////////////////////////////////
