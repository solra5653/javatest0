package opp.run;

import java.util.Scanner;

import oop.encapsulation.Student;

public class TestStudent2 {
	public static void main(String[] args) {
		//생성자 사용 테스트
		//클래스 사용 : 
		//클래스명 레퍼런스변수 = new 생성자();
		
		//Student 가 3개의 생성자 제공함
		//new 로 생성되는 객체의 인스턴스 변수 초기화 방법이 3가지
		//1. 기본생성자
		Student s1 = new Student();
		//2. 매개변수 4개 있는 생성자
		Student s2 = new Student(201307, "홍길동", 20,'남');
		//3. 모든 필드값 초기화 생성자
		Student s3 = new Student(993312, "강용범", "정보통신"
				, 4.3, 'A', 31, '남');
		
		//각 레퍼런스(주소)가 참조하는 객체가 가진 값 확인
		//확인용 메소드 사용
		//1. 출력용
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		//2. 문자열 리턴용
		System.out.println(s1.information());
		System.out.println(s2.information());
		System.out.println(s3.information());
		
		//s1이 참조하는 객체의 필드값들 변경한다면
		//setter 들을 사용하면 됨
		//레퍼런서.set필드명(바꿀값);
		s1.setNO(981210);
		s1.setName("황지니");
		s1.setMajor("무용학과");
		s1.setScore(4.5);
		s1.setGrade('A');
		s1.setAge(22);
		s1.setGender('여');
		
		System.out.println(s1.information());
		
		//키보드 입력을 통한 필드값 변경시에도
		//setter 이용할 수 있음
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 : ");
//		String major = sc.next();
//		s2.setMajor(major);
		s2.setMajor(sc.next());
		System.out.print("학점 : ");
		s2.setScore(sc.nextDouble());
		System.out.print("등급 : ");
		s2.setGrade(sc.next().charAt(0));
		
		System.out.println(s2.information());
	}
}