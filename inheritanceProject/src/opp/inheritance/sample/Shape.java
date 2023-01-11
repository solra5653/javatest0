package opp.inheritance.sample;

import java.util.Objects;

//자바 언어로 만들어지는 모든 클래스들은 자동으로
//java.lang.Object 클래스의 후손(sub class)으로 만들어짐
// 부모 클래스(super class)
public class Shape {
	//Field
	private double area;				//도형의 면적
	private double perimeter;		//도형의 둘레
//	protected double area;				//도형의 면적
//	protected double perimeter;		//도형의 둘레
	
	//초기화 블럭
	{
		area = 10.;
		perimeter = 14.;
	}
	//Constructor
	//반드시 직접 작성함
	public Shape() {
		super();		//첫줄에만 기록해야함
		System.out.println("Shape() 생성자 실행됨");
	}
	public Shape(double area, double perimeter) {
		super();		//첫줄에만 기록해야함
		this.area = area;
		this.perimeter = perimeter;
		System.out.println("매개변수 있는 Shape() 생성자 실행됨");
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		//원래 기능 : this 와 obj가 가진 주소가 같은지?
		//return this == (Shape)obj;
		
		//오버라이딩 하는 이유 : 두 객체의 각 필드값이 같은지?
		Shape other = (Shape)obj;
		if((this.area == other.area) 
				&& (this.perimeter == other.perimeter)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Shape [ area=" + area 
				+ ", perimeter=" + perimeter + " ]";
	}
	public Object clone() {
				//원래 기능의 의미를 바꾸면 안됨
				//this 가 참조하는 객체으 값들을 복사한 새 객체를 반환함
				
				//깊은 복사(deep copy)라고 함 
		return new Shape(this.area, this.perimeter);
	}
	
}
