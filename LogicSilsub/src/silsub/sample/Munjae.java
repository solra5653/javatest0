package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void test1(){
		System.out.println("점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int tot = kor+eng+mat;
		int avg = tot/3;
		
		
		
		if(kor>=40 && eng>= 40 && mat>=40 && avg>=60) {
			System.out.println("국어: " + kor + " 영어:"+eng+" 수학: "+ mat
					+ " 총점: "+tot+ " 평균: " +avg+ " [ 합격 ]" );
			
		}else {
			System.out.println("[ 불합격 ]");
	}
	}
	public void test2(){
		System.out.println("1. 입력 ,2. 수정 ,3. 조회 ,4. 삭제 ,7. 종료");
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하시오. ");
		int a = sc.nextInt();

		if(a == 1) {
			System.out.println("입력메뉴가 선택되었습니다.");	
		}else if(a == 2) {
			System.out.println("수정메뉴가 선택되었습니다.");	
			}else if(a == 3) {
				System.out.println("조회메뉴가 선택되었습니다.");	
				}else if(a == 4) {
					System.out.println( "삭제메뉴가 선택되었습니다.");	
				}else if(a == 7) {
					System.out.println("프로그램이 종료됩니다.");	
				}else {
					System.out.println("번호가 잘못 입력되었습니다.");	
					System.out.println("다시 입력하십시오.");
				}
	}
	public void test3(){
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 0 ) {
			System.out.println("양수다.");	
		}else {
			System.out.println("양수가 아니다.");
		}
}
	public void test4(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.next().charAt(0);
		if( a > 0 ) {
		if ( a%2 ==0) {
			System.out.println("짝수다.");	
		}else {
			System.out.println("홀수다");
		}
		}
	}
	 public void inputTest(){
		 
		 String name;
		 int age;
		 double height;
		 
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			System.out.print("나이를 입력해주세요 : ");
			age = sc.nextInt();
			System.out.print("키를 입력해주세요 : ");
			height = sc.nextDouble();
			//null:비어있다. 주소없다
			//레퍼런수 변수(클래스를 자료형으로 만든 변수)
			//레퍼런스 == null : 참조변수 안이 비어있느냐
			//클래스가 가진 메소드를 실행(호출, call)할 때
			//레퍼런스.메소드()  --> 레퍼런스변수는 객체의 주소를 가짐
			//== 주소.메소드() 과 같음.
			//주소가 없는 null 인 경우는 null.메소드() 호출이 된다는 의미임.
			//주소가 없는 메소드 실행은 에러임 : NullPointerException 발생
			if ((name != null &&  name.length() > 0) && 
					age > 0 && height > 0) {
				
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("키 : " + height);
				System.out.println("확인 : " + name + "의 나이는 " 
				+ age + "세 이고, " + "키는 " 
						+ height + "cm 이다."); 
					
			} else {
				System.out.println("정보를 다시 입력해주세요.");
			}
	 }
	 
	 public void test6(){
		 
		 
		 int first;
		 int second;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		first = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		second = sc.nextInt();
		
		if (first > 0 && second > 0) {
			System.out.println(first + " + " + second + " : " + (first + second));
			System.out.println(first + " - " + second + " : " + (first - second));
			System.out.println(first + " * " + second + " : " + (first * second));
			System.out.println(first + " / " + second + " : " + (first / second));
			System.out.println(first + " % " + second + " : " + (first % second));
		} else {
			System.out.println("숫자를 제대로 입력해주세요.");
		}
	 }
	 
	 public void test7(){
		 
		 int num;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		num = sc.nextInt();
		
		if (num >= 0) {
			 char str = 0;
			if (num >= 90) {
				str = 'A';
			} else if (num >= 80) {
				str = 'B';		
			} else if (num >= 70) {
				str = 'C'; 	
			}  else if (num >= 60) {
				str = 'D'; 
			}  else if (num < 60) {
				str = 'F';
				
			}	else {
			}
			System.out.println("점수 : " + num + "학점 : " + str );
		}
	 }
}

