package logic.run;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// java.lang.Math 가 제공하는 random() 메소드 사용 테스트
		// static 메소드는 무조건 클래스명.메소드() 로 사용함
		double value = Math.random();
		System.out.println("발생값 : " + value);
		//0.0 <= value 1.0
		//1~100사이의 임의 난수로 활용한다면
		//(int)(Math.random() * 원하는 끝값) + 시작값
		int num =  (int)(value*100)+1;
		System.out.println("num : " + num);
		
		//51~ 100사이의 정수로 발생을 원다면
		//(int)(Math.random() * (끝값-시작값+1))+시작값
		int num2 =  (int)(value*(100-51+1))+51;
		System.out.println("num2 : " + num2);
		
		//java,util.Random 클래스를 이용해도 됨
		Random random = new Random();
		
		//각 자료형별로 랜덤값 발생(리턴) 메소드를 제공함
		System.out.println("정수 확인 : "+random.nextInt());
		System.out.println("실수 확인 : "+random.nextDouble());
		
		//51~100정수
		int num3 = random.nextInt(50)+51;
		System.out.println("51~100정수 확인(num3) : "+num3);
		
		//1~ 100사이의 정수 발생
		int num4 = random.nextInt(100)+1;
		System.out.println("1~100정수 확인(num4) : "+num4);
	}

}
