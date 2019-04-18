package com.cg.model;

public class Bookss {

	private static int Book_ID;
	private static String Title;
	private static String Author1;
	private static String Author2;
	private static String Publisher;

	public Bookss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBook_ID() {
		return Book_ID;
	}

	public void setBook_ID(int book_ID) {
		Book_ID = book_ID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor1() {
		return Author1;
	}

	public void setAuthor1(String author1) {
		Author1 = author1;
	}

	public String getAuthor2() {
		return Author2;
	}

	public void setAuthor2(String author2) {
		Author2 = author2;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Override
	public String toString() {
		return "Books [Book_ID=" + Book_ID + ", Title=" + Title + ", Author1=" + Author1 + ", Author2=" + Author2
				+ ", Publisher=" + Publisher + "]";
	}

}
