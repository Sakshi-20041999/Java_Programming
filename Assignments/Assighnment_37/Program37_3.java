////////////////////////////////////////////////////////////////////
//
//  Program Name : Program37_3
//  Description  : Find first occurrence index of a character
//  Input        : String, Character
//  Output       : Integer index
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int firstChar(String str, char ch)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
                return i;
        }
        return -1;
    }
}

class Program37_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.firstChar("Marvellous Multi OS", 'e');

        System.out.println("Character location is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Multi OS", 'M'
//  Output : Character location is: 0
//
//  Input  : "Marvellous Multi OS", 'W'
//  Output : Character location is: -1
//
//  Input  : "Marvellous Multi OS", 'e'
//  Output : Character location is: 4
//
////////////////////////////////////////////////////////////////////
