///////////////////////////////////////////////////////////////////
//
//  Program Name : Program74_2
//  Description  : Simulate ATM withdrawal rules
//  Input        : Balance and withdrawal amount
//  Output       : Transaction result
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program74_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter current balance : ");
        int balance = sobj.nextInt();

        System.out.print("Enter withdrawal amount : ");
        int withdrawAmount = sobj.nextInt();

        if(balance < 0 || withdrawAmount <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if(withdrawAmount % 100 != 0)
        {
            System.out.println("Transaction Failed: Amount must be multiple of 100");
        }
        else if(withdrawAmount > 25000)
        {
            System.out.println("Transaction Failed: Exceeds maximum withdrawal limit");
        }
        else if(balance - withdrawAmount < 1000)
        {
            System.out.println("Transaction Failed: Minimum balance requirement not maintained");
        }
        else
        {
            balance = balance - withdrawAmount;
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: ₹" + balance);
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
Enter current balance : 5000
Enter withdrawal amount : 2000

Output :
Transaction Successful.
Remaining Balance: ₹3000

------------------------------------------------

Test Case 2
Input :
Enter current balance : 5000
Enter withdrawal amount : 250

Output :
Transaction Failed: Amount must be multiple of 100

------------------------------------------------

Test Case 3
Input :
Enter current balance : 50000
Enter withdrawal amount : 30000

Output :
Transaction Failed: Exceeds maximum withdrawal limit

------------------------------------------------

Test Case 4
Input :
Enter current balance : 2000
Enter withdrawal amount : 1500

Output :
Transaction Failed: Minimum balance requirement not maintained

------------------------------------------------

Test Case 5
Input :
Enter current balance : -500
Enter withdrawal amount : 1000

Output :
Invalid Input

------------------------------------------------

Test Case 6
Input :
Enter current balance : 10000
Enter withdrawal amount : 0

Output :
Invalid Input

*/
