///////////////////////////////////////////////////////////////////
//
//  Program Name : Program74_1
//  Description  : Calculate library fine based on days kept
//  Input        : Number of days
//  Output       : Fine amount / No fine
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program74_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter total number of days book was kept : ");
        int daysKept = sobj.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else if(daysKept <= 12)
        {
            int fine = (daysKept - 7) * 5;
            System.out.println("Total fine to be paid: ₹" + fine);
        }
        else
        {
            int fine = (5 * 5) + ((daysKept - 12) * 10);
            System.out.println("Total fine to be paid: ₹" + fine);
        }

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////
//
//  Test Cases
//
///////////////////////////////////////////////////////////////////

/*

Test Case 1
Input  : 5
Output : Returned on time. No fine applicable.

--------------------------------------------

Test Case 2
Input  : 7
Output : Returned on time. No fine applicable.

--------------------------------------------

Test Case 3
Input  : 8
Output : Total fine to be paid: ₹5
Explanation : (8 - 7) * 5 = 5

--------------------------------------------

Test Case 4
Input  : 10
Output : Total fine to be paid: ₹15
Explanation : (10 - 7) * 5 = 15

--------------------------------------------

Test Case 5
Input  : 12
Output : Total fine to be paid: ₹25
Explanation : (12 - 7) * 5 = 25

--------------------------------------------

Test Case 6
Input  : 15
Output : Total fine to be paid: ₹55
Explanation :
Days 8–12 → 5 × 5 = 25
Days after 12 → 3 × 10 = 30
Total Fine = 55

--------------------------------------------

Test Case 7
Input  : -4
Output : Invalid Input

*/
