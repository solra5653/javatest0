package first.run;

public class TestMain2 {
	//멤버변수 작성 : 
	//private 자료형 변수명;
	//private 자료형 변수명 = 값;
	//private 나 public 멤버만 사용함
	
	//main 메소드(method : 멤버함수) : 해당 클래스에 소속된 멤버는 아님
	//start up 스위치의 역할을 하는 특수메소드임
	public static void main(String[] args) {
		System.out.println("실행 확인용 문구임.");
		//변수(Variable) : 값 저장용 공간(방)
		//메소드 블럭(영역) 안에서 만든 변수 : 지역변수 라고 함
		//지역변수(Local Variable)
		//작성 : 자료형 변수명; 또는 자료형 변수명 = 값;
		String name = "이순신";
		System.out.println("이름 : " + name);
	}

}
