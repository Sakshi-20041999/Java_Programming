////////////////////////////////////////////////////////////////////
//
//  Program Name : Program35_4
//  Description  : Check whether string contains vowel
//  Input        : String
//  Output       : TRUE or FALSE
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program35_4
{
    public static boolean ChkVowel(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u')
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        boolean bRet = ChkVowel(str);

        if(bRet == true)
            System.out.println("Contains Vowel");
        else
            System.out.println("There is no Vowel");
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : marvellous
//  Output : Contains Vowel
//
//  Input  : Demo
//  Output : Contains Vowel
//
//  Input  : xyz
//  Output : There is no Vowel
//
////////////////////////////////////////////////////////////////////
