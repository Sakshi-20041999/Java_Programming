///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_3
//  Description  : Check stock availability and update stock
//  Input        : Current stock and requested quantity
//  Output       : Order status and remaining stock
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter current stock : ");
        int stock = sobj.nextInt();

        System.out.print("Enter requested quantity : ");
        int qty = sobj.nextInt();

        if(stock < 0 || qty <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(qty > stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            stock = stock - qty;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);

            if(stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }

        sobj.close();
    }
}

/*

Test Case 1
Input :
Stock : 20
Quantity : 5

Output :
Order Processed Successfully.
Remaining Stock: 15

--------------------------------

Test Case 2
Input :
Stock : 6
Quantity : 3

Output :
Order Processed Successfully.
Remaining Stock: 3
Low Stock Alert!

--------------------------------

Test Case 3
Input :
Stock : 10
Quantity : 15

Output :
Order Failed: Insufficient Stock.

*/