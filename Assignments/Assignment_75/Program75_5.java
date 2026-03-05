///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_5
//  Description  : Calculate income tax using slabs
//  Input        : Annual income
//  Output       : Tax payable
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter annual income : ");
        int income = sobj.nextInt();

        double tax = 0;

        if(income < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(income <= 250000)
        {
            tax = 0;
        }
        else if(income <= 500000)
        {
            tax = (income - 250000) * 0.05;
        }
        else if(income <= 1000000)
        {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        }
        else
        {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        System.out.println("Annual Income: ₹" + income);
        System.out.println("Total Tax Payable: ₹" + tax);

        sobj.close();
    }
}

/*

Test Case 1
Input : 200000
Output :
Annual Income: ₹200000
Total Tax Payable: ₹0

--------------------------------

Test Case 2
Input : 400000
Output :
Annual Income: ₹400000
Total Tax Payable: ₹7500

--------------------------------

Test Case 3
Input : 800000
Output :
Annual Income: ₹800000
Total Tax Payable: ₹72500

--------------------------------

Test Case 4
Input : 1500000
Output :
Annual Income: ₹1500000
Total Tax Payable: ₹262500

*/