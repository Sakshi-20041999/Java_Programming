////////////////////////////////////////////////////////////////////
//
//  Program Name : Program19_2
//  Description  : Display grade based on marks
//  Input        : Integer marks
//  Output       : Prints Grade
//  Author       : Sakshi Santosh Jadhav
//  Date         : 24/10/2025
//
////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 90)
            System.out.println("Grade: A+");
        else if(marks >= 75)
            System.out.println("Grade: A");
        else if(marks >= 60)
            System.out.println("Grade: B");
        else if(marks >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

class Program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : 82
//  Output : Grade: A
//
//  Input  : 35
//  Output : Grade: Fail
//
//  Input  : 95
//  Output : Grade: A+
//
////////////////////////////////////////////////////////////////////
