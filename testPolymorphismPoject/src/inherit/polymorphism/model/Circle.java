package inherit.polymorphism.model;

public class Circle implements IShape /* extends Shape */{
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toCircle() {
		return "Circle [ 반지름 =" + radius +"]";
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public double perimeter() {
		return (2*radius*Math.PI);
	}
	
	
	

}
