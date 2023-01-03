package oop.test;

import oop.access.PublicSample;
//import oop.access.DefaultSample; //접근 불가능 : error

//
public class TestClass {
	//클래스 사용 1 : 필드로 사용
	private PublicSample ps; //public class : 패키지 밖 사용가능
	
	//클래스 사용 2 : 메소드 지역변수로 사용
	public void testMethod() {
		PublicSample ps2;
		//DefaultSample ds; //default class : 패키지 밖 사용못함
		
	}
}
