package oop.run;

import oop.encapsulation.Product;

public class TestProduct2 {

	public static void main(String[] args) {
		// Product 클래스 사용 테스트 2
		
		// 크래스명 레퍼런스변수 = new 생성자();
		//기본생성자를 사용 : 객체 생성하고 기본값으로 초기화
		Product p1 = new Product();
		//필드값 확인
		System.out.println(p1.productInfo());
		
		//객체 생성시 전달된 값으로 초기화를 하려면
		//제공되는 매개변수 있는 생성자를 사용하면 됨
		Product p2 = new Product("ssgnote10",
				"갤러시노트10","경기도기흥",1250000,0.1);
		System.out.println(p2.productInfo());
		
	}
}
