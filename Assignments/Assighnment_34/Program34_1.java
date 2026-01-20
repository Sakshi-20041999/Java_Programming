////////////////////////////////////////////////////////////////////
//
//  Program Name : Program34_1
//  Description  : Display ASCII table (0–255)
//  Input        : None
//  Output       : Symbol, Decimal, Hexadecimal, Octal
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Program34_1
{
    public static void DisplayASCII()
    {
        System.out.println("Symbol\tDecimal\tHex\tOctal");

        for(int i = 0; i <= 255; i++)
        {
            char ch = (char)i;
            System.out.println(ch + "\t" + i + "\t" + Integer.toHexString(i) + "\t" + Integer.toOctalString(i));
        }
    }

    public static void main(String[] args)
    {
        DisplayASCII();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : None
//  Output : Displays ASCII table from 0 to 255
//
////////////////////////////////////////////////////////////////////
