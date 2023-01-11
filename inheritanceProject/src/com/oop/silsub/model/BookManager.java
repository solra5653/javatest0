package com.oop.silsub.model;

import java.util.Scanner;

import com.opp.array3.model.Book;


public class BookManager {
	
	public static int count;
	private Book[] bar = null;
	Scanner sc;
	
	{
		bar= new Book[10];
		sc = new Scanner(System.in);
		bar[0] = new Book("자바1", "홍길동1",35000,0.10, "책방0");
		bar[1] = new Book("자바2", "홍길동2",45000,0.15, "책방1");
		bar[2] = new Book("자바3", "홍길동3",55000,0.17, "책방2");
		bar[3] = new Book("자바4", "홍길동4",65000,0.23, "책방3");		
	}
	static {
		count = 4;
	}
	public BookManager() {
		
	}
	public void menu() {
		do {
			System.out.println("***** 도서 관리 메뉴 *****\n");
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				bookInput();
				break;
			case 2:
				bookAllOutput();
				break;

			case 7:
					return;
			}
		} while (true);
}
	public void bookAllOutput() {
		for (int i = 0; i < count; i++) {
		System.out.println(bar[i].info());
		}
	}
	public void bookInput() {
			bar[count] = new Book();
			System.out.println((count + 1) + "번째 회원의 정보 입력");
			System.out.print(" 책이름 : ");
			bar[count].setTitle(sc.next());
			System.out.print(" 저자 : ");
			bar[count].setAuthor(sc.next());
			System.out.print(" 가격 : ");
			bar[count].setPrice(sc.nextInt());
			System.out.print("할인률 : ");
			bar[count].setDiscountRate(sc.nextDouble());
			System.out.print("출판사 : ");
			bar[count].setPublisher(sc.next());
			count++;
		return;
	}
}
