package test.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		System.out.println("과목 점수를 입력하시오.");
		Scanner sam1 = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sam1.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sam1.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sam1.nextInt();

		int tot = (kor + eng + mat);
		double avg = tot / 3.0;

		String result = (kor >= 40 && eng >= 40&& mat>=40 && avg >=60)?
				"합격" : "불합격";
		
		System.out.println(kor + "점, " +eng+ "점, "+mat+ "점, "
									+ tot + "점, " +avg+ "점, "+ result);
		
//		if문 사용시
//		if (kor >= 40 && eng >= 40&& mat>=40 && avg >=60) {	
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//	}

	}
//문제 2
	public void sample2() {
		
		System.out.println("학생 정보 입력하세요.");
		Scanner sam2 = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String a = sam2.nextLine();
		System.out.print("학년 : ");
		int b = sam2.nextInt();
		System.out.print("반 : ");
		int c = sam2.nextInt();
		System.out.print("번호 : ");
		int d = sam2.nextInt();
		System.out.print("성별(M:남학생/F:여학생) : ");
		char e = sam2.next().toUpperCase().charAt(0);
		System.out.print("성적(소수점 두번째자리까지) : ");
		double f = sam2.nextDouble();
		
		System.out.println(" 이름 " + a +"/"+b+"학년 " +c+"반 "+ d +"번 "+ 
		((e=='M')? "남학생" : "여학생")+f + " 점이다");
		//
		System.out.printf("%s은 %d학년 %d반 %d번 %s 성적이 %.2f이다", 
				a,b,c,d,((e=='M')? "남학생" : "여학생"),f);
	}
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println((num>0)? "양수": "양수가 아님");
		
	
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String a = ((num%2==0)? "짝수": "홀수");
		System.out.println(a);
		
	
	}
	public void sample5() {
		System.out.println("과목 점수를 입력하시오.");
		Scanner sam1 = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sam1.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sam1.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sam1.nextInt();

		int tot = (kor + eng + mat);
		double avg = tot / 3.0;
		
		System.out.println("국어 : "+kor + "점, 영어 : " +eng+ 
									"점, 수학 : "+mat+ "점, 총점 : "
									+ tot + "점, 평균 : " +avg+ "점");
		
		System.out.println("학점 등급");

//		char a = (avg >=90)? 'A'
//					: ((avg < 90 && avg >=80)? 'B' 
//					: ((avg < 80 && avg >=70)? 'C'
//					: ((avg < 70 && avg >=60)? 'D'
//					: 'F')));
		
		//이상의 반대는 미만임
		//즉, 90이상의 반대는 90미만임
		char a = (avg >=90)? 'A'
				: ((avg >=80)? 'B' 
				: ((avg >=70)? 'C'
				: ((avg >=60)? 'D' : 'F')));
		
		System.out.println("최종학점은 " + a+ "등급 학점 입니다.");
	
	}

}


