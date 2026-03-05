///////////////////////////////////////////////////////////////////
//
//  Program Name : Program74_4
//  Description  : Calculate electricity bill using slabs
//  Input        : Units consumed
//  Output       : Total bill amount
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program74_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter total units consumed : ");
        int units = sobj.nextInt();

        int bill = 0;

        if(units < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(units <= 100)
        {
            bill = units * 5;
        }
        else if(units <= 200)
        {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        if(units >= 0)
        {
            System.out.println("Total Units Consumed: " + units);
            System.out.println("Total Electricity Bill: ₹" + bill);
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
Input :
Enter total units consumed : 50

Output :
Total Units Consumed: 50
Total Electricity Bill: ₹250
Explanation :
50 × 5 = 250

------------------------------------------------

Test Case 2
Input :
Enter total units consumed : 100

Output :
Total Units Consumed: 100
Total Electricity Bill: ₹500
Explanation :
100 × 5 = 500

------------------------------------------------

Test Case 3
Input :
Enter total units consumed : 150

Output :
Total Units Consumed: 150
Total Electricity Bill: ₹850
Explanation :
First 100 units → 100 × 5 = 500
Next 50 units → 50 × 7 = 350
Total = 850

------------------------------------------------

Test Case 4
Input :
Enter total units consumed : 200

Output :
Total Units Consumed: 200
Total Electricity Bill: ₹1200
Explanation :
100 × 5 = 500
100 × 7 = 700
Total = 1200

------------------------------------------------

Test Case 5
Input :
Enter total units consumed : 250

Output :
Total Units Consumed: 250
Total Electricity Bill: ₹1700
Explanation :
100 × 5 = 500
100 × 7 = 700
50 × 10 = 500
Total = 1700

------------------------------------------------

Test Case 6
Input :
Enter total units consumed : -10

Output :
Invalid Input

*/
