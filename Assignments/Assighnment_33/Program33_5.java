////////////////////////////////////////////////////////////////////
//
//  Program Name : Program33_5
//  Description  : Display exam timing based on division (A-D)
//  Input        : Character (Division)
//  Output       : Exam timing message
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program33_5
{
    public static void DisplaySchedule(char chDiv)
    {
        chDiv = Character.toUpperCase(chDiv);

        switch(chDiv)
        {
            case 'A':
                System.out.println("Your exam at 7.00 AM");
                break;
            case 'B':
                System.out.println("Your exam at 8.30 AM");
                break;
            case 'C':
                System.out.println("Your exam at 9.20 AM");
                break;
            case 'D':
                System.out.println("Your exam at 10.30 AM");
                break;
            default:
                System.out.println("Invalid division");
                break;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your division:");
        char cValue = sc.next().charAt(0);

        DisplaySchedule(cValue);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : C
//  Output : Your exam at 9.20 AM
//
//  Input  : d
//  Output : Your exam at 10.30 AM
//
////////////////////////////////////////////////////////////////////
