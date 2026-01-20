////////////////////////////////////////////////////////////////////
//
//  Program Name : Program34_3
//  Description  : Display series based on input character
//  Input        : Character
//  Output       : Character series
//  Author       : Sakshi Santosh Jadhav
//  Date         : 27/11/2025
//
////////////////////////////////////////////////////////////////////

import java.util.*;

class Program34_3
{
    public static void Display(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            for(char c = ch; c <= 'Z'; c++)
            {
                System.out.print(c + "\t");
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(char c = ch; c >= 'a'; c--)
            {
                System.out.print(c + "\t");
            }
        }
        else
        {
            return;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sc.next().charAt(0);

        Display(cValue);
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : Q
//  Output : Q	R	S	T	U	V	W	X	Y	Z
//
//  Input  : m
//  Output : m	l	k	j	i	h	g	f	e	d	c	b	a
//
//  Input  : 8
//  Output : (No output)
//
////////////////////////////////////////////////////////////////////
