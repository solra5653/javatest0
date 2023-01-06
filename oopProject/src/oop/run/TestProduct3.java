package oop.run;

import java.util.Scanner;

import oop.encapsulation.Product;

public class TestProduct3 {

	public static void main(String[] args) {
		// Product 클래스 사용 테스트3
		Product p = null;
		ProductManager pm = new ProductManager();
		// 키보드로 입력된 초기값을 가진 상품 객체를 리턴받음.
//		p = pm.inputProduct();
//		p = new Product("ss100","갤럭시탭", "수원", 1000000, 0.2);
		p = pm.inputProduct2();
		
		// p 가 받은 것은 새 객체의 주소다.
		System.out.println("p : " + p.hashCode());
		// 객체 정보 확인
		pm.printProduct(p);

		// p가 참조하는 객체의 가격 필드값과 부가세율 필드값을
		// 조회해서 실가격을 계산 출력한다면
		// 계산공식 : 단가 + (단가 * 부가세율) => 결과형 int
		int realPrice = (int) (p.getPrice() + (p.getPrice() * p.getTex()));

		System.out.println("부가세율이 적용된 실제 가격 : " + realPrice);
		
		// 가격을 변경한다면
		p.setPrice(1250000);
		//확인
		System.out.println(p.productInfo());

	}// main

} // class closed

// ====================================
//상품 정보 관리용 클래스
class ProductManager {
	// Field
	private Scanner sc = new Scanner(System.in);

	// Constructor
	public ProductManager() {

	}

	// Method (기능)
	// 키보드로 상품 정보 입력받아서 저장된 Product 객체 반환
	public Product inputProduct() {
		System.out.println("등록할 상품 정보를 입력하세요.");
		System.out.print("상품아이디 : ");
		String pid = sc.next();
		System.out.print("상품명 : ");
		String pname = sc.next();
		System.out.print("생산지 : ");
		String parea = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("부가세율 : ");
		double tex = sc.nextDouble();

//			Product product = new Product(pid, pname, parea,
//					price, tex);

//			return product; //주소 리턴임.
		return new Product(pid, pname, parea, price, tex);
	}
	
	public Product inputProduct2() {
		Product p = new Product();
		
		System.out.println("setter 를 이용한 키보드 입력");
		System.out.println("등록할 상품 정보를 입력하세요.");
		
		System.out.print("상품아이디 : ");
		p.setProductID(sc.next());
		
		System.out.print("상품명 : ");
		p.setProductName(sc.next());
		
		System.out.print("생산지 : ");
		p.setProductArea(sc.next());
		
		System.out.print("가격 : ");
		p.setPrice(sc.nextInt());
		
		System.out.print("부가세율 : ");
		p.setTex(sc.nextDouble());
		
		//주소 리턴임
		return p;
	}

	// 전달 받은 Product 객체의 정보를 콘솔에 출력
	public void printProduct(Product p) {
		System.out.println("주소확인 : " + p.hashCode());
		System.out.println(p.productInfo());
	}
}