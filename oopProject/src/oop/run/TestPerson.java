package oop.run;

import oop.encapsulation.Person;

public class TestPerson {

	public static void main(String[] args) {
		// Person 클래스 사용 테스트
		
		//매개변수 있는 생성자로 객체 3개 생성함
		Person p1 = new Person("941125-1234567", 
				"홍길동", 29, '남', 178.5, 75.5);
		Person p2 = new Person("950915-2323456", 
				"황지니", 28, '여', 165.8, 55.3);
		Person p3 = new Person("940105-1212356", 
				"이순신", 29, '남', 189.5, 88.9);
		
		//객체 정보 출력 확인
		System.out.println(p1.personInfo());
		System.out.println(p2.personInfo());
		System.out.println(p3.personInfo());
		
		//나이의 평균 출력
		int avgAge = (p1.getAge() + p2.getAge() 
						+ p3.getAge()) / 3;
		
		//키의 평균 출력
		double avgHeight = (p1.getHeight() + p2.getHeight()
						+ p3.getHeight()) / 3.;
		
		//몸무게의 평균 출력
		double avgWeight = (p1.getWeight() + p2.getWeight()
						+ p3.getWeight()) / 3.;
		
		System.out.println("평균 나이 : " + avgAge);
		//소숫점 아래 둘째자리까지 출력
		System.out.println("평균 키 : " + 
					(int)(avgHeight * 100) / 100.0);
		System.out.println("평균 몸무게 : " + 
					(int)(avgWeight * 100) / 100.0);

		//소숫점 아래 둘째자리까지 출력
		System.out.printf("평균 키 : %.2f \n", avgHeight);
		System.out.printf("평균 몸무게 : %.2f \n", avgWeight);
	}

}




