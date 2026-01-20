////////////////////////////////////////////////////////////////////
//
//  Program Name : Program37_1
//  Description  : Check whether character is present in string
//  Input        : String, Character
//  Output       : Boolean (Character found or not)
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    boolean chkChar(String str, char ch)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
                return true;
        }
        return false;
    }
}

class Program37_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        boolean bRet = obj.chkChar("Marvellous Multi OS", 'e');

        if(bRet)
            System.out.println("Character found");
        else
            System.out.println("Character not found");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : "Marvellous Multi OS", 'e'
//  Output : Character found
//
//  Input  : "Marvellous Multi OS", 'W'
//  Output : Character not found
//
////////////////////////////////////////////////////////////////////
