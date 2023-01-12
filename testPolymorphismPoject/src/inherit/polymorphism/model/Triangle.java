package inherit.polymorphism.model;

public class Triangle  implements IShape {
	
	private double base;//base:double 	//밑변
	private double heiht;//- height:double 	//높이
	public Triangle() {
		super();
	}
	public Triangle(double base, double heiht) {
		super();
		this.base = base;
		this.heiht = heiht;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeiht() {
		return heiht;
	}
	public void setHeiht(double heiht) {
		this.heiht = heiht;
	}

	public String toTriangle() {
		return "Triangle [base=" + base + ", heiht=" + heiht + "]";
	}


	public double area() {
		
		return (base*heiht)*2;
	}
	public double getHypotenuse() {
		return Math.sqrt(base*base+heiht*heiht);
	}
	public double perimeter() {
	
		return base+heiht+getHypotenuse();
	}
	
	

}
