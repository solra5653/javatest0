package com.loop;

import java.util.Scanner;

public class ForWhile {
	private Scanner sc = new Scanner(System.in);

	public void printStar1() {
		System.out.print("줄수 입력 : ");
		int i = sc.nextInt();

		if (i > 0) {
			for (i = 1; i < 6; i++) {
				for (int j = 1; j < (i + 1); j++) {
					if (i == j) {
						System.out.println(i);
					} else {
						System.out.print("*");
					}
				}

			}
			System.out.println();
		} else {
			System.out.print("양수가 아닙니다.");
		}
	}

	public void printStar2() {
		System.out.print("줄수 입력 : ");
		int line = sc.nextInt();

		if (line > 0) {
			for (int i = 1; i < (line + 1); i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("");
				System.out.println("===============");
			}
		} else if (line < 0) {
			for (int i = 0; i < (line * -1); i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = (line * -1); j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
				System.out.println("===============");
			}
		} else {
			System.out.println("정수 입력 : " + line);
			System.out.println("출력기능 없습니다.");
		}
	}

	public void countInputCharacter() {
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.next();
		
		boolean eng = false; 															     

		for (int i = 0; i < str.length(); i++) 											    
		{
			if(str.charAt(i) > 64 && str.charAt(i) < 91) 								
			{
				eng = true; 											    						
			} else if(str.charAt(i) > 96 && str.charAt(i) < 123) {					
				eng = true; 											    						 
			} else {
				eng = false; 											    					
		}
		
		if(eng==false) {																		
			System.out.println("=====================");
			System.out.println("영문자가 아닙니다.");
		} else {																			           
			System.out.print("문자 하나를 입력해주세요 : ");
			char ch = sc.next().charAt(0);
		
			int count = 0;
			
			for (int index = 0; index < str.length(); index++)	
			{
				if (str.charAt(index) == ch)
				{
				    count++;
				}
			}
			System.out.println(str + "에 포함된 " + ch + "의 갯수는 "
					+ count + "개 입니다.");
		
		}
	}
	}
}
