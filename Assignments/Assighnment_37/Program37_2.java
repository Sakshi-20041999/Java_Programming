////////////////////////////////////////////////////////////////////
//
//  Program Name : Program37_2
//  Description  : Count frequency of a character in string
//  Input        : String, Character
//  Output       : Integer count
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    int countChar(String str, char ch)
    {
        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
                count++;
        }
        return count;
    }
}

class Program37_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int iRet = obj.countChar("Marvellous Multi OS", 'M');

        System.out.println("Character frequency is: " + iRet);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Multi OS", 'M'
//  Output : Character frequency is: 2
//
//  Input  : "Marvellous Multi OS", 'W'
//  Output : Character frequency is: 0
//
////////////////////////////////////////////////////////////////////
