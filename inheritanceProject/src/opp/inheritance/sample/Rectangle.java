package opp.inheritance.sample;

import java.util.Objects;

public class Rectangle extends Shape {
	// Field : 상속받은 부모 필드 2개 + 자기것 2개 => 4개 할당됨
	private double width; // 가로너비
	private double height; // 세로너비

	// 기본생성자
	public Rectangle() {
		super(); // 부모의 기본생성자 호출함
		// 부모의 기본생성자 없으면 후손클래스가 에러 발생함
		System.out.println("Rectangle() 생성자 호출됨");

	}

	// 매개변수 있는 생성자
	public Rectangle(double width, double height) {
		super(); // 부모(Shape)의 기본생성자 호출함
		this.width = width;
		this.height = height;
		System.out.println("Rectangle 매개변수 2개 있는 생성자 작동됨");
	}

	public Rectangle(double width, double height, double area, double perimeter) {
		super(area, perimeter);
		this.width = width;
		this.height = height;
		System.out.println("Rectangle 매개변수 4개 있는 생성자 작동됨");
	}

	// setter && getter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 일반 메소드
	// 가로, 세로 값을 계산해서 면적과 둘레값을 기록하는 메소드
	public void calculator() {
		// this.area = this.width * this.height;
		// this.perimeter = (this.width + this.height) * 2;

		// 상속받은 부모필드가 private(캡슐화를 지키려고) 이므로
		this.setArea(this.width * this.height);
		this.setPerimeter((this.width + this.height) * 2);

	}

	@Override
	public String toString() {
//		return "Rectangle [getArea()=" + getArea() 
//		+ ", getPerimeter()=" + getPerimeter() + "]";
		return "Rectangle [ width=" + this.width 
				+ ", height= " + this.height 
				+ ", area=" + this.getArea()
				+ ", perimeter=" + this.getPerimeter() 
				+ "]";
	}
	//오버라이딩(overriding) : 
	//후손 클래스 안에 부모 메소드를 다시 작성(implementing) 하는것
	//원칙 : 부모 메소드의 시그니처 똑깥이 그대로 작성해야함
	//			메소드 안의 내용만 수정함
	//단, 접근제한자로 수정 가능 : 부모의 것보다 넓은 것으로
	//예외 처리 : 갯수를 줄일 수 있음.
	//오버라이딩된 메소드 위에는 어노테이션(annotation)을 표시함
	//annotation : compiler 용 comment 임
	@Override
	public Object clone() 
//			throws CloneNotSupportedException {
	{
		//원래 기능의 의미를 바꾸면 안됨
		//this 가 참조하는 객체으 값들을 복사한 새 객체를 반환함
		
		//깊은 복사(deep copy)라고 함 
		return new Rectangle(this.width, this.height
				, this.getArea(), this.getPerimeter());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(height, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
//		if(obj != null && 
//				obj.getClass().getName().equals("Rectangle")) {
		if(obj != null && 
				obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			
			if(super.equals(obj)&&
					(this.width == other.width)&&
					(this.height == other.height)) {
				result = true;
			}
		}
//		else {
//			result = false;
//		}
		return result;
	}

}
