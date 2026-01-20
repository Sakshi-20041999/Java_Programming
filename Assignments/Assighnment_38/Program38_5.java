////////////////////////////////////////////////////////////////////
//
//  Program Name : Program38_5
//  Description  : Copy string by toggling the case
//  Input        : String
//  Output       : Toggle case string
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    String StrCpyToggle(String src)
    {
        String dest = "";

        for(int i = 0; i < src.length(); i++)
        {
            char ch = src.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                dest = dest + (char)(ch + 32);
            else if(ch >= 'a' && ch <= 'z')
                dest = dest + (char)(ch - 32);
            else
                dest = dest + ch;
        }
        return dest;
    }
}

class Program38_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        String result = obj.StrCpyToggle("Marvellous Python 2");

        System.out.println(result);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Python 2"
//  Output : "mARVELLOUS pYTHON 2"
//
//  Input  : "AbC"
//  Output : "aBc"
//
////////////////////////////////////////////////////////////////////
