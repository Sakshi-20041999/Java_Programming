////////////////////////////////////////////////////////////////////
//
//  Program Name : Program37_4
//  Description  : Find last occurrence index of a character
//  Input        : String, Character
//  Output       : Integer index
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int lastChar(String str, char ch)
    {
        int pos = -1;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
                pos = i;
        }
        return pos;
    }
}

class Program37_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.lastChar("Marvellous Multi OS", 'M');

        System.out.println("Character location is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Multi OS", 'M'
//  Output : Character location is: 11
//
//  Input  : "Marvellous Multi OS", 'W'
//  Output : Character location is: -1
//
//  Input  : "Marvellous Multi OS", 'e'
//  Output : Character location is: 4
//
////////////////////////////////////////////////////////////////////
