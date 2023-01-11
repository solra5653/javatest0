package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] cc = new Circle[] {
				new Circle(10,10,50),
				new Circle(100,100,35),
				new Circle(200,200,40)
		};
		
		Rectangle [] rt =new Rectangle[] {
				new Rectangle(50,50,50,50),
				new Rectangle(60,60,60,60),
				new Rectangle(70,70,70,70)
		};
		
		for(int i = 0; i< cc.length; i++)
			cc[i].draw();
		
		for(Rectangle r : rt)
			r.draw();
	}

}
