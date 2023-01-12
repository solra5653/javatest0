package oop.abst;

import java.io.Serializable;

//인터페이스와 클래스 같이 상속받을 수 있음
//인터페이스는 다중 상속 가능함
public class Score extends SuperSample
			implements IGrade, ICalc, Serializable {

	@Override
	public int sum(int a, int b) {
		return Math.abs(a+b);
	}

	@Override
	public int sub(int a, int b) {
		return Math.abs(a-b); //결과값 반드시 양수로 리턴
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		if(b==0)
			return 0;
		return a/b;
	}

	@Override
	public int mod(int a, int b) {
		if(b==0)
			return 0;
		return a%b;
	}

	@Override
	public char getGrade(int score) {
		char grade;
		
		switch(score /10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		
		return grade;
	}

}
