package com.practic3.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// 상속 실습문제 1의 문제 3
		Point[] pArray = new Point[5];
		
		//Point 레퍼런스 = Circle, Rectangle 객체의 주소;
		//상송관계에 있는 클래스일 때
		//부모 타입의 레퍼런스 = 후손 객체의 주소; 대입 가능함
		//자동형변환됨 : UpCasting(후손타입이 부모타입으로 바뀜)
		//후손 안에 부모의 정보가 들어있기 때문에 가능함
		//다향성(Polymorphism) 기술이 사용되었음.
		pArray[0] =new Circle(100,100,50);
		pArray[1] =new Rectangle(100,100,50,30);
		pArray[2] =new Circle(150,150,40);
		pArray[3] =new Circle(200,200,60);
		pArray[4] =new Rectangle(50,100,150,30);
		
		for(Point p: pArray) {
			p.draw();  //동적(dynamic == runtime(실행시)) 바인딩됨
			//컴파일시에는 Point 클래스의 draw()를 연결함
			//실행할 때 (동적) 참조하는 객체의 자료형에 따라
			//실행할 메소드 연결을 바꾸어서 실행함
			//오버라이딩된 메소드일 때
			
		}
	}

}
