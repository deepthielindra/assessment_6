package com.lab_assessment_6_Q3;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "head first java", "bates");
		Book book1 = new Book(2, "ikigai", "mercika");
		Book book2 = new Book(3, "amex", "amer");
		Book book3 = new Book(4, "let's us c", "Yaswanth kanethkar");
		
		
		BookCollection bookCol = new BookCollection();
		bookCol.list.add(book);
		bookCol.list.add(book1);
		bookCol.list.add(book2);
		bookCol.list.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.list);
		
		//check whether book is there or not
		Book bookUpdate = new Book("ikigai", "george");
		bookCol.hasBook(bookUpdate);
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> list) {
		//print the book
		for(Book book: list) {
			System.out.println(book);
		}
	}

}

