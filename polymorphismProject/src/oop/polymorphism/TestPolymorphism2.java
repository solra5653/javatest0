package oop.polymorphism;

import java.util.GregorianCalendar;

public class TestPolymorphism2 {
	public static void main(String[] args) {
		//upcasting, downcasting test
		Object[] array = new Object[5];
		//Object 타입의 주소배열 5개를 선언 및 할당(생성)
		
		array[0] = new String("upcasting test");
		//Object 형 레퍼런스 = String 객체의 주소;
		System.out.println(array[0].toString());
		
		array[1] = new ClassA();
		array[2] = new GregorianCalendar(2022,12, 25);
		array[3] = new StringBuilder("부모것만 참조함으로 변경");
		array[4] = new ClassD();
		
		//각 후손이 가진 멤버를 사용 하려면
		//저장된 순서를 모른다면
		//instanceof 연산자 이용함
		//주소 instanceof 클래스타입 => true | false 가 결과값임.
		//주소 위치의 객체(인스턴스)의 클래스 타입이 뭐냐?
		
		for(int i =0; i<array.length; i++) {
			System.out.println(i+ " : " + array[i].toString());
			
			//다운캐스팅시에 확인하고 형변환하도록 함.
			if(array[i] instanceof ClassD) {		//후손을 먼저 작성해야 함
					((ClassD)array[i]).methodD();
			}else if(array[i] instanceof ClassA) { //부모를 나중에 작성해야 함
				((ClassA)array[i]).methodA();
			}else if(array[i] instanceof String) {
				System.out.println("글자 갯수 : "+ 
			((String)array[i]).length());		
			}else if(array[i] instanceof StringBuilder) {
				System.out.println("append : " +
			((StringBuilder)array[i]).append("- 형변환"));
			}else if(array[i] instanceof GregorianCalendar) {
				System.out.println("type : " +
			((GregorianCalendar)array[i]).getCalendarType());
			}
		}
	}
}
