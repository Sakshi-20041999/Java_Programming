///////////////////////////////////////////////////////////////////
//
//  Program Name : Program80_5
//  Description  : Monitor patient temperature readings in hospital
//  Input        : Number of patients and daily temperatures
//  Output       : Average temperature and highest temperature
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program80_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of patients : ");
        int P = sobj.nextInt();

        System.out.print("Enter number of days : ");
        int D = sobj.nextInt();

        if(P <= 0 || D <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[P][D];

        System.out.println("Enter temperature readings:");

        for(int i = 0; i < P; i++)
        {
            for(int j = 0; j < D; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int max = arr[0][0];
        int sum = 0;

        for(int i = 0; i < P; i++)
        {
            for(int j = 0; j < D; j++)
            {
                sum = sum + arr[i][j];

                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }

        double avg = (double)sum / (P * D);

        System.out.println("\nAverage Temperature : " + avg);
        System.out.println("Highest Temperature : " + max);

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
98 99 100
97 98 99

Output
Average Temperature : 98.5
Highest Temperature : 100

------------------------------------------------

Input
3
2
99 100
101 98
97 96

Output
Average Temperature : 98.5
Highest Temperature : 101
*/