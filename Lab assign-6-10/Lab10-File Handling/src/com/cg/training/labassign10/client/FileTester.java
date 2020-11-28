package com.cg.training.labassign10.client;

import java.io.File;

public class FileTester {

    public static void displayFileDetails(File f)
    {
           
           if(f.exists())
           {
        	   System.out.println("File Name : "+f.getName());
               System.out.println(f.canRead()?" File is readable":" File is not readable");
               System.out.println(f.canWrite()?" File is writable":" File is not writable");
               System.out.println("File Size : "+f.length()+" in bytes");
               System.out.println("File last mdified : "+f.lastModified());
          
           }
           
    }
}
