package oop.etc.test;

public class TestFieldInit {

}
class Card{
	//Field
	//명시적 초기화
	//인스턴스 변수 : 객체 안에 할당될 필드
	//힙 메모리에 객체가 new 될 때 인스턴스변수에 기록됨
	private String cardNo = "000000-000-000001";
	private String customerName = "홍길순";
	private String cardType;
	private int useMoney = 50000;
	//(3). 초기화블럭의 값으로 바뀜
	
	//클래스 변수 : 프로그램 실행될 때 static 메모리에 자동생성됨
	private static int cardCount = 3; //2. 명시된 값으로 초기화됨
	private static double totalPoint;
	//1. 준비된 기본값으로 초기화됨
	
	//초기화 블럭 : 
	//선언된 필드에 초기값 대입처리하는 블럭
	{
		//필드명 = 초기값;
		//초기값 처리를 위한 제어문 사용할 수있음 (for)
		cardType = "BC";
	}
	
	static {
		//static 필드명 = 초기값;
		//초기값 처리를 위한 제어문 사용할 수있음 (for)
		
		//3. 초기화 블럭의 값으로 바뀜
		totalPoint = 15200.5;
		cardCount = 5;
	}
	
	//Constructor
	public Card() {
		super();
	}
	
	public Card(String cardNo, String customerName) {
		super();
		this.cardNo =cardNo;
		this.customerName = customerName;
	}
	
	public Card(Card ref) {
		this.cardNo = ref.cardNo;
		this.customerName =ref.customerName;
		this.cardType = ref.cardType;
	}
	public String cardInfo() {
	return "Card [ " + this.cardNo + ", " 
	+ this.customerName	+ ", " 
	+ this.cardType	+ ", " 
	+ this.useMoney	+ "원 사용, " 
	+ cardCount + ", " + totalPoint
	+ " ]" ;
	}
	public static void main(String[] args) {
		 Card cd = new Card();
		System.out.println(cd.cardInfo());
	}
}
