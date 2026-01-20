////////////////////////////////////////////////////////////////////
//
//  Program Name : Program19_1
//  Description  : Check whether the given year is a leap year or not
//  Input        : Integer year
//  Output       : Prints whether the year is leap or not
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

class Program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 2024
//  Output : 2024 is a Leap Year.
//
//  Input  : 2023
//  Output : 2023 is not a Leap Year.
//
//  Input  : 2000
//  Output : 2000 is a Leap Year.
//
////////////////////////////////////////////////////////////////////
