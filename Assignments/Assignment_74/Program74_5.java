///////////////////////////////////////////////////////////////////
//
//  Program Name : Program74_5
//  Description  : Calculate final payable amount with discount
//  Input        : Purchase amount and membership type
//  Output       : Final payable amount
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program74_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter purchase amount : ");
        int amount = sobj.nextInt();

        System.out.print("Enter membership type (Premium/Regular) : ");
        String membership = sobj.next();

        if(amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(!membership.equals("Premium") && !membership.equals("Regular"))
        {
            System.out.println("Invalid Membership Type");
            return;
        }

        double discount = 0;

        if(amount > 5000)
            discount = amount * 0.20;
        else if(amount > 2000)
            discount = amount * 0.10;

        double finalAmount = amount - discount;

        if(membership.equals("Premium"))
        {
            double extra = finalAmount * 0.05;
            discount = discount + extra;
            finalAmount = finalAmount - extra;
        }

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);

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
Input :
Enter purchase amount : 6000
Enter membership type (Premium/Regular) : Premium

Output :
Original Amount: ₹6000
Total Discount: ₹1440.0
Final Payable Amount: ₹4560.0

Explanation :
Main Discount = 20% of 6000 = 1200
Amount after discount = 4800
Extra Premium Discount = 5% of 4800 = 240
Total Discount = 1440
Final Amount = 4560

------------------------------------------------

Test Case 2
Input :
Enter purchase amount : 6000
Enter membership type (Premium/Regular) : Regular

Output :
Original Amount: ₹6000
Total Discount: ₹1200.0
Final Payable Amount: ₹4800.0

Explanation :
20% discount applied, no extra discount.

------------------------------------------------

Test Case 3
Input :
Enter purchase amount : 3000
Enter membership type (Premium/Regular) : Premium

Output :
Original Amount: ₹3000
Total Discount: ₹435.0
Final Payable Amount: ₹2565.0

Explanation :
Main Discount = 10% of 3000 = 300
Remaining = 2700
Extra Premium Discount = 5% of 2700 = 135
Total Discount = 435

------------------------------------------------

Test Case 4
Input :
Enter purchase amount : 1500
Enter membership type (Premium/Regular) : Regular

Output :
Original Amount: ₹1500
Total Discount: ₹0.0
Final Payable Amount: ₹1500.0

Explanation :
No discount applicable.

------------------------------------------------

Test Case 5
Input :
Enter purchase amount : -200
Enter membership type (Premium/Regular) : Premium

Output :
Invalid Input

------------------------------------------------

Test Case 6
Input :
Enter purchase amount : 2500
Enter membership type (Premium/Regular) : Gold

Output :
Invalid Membership Type

*/
