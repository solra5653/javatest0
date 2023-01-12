package oop.abst;

import java.util.*;

public class TestAbstract {

	public static void main(String[] args) {
		// abstract class test
		// 추상클래스는 레퍼런스 선언은 가능함
		AbstractSample asamp; //다형성 사용 가능함.
		
		//미완성된 클래스를 의미하므로 객체생성은 못함
		
//		asamp = new AbstractSample(); //error
		
		asamp =new SubClass();
		
		
		Calendar today;
		///today = new Calendar();  //abstract class
		today = new GregorianCalendar();
		System.out.println(today);
	}

}
