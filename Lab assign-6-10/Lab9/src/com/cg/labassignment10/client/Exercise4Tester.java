package com.cg.labassignment10.client;

import java.util.function.Supplier;

import com.cg.labassignment10.service.BookDetails;

public class Exercise4Tester {

	public static void main(String[] args) {
		

		Supplier<BookDetails> bookDetails = BookDetails::new;
		
		System.out.println(bookDetails.get());
	}

}