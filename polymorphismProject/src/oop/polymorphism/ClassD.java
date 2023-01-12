package oop.polymorphism;

//자바는 클래스간의 상속시 단일 상속만 허용한다.(부모가 1개)
public class ClassD extends ClassB/* ,ClassC */{

	public ClassD() {
		super();
	}
	public void methodD() {
		System.out.println("ClassD in methodD() run!");
	}
	@Override
	public String toString() {
		return "ClassD []";
	}
	
}
