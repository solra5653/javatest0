package oop.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice3  {
	public static void main(String[] args) {
		
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(15.5);
		iarr[1] = new Rectangle(34.5, 42.7);
		iarr[2] = new Triangle(45.8, 75.5);
		iarr[3] = new Triangle(35.7, 22.3);
		iarr[4] = new Rectangle(18.5, 17.2);
		
		for(int i =0; i<iarr.length; i++) {
			
			if(iarr[i] instanceof Circle) {
				System.out.printf("원면적 : %.1f" ,((Circle)iarr[i]).area());
				System.out.println();
				System.out.printf("원둘레 : %.1f" ,((Circle)iarr[i]).perimeter());
				System.out.println();
				System.out.println();
			}else if(iarr[i] instanceof Rectangle) {
				System.out.printf("사각형면적 : %.1f" , ((Rectangle)iarr[i]).area());
				System.out.println();
				System.out.printf("사각형둘레 : %.1f", ((Rectangle)iarr[i]).perimeter());
				System.out.println();
				System.out.println();
			}else if(iarr[i] instanceof Triangle) {
				System.out.printf("삼각형의 넓이 : %.1f" , ((Triangle)iarr[i]).area());
				System.out.println();
				System.out.printf("빗변길이 : %.1f", ((Triangle)iarr[i]).getHypotenuse());
				System.out.println();
				System.out.printf("둘레길이 : %.1f", ((Triangle)iarr[i]).perimeter());
				System.out.println();
				System.out.println();	
			}
		}
			
		}


}
