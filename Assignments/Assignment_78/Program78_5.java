///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_5
//  Description  : Calculate telecom call charge using slabs
//  Input        : Call duration in minutes
//  Output       : Total call charge
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter call duration in minutes : ");
        int minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int charge = 0;

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = (10 * 1) + ((minutes - 15) * 2);
        }

        System.out.println("Call Duration : " + minutes + " minutes");
        System.out.println("Total Call Charge : ₹" + charge);

        sobj.close();
    }
}

/*
Test Cases

Input : 4
Output :
Call Duration : 4 minutes
Total Call Charge : ₹0

Input : 10
Output :
Call Duration : 10 minutes
Total Call Charge : ₹5

Input : 15
Output :
Call Duration : 15 minutes
Total Call Charge : ₹10

Input : 20
Output :
Call Duration : 20 minutes
Total Call Charge : ₹20

Input : -3
Output :
Invalid Input
*/