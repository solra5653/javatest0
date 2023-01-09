package opp.array.run;

import java.util.Scanner;

import opp.array.model.Person;

public class TestPersonArray2 {

	public static void inputPerson(Person[] arr) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성과 키보드 입력 처리
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Person();
			
			System.out.println(i + "번째 Preson 정보를 입력하세요.");
			System.out.print("이름 : ");
			arr[i].setName(sc.next());
			System.out.print("나이 : ");
			arr[i].setAge(sc.nextInt());
			System.out.print("성별[남/여] : ");
			arr[i].setGender(sc.next().charAt(0));
			System.out.print("포인트 : ");
			arr[i].setPoint(sc.nextDouble());
		}
		return;
	}
	
	public static void main(String[] args) {
		// 객체배열 사용 테스트2
		Person[] par = new Person[3];
		//객체의 주소 저장용 레퍼런스 3개가 배열로 할당됨
		inputPerson(par);		//call by address == call by reference	
		
		//객체 배열 출력 처리 : for 문 사용
		//for each 문 :  객체배열, 컬렉션에만 사용할 수 있음.
		/*for(클래스명 레퍼런스변수 : 객체배열명){
		 * 				레퍼런스변수.메소드(...);
		 *} 
		 */
		for(Person p : par) {
			System.out.println(p.personInfo());
		}
	}

}
