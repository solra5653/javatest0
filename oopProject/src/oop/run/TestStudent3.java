package oop.run;

import oop.encapsulation.Student;

public class TestStudent3 {

	public static void main(String[] args) {
		// getters test
		
		//모든 필드값 초기화하는 생성자 사용
		//학생 3명에 대한 객체 생성
		Student s1 = new Student(991201, "김철수", "체육학과",
				3.8, 'B', 22, '남');
		Student s2 = new Student(201712, "이영희", "미술학과",
				4.3, 'A', 20, '여');
		Student s3 = new Student(983325, "강감찬", "정보학과",
				4.5, 'A', 23, '남');
		
		//출력 확인
		System.out.println(s1.information());
		System.out.println(s2.information());
		System.out.println(s3.information());

		//3명의 학생들의 학점의 평균 조회 출력
		double avgScore = (s1.getScore() + s2.getScore()
							+ s3.getScore()) / 3.;
		
		//나이의 평균 계산 출력
		int avgAge = (s1.getAge() + s2.getAge() 
							+ s3.getAge()) / 3;
		
		System.out.println("학생들의 점수 평균 : " + avgScore);
		System.out.println("학생들의 나이 평균 : " + avgAge);
	}

}
