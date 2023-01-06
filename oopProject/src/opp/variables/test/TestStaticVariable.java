package opp.variables.test;

public class TestStaticVariable {

	public static void main(String[] args) {
		// static 멤버들은 프로그램 실행시
		// 정적(static) 메모리에 자동으로 만들어짐
		// 프로그램이 종료되면 자동으로 삭제됨
		// 즉, 프로그램 구동 동안에는 계속 존재함.
		

	}

} //

//static 테스트용 샘플 클래스
class Car{
	//static field : 클래스변수
	public static int count;
	public static String message = "할부로 구매하였음";
}