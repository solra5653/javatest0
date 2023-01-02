package first.test;
//자바 doument 문서 만들기용 주석 사용
/**
 * 자바로 클래스 소스 파일 작성 방법 연습용 클래스이다.
 * 패키지 선언과 클래스 작성 클래스 안의 멤버 작성을 연습하였다.
 *
 */
public class Welcome{
	/**
	 * 환영 문구 저장용 멤버변수이다.
	 */

	private String message;
	/**
	 * 기본 생성자이다.
	 */
	
	
	public Welcome(){}

	/**
	 * message 필드값 출력용메소드이다.
	 */
	public void printMessage(){
		System.out.println(message);
			}
	/**
	 * 
	 * @param msg
	 * 새로운 메세지를 전달받아서 message 필드의 값을 변경하는
	 * 메소드이다.
	 */
	public void setMessage(String msg) {
		message = msg;
	}
}