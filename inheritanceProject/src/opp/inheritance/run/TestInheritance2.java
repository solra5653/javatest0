package opp.inheritance.run;

import opp.inheritance.sample.Rectangle;

public class TestInheritance2 {

	public static void main(String[] args) {
		// 상속구조에서 생성자 호출 관계
		// 부모클래스의 필드와 메소드만 상속받게 됨
		// 생성자, 초기화블럭은 상속 안됨
		
		Rectangle rect = new Rectangle();
		//부모생성자 먼저 실행되고 나서, 후손 생성자 작동 확인함
		
		System.out.println(rect.toString());
		
		Rectangle rect2 = new Rectangle(10,10);
		System.out.println(rect2.toString());
		
		Rectangle rect3 = new Rectangle(20,20,400,80);
		System.out.println(rect3.toString());
		
		//메소드 사용 : 본인 것 사용 +  부모의 public 메소드 사용
		//부모의 public 이 아닌 protected나 default, private 은
		//후손 클래스 안에서 사용할 수 있음.
		rect2.calculator();
		System.out.println(rect2.toString());
		
		//부모 메소드 사용
		rect.setWidth(2);
		rect.setHeight(3);
		rect.calculator();
		System.out.println(rect.toString());
		
		//부모 메소드 사용 : 자시의 것처럼 사용하면 됨
		System.out.println("가로 : " + rect.getWidth());
		System.out.println("세로 : " + rect.getHeight());
		System.out.println("면적 : " + rect.getArea());
		System.out.println("둘레 : " + rect.getPerimeter());
	}

}
