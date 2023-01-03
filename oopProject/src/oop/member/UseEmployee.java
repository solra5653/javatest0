package oop.member;

public class UseEmployee {
	public void testMethod() {
		//같은 패키지의 클래스이므로 import 없이 사용함
		Employee emp = new Employee();
		
		//할당된 클래스의 객체공간(인스턴스, instance) 안의 필드
		//== 인스턴스 변수
		//레퍼런스(주소)를 이용한 필드 접근 확인
		//필드가 default 상태이면
		//같은 패키지 안의 다른 클래스에서 접근(사용) 가능
		//주소.필드명 사용가능
		//private 필드는 클래스 밖에서 사용 불가능.
		
		emp.empId = "s100";
		emp.empName = "홍길동";
		//protected 필드는 상속이 사용 안 된 경우 default 와 같음
		emp.empNo ="881225-1234567";
		//public 필드는 패키지 안/밖, 클래스 안/밖 모두 접근 가능.
		emp.phone = "010-1234-5678";
		
		
		System.out.println("사번 : " + emp.empId);
		System.out.println("이름 : " + emp.empName);
		}
}
