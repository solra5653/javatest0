package com.practice2.model.entity;

public class Point {
	//Field
	protected int x;
	protected int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void draw() {
		System.out.println("x의 좌표값"+ this.x
				+", y의 좌표값 : "+ this.y);
	}

}
