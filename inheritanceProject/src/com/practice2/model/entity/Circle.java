package com.practice2.model.entity;

public class Circle extends Point {
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super();
		this.x= x;
		this.y = y;
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public void draw() {
		System.out.printf(" 원면적 = %.1f",(Math.PI*radius*radius));
		System.out.println();
		System.out.printf(" 원둘레 = "+ String.format("%.1f",(2*Math.PI*radius)));
		System.out.println();
	}
}
