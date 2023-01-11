package com.opp.array3.model;

public class Book {
//Field
	private String title;					//도서제목
	private String author;				//저장명
	private int price;						//도서가격
	private double discountRate;	//할인율
	private String publisher;			//출판사
	public char[] bookInput;
	
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(String title, String author, int price
			, double discountRate, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//일반 메소드
	public String info() {
		return "Book [ " + this.title + ", " 
					+ this.author + ", "
					+ this.price + "원, "
					+ this.discountRate + "% 할인, "
					+ this.publisher + "출판 ]";
	}
	
}
