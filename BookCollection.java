package com.lab_assessment_6_Q3;

import java.util.*;

public class BookCollection {
	
	private String ownerName;
	List<Book> list = new ArrayList<Book>();
	
	public void hasBook(Book book) {
		boolean hasBook = false;
		if(list.contains(book)) {
			hasBook = true;
		}
		if(hasBook) {
			System.out.println("book found");
		} else {
			System.out.println("not found");
		}
	}

	public void sortByBookName() {
		Collections.sort(list);
		printBooks();
	}
	
	public void sortByAuthor() {
		Collections.sort(list, new sortByAuthorName());
		printBooks();
	}
	
	public void printBooks() {
		for(Book book: list) {
			System.out.println(book);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [");
		for(int i=0; i<list.size();i++) {
			builder.append(" [author =");
			builder.append(list.get(i).getAuthor());
			builder.append(" title =");
			builder.append(list.get(i).getBookName());
			builder.append("]");
		}
		builder.append(" ]");
		return builder.toString();
	}
}