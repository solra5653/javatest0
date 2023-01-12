package oop.polymorphism;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		// 다형성(Polymorphism) 
		//	: 여러 종류의 클래스들을 한가지 클래스로 다루는 기술
		// 단, 상속 관계에 있는 클래스일 때만 적용 됨
		
		//부모타입의 레퍼런스에 여러 타입의 후손객체의 주소를
		//대입함.
		Object obj; //최상위 부모클래스임.
		
		obj = new String("다형성 테스트"); //ok
		//같은 종류끼리만 대입 할 수 있다.
		//다형성이 적용되서 에러 안 남
		//내부적으로 규칙은 지켜지고 있음 : obj = (Object)String
		//String 형 주소 => Object 형 주소로 자동형변환 되었음
		//UpCasting : 후손타입이 부모타입으로 바뀜 (자동)
		
		// => 후손 객체 안의 부모멤버만 사용할 수 있다는 뜻임.
		//즉, Object 레퍼런스는 Object 것만 사용 할 수 있다는 뜻임.
		//즉, obj 로 String 멤버는 사용 할 수 없다.
		
		System.out.println("부모것 사용 : " + obj.toString());
		System.out.println("후손것 사용 : "+((String)obj).charAt(0));
		//DownCasting : 부모타입을 후손타입으로 바꿈(명시)
		
		obj = new java.util.Date();
		System.out.println("Object : "+ obj.toString());
		//print 시에 레퍼런스만 사용하면, 컴파일시에 자동으로
		// jvm 에 의해 레퍼런스.toString() 으로 추가되면서 실행됨.
		System.out.println("Date : 현재까지의 밀리세컨드는 "
				+((java.util.Date)obj).getTime());
		
		obj = new StringBuilder("polymorphism test");
		System.out.println("Object : " + obj);
		System.out.println("StringBuilder in append() : " 
		+ ((StringBuilder)obj).append(12345));
		
		obj = new ClassA(); //upcasting
		System.out.println(obj); //dynamic binding
		((ClassA)obj).methodA(); //downcasting
		//toString() 은 Object 클래스의 멤버이므로
		//obj 를 통해서 사용할 수 있다.
		//정적 바인딩(고정 연결) :  컴파일시 실소유자 클래스의
		//									메소드와 연결하면 컴파일됨
		
		//실제 구동은 obj 레퍼런스에 저장된 후손객체 클래스가
		//오버라이딩 작성한 toString() 이 실행된고 있음.
		//동적 바인딩(실행시 연결) :  실행시 레퍼런스가 참조하는 
		//		객체가 후손이고 오버라이딩한 부모메소드가 있으면
		//		후손의 오버라이딩 메소드를 연결을 바꿈.
		
		obj= new ClassB();
		System.out.println(obj);
		((ClassB)obj).methodB();
		
		ClassA ref; //상속관계에 있는 후손객체들의 주소를 받을 수 있음.
		ref = new ClassB();
		ref = new ClassC();
		ref = new ClassD();
		
		ClassB bref; //다형성 : 부모, 자식관계에만 사용함.
		bref = new ClassB();
		bref = new ClassD();
//		bref = new ClassC(); //형제지간은 다형성 사용 못함 //error
		
	}
}
