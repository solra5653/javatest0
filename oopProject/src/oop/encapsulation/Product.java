package oop.encapsulation;

//상품 정보 저장용 클래스
public class Product {
	//Field
	private String productID;			//상품아이디
	private String productName;//상품명
	private String productArea;//생산지
	private int price;//단가
	private double tex;//부가세비율
	
	//Constructor
	//기본생성자 : 매개변수 없는 생성자
	public Product() {
		
	}
	
	//매개변수 있는 생성자
	//모든 필드값 전달받아 초기화 처리
	public Product(String productID,String productName,
			String productArea, int prive, double tex) {
		this.productID =productID;
		this.productName =productName;
		this.productArea = productArea;
		this.price =prive;
		this.tex =tex;
	}
	
	//Method
	//접근제한자 [예약어] 반환값자료형 메소드명([자료형 변수]){소스작성}
	//access modifier : private, [default], public, protected
	//keyword : static, final, static final, abstract, synchronized
	//return; => void, return 값; => 값의 자료형
	
	//객체 안의 필드에 길록된 값들을 전체 확인하는 메소드
	public String productInfo() {
		return "상품정보 [ productID : " + this.productID  
				+ ", productName : " +this.productName
				+", productArea : "+this.productArea
				+", prive : "+this.price
				+", tex : "+this.tex
				+" ]";
	}
	
	//필드값 변경하는 메소드 : setter
	//필드 각각에 대해  setter 만듦
	//public void set필드명(자료형 매개변수){ this.필드 = 매개변수; }
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTex(double tex) {
		this.tex = tex;
	}
	
	//필드값 조회용 메소드 : getter
	//필드 각각에 대해 getter 만듦
	//public 필드자료형 get필드명(){ return this.필드명; }
	public String getProductID() {
		return this.productID;
	}
	public String getProductName() {
		return this.productName;
	}
	public String getProductArea() {
		return this.productArea;
	}
	public int getPrice() {
		return this.price;
	}
	public double getTex() {
		return this.tex;
	}
}
