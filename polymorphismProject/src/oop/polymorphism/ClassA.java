package oop.polymorphism;

public class ClassA {
	//java.lang.Object 의 후손
	
	public ClassA() {
		super();
	}
	
	public void methodA() {
		System.out.println("ClassA in methodA() run!");
	}

	@Override
	public String toString() {
		return "ClassA []";
	}
	
	
}
