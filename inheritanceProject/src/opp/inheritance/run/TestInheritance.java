package opp.inheritance.run;

import opp.inheritance.sample.Shape;

public class TestInheritance {

	public static void main(String[] args) {
		// 부모클래스의 상속받은 멤보는 후손이
		// 자신의 것 처럼 사용할 수 있다.
		Shape shape = new Shape();
		
		System.out.println("shape : " + shape.hashCode());
		System.out.println("shape : " + shape.toString());
		
		Shape copy =shape;
		System.out.println("result : " + shape.equals(copy));
		

	}

}
