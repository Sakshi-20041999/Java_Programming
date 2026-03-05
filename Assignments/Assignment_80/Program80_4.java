///////////////////////////////////////////////////////////////////
//
//  Program Name : Program80_4
//  Description  : Analyze transactions of bank branches using 2D array
//  Input        : Number of branches and transactions
//  Output       : Total transaction per branch and highest branch
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program80_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of branches : ");
        int B = sobj.nextInt();

        System.out.print("Enter number of transactions per branch : ");
        int T = sobj.nextInt();

        if(B <= 0 || T <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[B][T];

        System.out.println("Enter transaction amounts:");

        for(int i = 0; i < B; i++)
        {
            for(int j = 0; j < T; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int maxBranch = 0;
        int totals[] = new int[B];

        System.out.println("\nTotal Transactions Per Branch:");

        for(int i = 0; i < B; i++)
        {
            int sum = 0;

            for(int j = 0; j < T; j++)
            {
                sum = sum + arr[i][j];
            }

            totals[i] = sum;

            System.out.println("Branch " + (i+1) + " : ₹" + sum);

            if(totals[i] > totals[maxBranch])
            {
                maxBranch = i;
            }
        }

        System.out.println("\nBranch With Highest Transaction : Branch " + (maxBranch + 1));

        sobj.close();
    }
}

/*
///////////////////////////////////////////////////////////////////
//
// Test Cases
//
///////////////////////////////////////////////////////////////////

Input
2
3
1000 2000 3000
1500 2500 3500

Output
Total Transactions Per Branch:
Branch 1 : ₹6000
Branch 2 : ₹7500

Branch With Highest Transaction : Branch 2

------------------------------------------------

Input
3
2
500 600
700 800
400 300

Output
Total Transactions Per Branch:
Branch 1 : ₹1100
Branch 2 : ₹1500
Branch 3 : ₹700

Branch With Highest Transaction : Branch 2
*/