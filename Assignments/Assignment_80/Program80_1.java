///////////////////////////////////////////////////////////////////
//
//  Program Name : Program80_1
//  Description  : Analyze electricity consumption of cities for a week
//  Input        : Number of cities and units consumed for 7 days
//  Output       : Weekly consumption, highest consuming city, peak day
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program80_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of cities : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[N][7];

        System.out.println("Enter units consumed for 7 days :");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int totals[] = new int[N];
        int maxCity = 0;

        System.out.println("\nWeekly Consumption:");

        for(int i = 0; i < N; i++)
        {
            int sum = 0;

            for(int j = 0; j < 7; j++)
            {
                sum = sum + arr[i][j];
            }

            totals[i] = sum;
            System.out.println("City " + (i+1) + ": " + sum);

            if(totals[i] > totals[maxCity])
            {
                maxCity = i;
            }
        }

        int peakDay = 0;
        int maxDaySum = 0;

        for(int j = 0; j < 7; j++)
        {
            int sum = 0;

            for(int i = 0; i < N; i++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > maxDaySum)
            {
                maxDaySum = sum;
                peakDay = j;
            }
        }

        System.out.println("\nHighest Consumption: City " + (maxCity+1));
        System.out.println("Peak Consumption Day: Day " + (peakDay+1));

        System.out.println("\nCities consuming more than 500 units:");

        for(int i = 0; i < N; i++)
        {
            if(totals[i] > 500)
            {
                System.out.println("City " + (i+1));
            }
        }

        sobj.close();
    }
}

/*
Test Case

Input
2
100 120 90 80 110 95 105
70 80 60 75 65 85 90

Output
Weekly Consumption:
City 1: 700
City 2: 525

Highest Consumption: City 1
Peak Consumption Day: Day 2

Cities consuming more than 500 units:
City 1
City 2
*/