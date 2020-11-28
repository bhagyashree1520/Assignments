package com.cg.training.labassign10.client;

import java.io.*;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("D://InputFile.txt"));
		 String line;
		 int lineNumber=1;
		 while ((line = br.readLine()) != null) {
		   System.out.println(lineNumber+". "+line); // displaying line by line on screen with line number.
		   lineNumber++;
		 }
	}

}
