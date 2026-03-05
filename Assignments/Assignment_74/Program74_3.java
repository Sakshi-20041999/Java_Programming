///////////////////////////////////////////////////////////////////
//
//  Program Name : Program74_3
//  Description  : Generate student result and classification
//  Input        : Marks of 5 subjects
//  Output       : Fail / Classification
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program74_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int marks[] = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 subjects : ");

        for(int i = 0; i < 5; i++)
        {
            marks[i] = sobj.nextInt();

            if(marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Invalid Input");
                return;
            }

            sum = sum + marks[i];
        }

        for(int i = 0; i < 5; i++)
        {
            if(marks[i] < 35)
            {
                System.out.println("Result: Fail");
                return;
            }
        }

        float avg = sum / 5.0f;

        System.out.println("Average Marks: " + avg);

        if(avg >= 75)
            System.out.println("Final Result: Distinction");
        else if(avg >= 60)
            System.out.println("Final Result: First Class");
        else if(avg >= 50)
            System.out.println("Final Result: Second Class");
        else
            System.out.println("Final Result: Pass");

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
Enter marks of 5 subjects :
80
85
78
90
88

Output :
Average Marks: 84.2
Final Result: Distinction

------------------------------------------------

Test Case 2
Input :
Enter marks of 5 subjects :
65
70
60
62
68

Output :
Average Marks: 65.0
Final Result: First Class

------------------------------------------------

Test Case 3
Input :
Enter marks of 5 subjects :
55
52
58
50
54

Output :
Average Marks: 53.8
Final Result: Second Class

------------------------------------------------

Test Case 4
Input :
Enter marks of 5 subjects :
40
45
38
42
41

Output :
Average Marks: 41.2
Final Result: Pass

------------------------------------------------

Test Case 5
Input :
Enter marks of 5 subjects :
80
30
75
60
70

Output :
Result: Fail

------------------------------------------------

Test Case 6
Input :
Enter marks of 5 subjects :
90
85
110
70
80

Output :
Invalid Input

*/
