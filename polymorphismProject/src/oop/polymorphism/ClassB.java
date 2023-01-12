package oop.polymorphism;

public class ClassB extends ClassA {
	
	public ClassB() {
		super();
	}
	
	public void methodB() {
		System.out.println("ClassB in methodB() run!");
	}

	@Override
	public String toString() {
		return "ClassB []";
	}
	
}
