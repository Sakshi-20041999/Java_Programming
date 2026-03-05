///////////////////////////////////////////////////////////////////
//
//  Program Name : Program79_4
//  Description  : Analyze weekly temperature readings
//  Input        : Temperature of cities for 7 days
//  Output       : Average temperature and highest temperature
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program79_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of cities : ");
        int C = sobj.nextInt();

        if(C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[C][7];

        System.out.println("Enter temperature for 7 days:");

        for(int i = 0; i < C; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int max = arr[0][0];
        int sum = 0;

        for(int i = 0; i < C; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                sum = sum + arr[i][j];

                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }

        double avg = (double)sum / (C * 7);

        System.out.println("\nAverage Temperature : " + avg);
        System.out.println("Highest Temperature : " + max);

        sobj.close();
    }
}

/*
Test Case

Input
2
30 31 32 33 34 35 36
28 29 30 31 32 33 34

Output
Average Temperature : 31.0
Highest Temperature : 36
*/