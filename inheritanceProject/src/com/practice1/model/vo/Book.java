package com.practice1.model.vo;

import java.util.Objects;

public class Book {
	// Field
	private String title; // - title : String //책제목
	private String author; // - author : String //저자명
	private int price; // - price : int //가격

	public Book() {
		super();		//첫줄에만 기록해야함
		System.out.println("Book() 생성자 실행됨");
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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

	@Override
	public String toString() {
		return "Book [ title=" + title + ", author=" + author + ", price=" + price + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if ((this.title == other.title) 
				&& (this.author == other.author) && (this.price == other.price)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object clone() {

		return new Book(this.title, this.author, this.price);
	}
}
