////////////////////////////////////////////////////////////////////
//
//  Program Name : Program60_4
//  Description  : Display files having specific extension
//  Input        : Directory name, Extension
//  Output       : Files with given extension
//  Author       : Sakshi Santosh Jadhav
//  Date         : 29/01/2026
//
////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class Program60_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dname = sobj.nextLine();

        System.out.print("Enter extension : ");
        String ext = sobj.nextLine();

        File dobj = new File(dname);

        if(dobj.exists() && dobj.isDirectory())
        {
            File arr[] = dobj.listFiles();

            for(File f : arr)
            {
                if(f.isFile() && f.getName().endsWith(ext))
                {
                    System.out.println(f.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();
    }
}

////////////////////////////////////////////////////////////////////
//
//  Test Cases
//
//  Input  : .
//           .java
//  Output : Program60_1.java
//           Program60_2.java
//
////////////////////////////////////////////////////////////////////
