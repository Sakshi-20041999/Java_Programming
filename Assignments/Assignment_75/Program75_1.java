///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_1
//  Description  : Calculate parking fee based on hours
//  Input        : Total parking hours
//  Output       : Total parking fee
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter parking hours : ");
        int hours = sobj.nextInt();

        int fee = 0;

        if(hours < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(hours <= 2)
        {
            fee = 20;
        }
        else
        {
            fee = 20 + ((hours - 2) * 10);
        }

        if(hours > 10)
        {
            fee = fee + 50;
        }

        System.out.println("Total Parking Duration: " + hours + " hours");
        System.out.println("Total Parking Fee: ₹" + fee);

        sobj.close();
    }
}

/*

Test Case 1
Input : 1
Output :
Total Parking Duration: 1 hours
Total Parking Fee: ₹20

----------------------------------

Test Case 2
Input : 5
Output :
Total Parking Duration: 5 hours
Total Parking Fee: ₹50

----------------------------------

Test Case 3
Input : 11
Output :
Total Parking Duration: 11 hours
Total Parking Fee: ₹160

----------------------------------

Test Case 4
Input : -3
Output :
Invalid Input

*/