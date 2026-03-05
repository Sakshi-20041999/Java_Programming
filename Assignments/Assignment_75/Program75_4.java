///////////////////////////////////////////////////////////////////
//
//  Program Name : Program75_4
//  Description  : Calculate traffic rule violation fine
//  Input        : Helmet, License, Overspeeding
//  Output       : Total fine
//  Author       : Sakshi Santosh Jadhav
//  Date         : 26/02/2026
//
///////////////////////////////////////////////////////////////////

import java.util.*;

class Program75_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Helmet worn (Yes/No) : ");
        String helmet = sobj.next();

        System.out.print("License available (Yes/No) : ");
        String license = sobj.next();

        System.out.print("Overspeeding (Yes/No) : ");
        String speed = sobj.next();

        int fine = 0;

        if(helmet.equals("No"))
        {
            fine = fine + 500;
        }

        if(license.equals("No"))
        {
            fine = fine + 1000;
        }

        if(speed.equals("Yes"))
        {
            fine = fine + 1500;
        }

        System.out.println("Total Fine Amount: ₹" + fine);

        sobj.close();
    }
}

/*

Test Case 1
Input :
Helmet : No
License : Yes
Speed : No

Output :
Total Fine Amount: ₹500

--------------------------------

Test Case 2
Input :
Helmet : No
License : No
Speed : Yes

Output :
Total Fine Amount: ₹3000

*/