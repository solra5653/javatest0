package loop.sample;

import java.util.Scanner;

/**
 * 횟수가 정해진 반복에 주로 사용함
 * for(초기식; 조건식; 증감식){
 * 		반복수행할 구문들;
 * }
 * 
 * 초기식 : 반복 카운트의 시작값 명시함
 * 				변수 = 시작값; 또는 자료형 변수명 = 시작값;
 * 조건식 : 반복의 종료값 명시함, 조건이 참일 동안 반복이 수행됨
 * 				카운트변수 비교연산자 종료값(예 : k < 11)
 * 증감식 : 반복횟수를 결정함
 * 				카운트변수++ 또는 ++카운트변수 또는 변수--
 * 				변수 += 증가값, 변수 -= 감소값
 * 
 * for 실행 흐름 : 
 * 초기식 -> 조건식 -> true이면 블럭{} 안의 반복수행내용 실행
 * -> 증감식 -> 조건식 -> true : 반복수행........
 * -> 증감식 -> 조건식 -> false : 반복종료됨
 *
 */
public class ForSample {
	//1부터 100까지 정수들의 합계를 구해라
	public void sumNumbers() {
		int sum = 0;
		System.out.println("[1~100까지의 정수의 합]");
		for(int k = 1; k < 101; k++)
		{
		   sum += k;
		   if(k <100 ) {
			 
		   System.out.print(k+ "+");
		   }else {
			   System.out.println(k);
			   System.out.println( " = " + sum);
		   }
		}
		System.out.println("");
		System.out.println("1~100까지의 정수의 합 : " + sum);
	}
	public void sumNumbers2() {
		int sum,k;
		//for문에서 초기식이 딱 한번만 실행됨
		//초기식 위치에 여러개의 변수 값 지정할 수도 있음
		System.out.println("[1~100까지의 정수의 합]");
		for( k = 1 ,sum = 0; k < 101; k++)
		{
		   sum += k; //sum = sum+k;
		   if(k <100 ) {
			 
		   System.out.print(k+ "+");
		   }else {
			   System.out.println(k);
			   System.out.println( " = " + sum);
		   }
		}
		System.out.println("");
		System.out.println("1~100까지의 정수의 합 : " + sum);
	}
	
	//1부터 100까지 정수들중 짝수들만 합계를 구해서 출력
	public void sum1To100Even() {
		int sum,k;
		//for문에서 초기식이 딱 한번만 실행됨
		//초기식 위치에 여러개의 변수 값 지정할 수도 있음
		System.out.println("[1부터 100까지 정수들중 짝수들만 합계]");
		for( k = 2 ,sum = 0; k < 101; k+=2)
		{
			
		   sum += k;//sum = sum+k;
		   if(k == 100 ) {
			
		   System.out.print(k+ "=");
		   }else {
			   System.out.print(k + "+");
		   }
		}
		System.out.println("");
		System.out.println("1부터 100까지 정수들중 짝수들의 합 : " + sum);
	}
	//정수 두 개를 임의로 입력 받아, 두수 중 작은값에서 큰값까지
	//정수들의 합계를 구해서 출력
	//첫번째 정수 : 12
	//두번째 정수 : 7
	//7+8+9+10+11+12=합계
	public void sumMintoMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int first= sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second= sc.nextInt();
		
		
		int min; 
		int max;
		   if(first > second ) {
			max = first;
			min = second;
		   }else {
			   max = second;
			min = first;
		   }
		   int sum=0;
		   for (int k = min; k<=max; k++) {
			   sum += k;
			   if(k==max) {
				   System.out.print(k+ "=");
			   }else {
				   System.out.print(k +"+");
			   }
		   }
		System.out.println(sum);
	}
	/*
	 * 정수 하나 입력받아서, 그 수의 구구단 출력
	 * 정수 입력 : 3
	 * 3*1 = 3
	 * 3*2 = 6
	 * 3*3 = 9
	 * 3*4 = 12
	 * 3*5 = 15
	 * 3*6 = 18
	 * 3*7 = 21
	 * 3*8 = 24
	 * 3*9 = 27
	 */
	public void printGugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a= sc.nextInt();
		
		for(int b = 1; b<=9; b++) {
			System.out.println(a+" * " +b +" = "+(a*b));
		}	
	}
	//1부터 100사이의 임의 정수를 발생시킴
	//1부터 임의의 정수까지의 합계 구해서 출력
	public void sum1toRandom() {
		int value =  (int)(Math.random()*(100))+1;
		int sum=0;
		System.out.println("[1~100까지에서 1~임의 정수의 합]");
		System.out.println("임의 정수 : " + value);
		for( int k = 1; k<=value ; k++)
		{
		   sum += k; //sum = sum+k;
		   if(k == value ) {
			 
		   System.out.print(k+ "=");
		   }else {
			   System.out.print(k + "+");
		   }
		}
		System.out.println(sum);
	}	
}
