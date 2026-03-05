///////////////////////////////////////////////////////////////////
//
//  Program Name : Program78_3
//  Description  : Count goal achieved days and maximum steps
//  Input        : Steps of 7 days
//  Output       : Goal achieved days and maximum steps
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program78_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int steps[] = new int[7];
        int goalDays = 0;
        int max = 0;

        System.out.println("Enter steps for 7 days : ");

        for(int i = 0; i < 7; i++)
        {
            steps[i] = sobj.nextInt();

            if(steps[i] < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(steps[i] >= 10000)
            {
                goalDays++;
            }

            if(steps[i] > max)
            {
                max = steps[i];
            }
        }

        System.out.println("Goal Achieved Days : " + goalDays);
        System.out.println("Maximum Steps in Week : " + max);

        sobj.close();
    }
}

/*
Test Cases

Input :
8000 9000 10000 12000 7000 15000 6000

Output :
Goal Achieved Days : 3
Maximum Steps in Week : 15000

Input :
10000 10000 10000 10000 10000 10000 10000

Output :
Goal Achieved Days : 7
Maximum Steps in Week : 10000

Input :
2000 3000 4000 5000 6000 7000 8000

Output :
Goal Achieved Days : 0
Maximum Steps in Week : 8000
*/