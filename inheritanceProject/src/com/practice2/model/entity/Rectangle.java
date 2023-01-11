package com.practice2.model.entity;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.printf(" 면적 = "+ width*height);
		System.out.println();
		System.out.printf(" 둘래 = "+ 2*(width*height));
		System.out.println();
	}
	

}
