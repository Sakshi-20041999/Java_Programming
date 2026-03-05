///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_4
//  Description  : Calculate movie ticket price based on age group
//  Input        : Age of person
//  Output       : Ticket price
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sobj.nextInt();

        int ticket = 0;

        if(age < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        else if(age <= 12)
        {
            ticket = 100;
        }
        else if(age <= 59)
        {
            ticket = 200;
        }
        else
        {
            ticket = 150;
        }

        System.out.println("Ticket Price : ₹" + ticket);

        sobj.close();
    }
}

/*
///////////////////////////////////////////////////////////////////
//
// Test Cases
//
///////////////////////////////////////////////////////////////////

Test Case 1
Input :
Enter age : 10

Output :
Ticket Price : ₹100

------------------------------------------------

Test Case 2
Input :
Enter age : 25

Output :
Ticket Price : ₹200

------------------------------------------------

Test Case 3
Input :
Enter age : 60

Output :
Ticket Price : ₹150

------------------------------------------------

Test Case 4
Input :
Enter age : 12

Output :
Ticket Price : ₹100

------------------------------------------------

Test Case 5
Input :
Enter age : -5

Output :
Invalid Input

*/