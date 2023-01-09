package opp.array.run;

import opp.array.model.Person;

public class TestPersonArray {

//	public void objectArray() {
	public static void objectArray() {
		// Person 객체가 여러 개 필요한 경우
		Person p1 = new Person("홍길동", 27, '남', 1800.5);
		Person p2 = new Person("김유신", 33, '남', 2350.7);
		Person p3 = new Person("황지니", 25, '여', 4895.3);

		System.out.println(p1.personInfo());
		System.out.println(p2.personInfo());
		System.out.println(p3.personInfo());

		// 객체배열로 바꾼다면
		// 배열 선언과 할당 :
		// 자료형[] 배열명 = new 자료형[갯수];
		Person[] par = new Person[3];
		// Person 객체의 주소를 저장할 레퍼런스변수를 배열로 할당함
		// 객체는 할당되지 않았음. => 주소없음(null)

		for (int i = 0; i < par.length; i++) {
			System.out.println(i + " : " + par[i]);
		}

		// 객체배열에서 객체 생성은 두번째 new 임
		// par[0] = 객체의 주소 <-- new 생성자(초기값, ....);
		par[0] = new Person("홍길동", 27, '남', 1800.5);
		par[1] = new Person("김유신", 33, '남', 2350.7);
		par[2] = new Person("황지니", 25, '여', 4895.3);

		// 객체배열은 주소배열이다. (객체는 배열로 만들 수 없음)
		// 기본 자료형 2차원배열과 같은 할당구조를 가짐.

		for (int i = 0; i < par.length; i++) {
			System.out.println(i + " : " + par[i].personInfo());
		}
	}

	public static void initObjectArray() {
		// 객체배열 초기화 : new 할당시에 객체의 주소를 기록함
		// 기본자료형 1차원배열 초기화
		// 자료형[] 배열명 = {초기값, 초기값, .....};
		// 자료형[] 배열명 = new 자료형[]{초기값, 초기값, .....};
		//객체배열의 초기값은 new 생성자(값, 값, ...) 임.
		
		Person[] par = new Person[]{
				new Person("홍길동", 27, '남', 1800.5),
				new Person("김유신", 33, '남', 2350.7),
				new Person("황지니", 25, '여', 4895.3)
		};
		for (int i = 0; i < par.length; i++) {
			System.out.println(i + " : " + par[i].hashCode());
			System.out.println(i + " : " + par[i].personInfo());
		}
	}

	public static void main(String[] args) {
		// 객체 배열 테스트
		// non-static 일떄
//		TestPersonArray test = new TestPersonArray();
//		test.objectArray();

		// static 일때
		 objectArray();
		initObjectArray();
	}

}
