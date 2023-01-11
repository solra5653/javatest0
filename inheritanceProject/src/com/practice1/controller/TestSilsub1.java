package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		Book bk = new Book();
		
		System.out.println("toString 출력");
		Book bk1 = new Book("자바1","홍길동",5000);
		System.out.println("bk1 : " +bk1.toString());
		Book bk2 = new Book("자바2","황지니",9000);
		System.out.println("bk2 : " +bk2.toString());
		
		System.out.println("equals 출력");
		System.out.println("확인  : " + bk1.equals(bk2));
		
		System.out.println("clone 출력");
		Book bk3 = (Book)bk1.clone();
		System.out.println("확인 1 : " + (bk1 == bk3));
		System.out.println("확인 2 : " + bk1.equals(bk3));
		
		
		
		
//		System.out.println("clone : " + );
		

	}

}
