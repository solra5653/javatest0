package oop.polymorphism;

public class ClassC extends ClassA{
	
	public ClassC(){
		super();
	}
	public void method() {
		System.out.println("ClassC in methodC() run!");
	}
	@Override
	public String toString() {
		return "ClassC []";
	}
	
}
