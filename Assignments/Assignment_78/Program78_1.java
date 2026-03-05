///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_1
//  Description  : Calculate hotel bill with discount for long stay
//  Input        : Number of days stayed
//  Output       : Final bill amount
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of days stayed : ");
        int days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int bill = days * 3000;

        if(days > 7)
        {
            bill = bill - (bill * 5 / 100);
        }

        System.out.println("Total Stay Duration : " + days + " days");
        System.out.println("Final Bill Amount : ₹" + bill);

        sobj.close();
    }
}

/*
Test Cases

Input : 5
Output :
Total Stay Duration : 5 days
Final Bill Amount : ₹15000

Input : 7
Output :
Total Stay Duration : 7 days
Final Bill Amount : ₹21000

Input : 10
Output :
Total Stay Duration : 10 days
Final Bill Amount : ₹28500

Input : -2
Output :
Invalid Input
*/