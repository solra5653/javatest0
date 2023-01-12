package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;

public class TestShape  {

	public static void main(String[] args) {
		/*
		 * Shape s;
		 * 
		 * s = new Circle(15.5); System.out.printf("원면적 : %.1f" , s.area());
		 * System.out.println(); System.out.printf("원둘레 : %.1f" , s.perimeter());
		 * System.out.println();
		 * 
		 * s = new Rectangle(34.5, 42.7); System.out.printf("사각형면적 : %.1f" , s.area());
		 * System.out.println(); System.out.printf("사각형둘레 : %.1f", s.perimeter());
		 */
			
			
			IShape ss;

			ss = new Circle(15.5);
			System.out.printf("원면적 : %.1f" , ss.area());
			System.out.println();
			System.out.printf("원둘레 : %.1f" , ss.perimeter());
			System.out.println();
			
			ss = new Rectangle(34.5, 42.7);
			System.out.printf("사각형면적 : %.1f" , ss.area());
			System.out.println();
			System.out.printf("사각형둘레 : %.1f", ss.perimeter());

	}

}
