package inherit.polymorphism.model;

public class Rectangle implements IShape /*extends Shape*/{
	private double width;
	private double heigth;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public String toRectangle() {
		return "Rectangle [ 가로 = " + width 
				+ ", 세로 = " + heigth + " ]";
	}
	@Override
	public double area() {
		return width*heigth;
	}
	@Override
	public double perimeter() {
		 return (width + heigth)*2;
	}
	
	
	
	

}
