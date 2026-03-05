///////////////////////////////////////////////////////////////////
//
//  Program Name : Program79_1
//  Description  : Analyze student performance using 2D matrix
//  Input        : Students, Subjects and marks
//  Output       : Student totals, Topper, Subject averages, Failed students
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program79_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int N = sobj.nextInt();

        System.out.print("Enter number of subjects : ");
        int M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int arr[][] = new int[N][M];

        System.out.println("Enter marks : ");

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0 || arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        int totals[] = new int[N];
        int topperIndex = 0;

        System.out.println("\nStudent Totals:");

        for(int i = 0; i < N; i++)
        {
            int sum = 0;
            for(int j = 0; j < M; j++)
            {
                sum = sum + arr[i][j];
            }

            totals[i] = sum;
            System.out.println("Student " + (i+1) + ": " + sum);

            if(totals[i] > totals[topperIndex])
            {
                topperIndex = i;
            }
        }

        System.out.println("\nTopper: Student " + (topperIndex + 1));

        System.out.println("\nSubject Averages:");

        for(int j = 0; j < M; j++)
        {
            int sum = 0;
            for(int i = 0; i < N; i++)
            {
                sum = sum + arr[i][j];
            }

            double avg = (double)sum / N;
            System.out.printf("Subject %d: %.2f\n", (j+1), avg);
        }

        System.out.println("\nStudents Failed:");

        for(int i = 0; i < N; i++)
        {
            boolean fail = false;

            for(int j = 0; j < M; j++)
            {
                if(arr[i][j] < 35)
                {
                    fail = true;
                }
            }

            if(fail == true)
            {
                System.out.println("Student " + (i+1));
            }
        }

        sobj.close();
    }
}

/*
Test Case 1

Input
3
3
80 70 60
90 85 88
30 40 50

Output
Student Totals:
Student 1: 210
Student 2: 263
Student 3: 120

Topper: Student 2

Subject Averages:
Subject 1: 66.67
Subject 2: 65.00
Subject 3: 66.00

Students Failed:
Student 3
*/