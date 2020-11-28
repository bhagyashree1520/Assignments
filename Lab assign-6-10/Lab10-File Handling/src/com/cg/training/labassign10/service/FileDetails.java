package com.cg.training.labassign10.service;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import com.cg.training.labassign10.client.FileTester;



public class FileDetails {
private static Scanner sc = new Scanner(System.in);
	  public static void main(String rr[])throws IOException
      {
          FileTester fileTest=new FileTester();
          System.out.println("Enter File Name:");
		  String fn = sc.next();
		  File f = new File(fn); 
		  fileTest.displayFileDetails(f);
		  
		 
      }
}
