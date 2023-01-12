package oop.abst;

import java.io.Serializable;

//인터페이스끼리 상속시에도 extends 사용함
//인터페이스 상속에는 다중상속 가능함
public interface ICalc extends IGrade, Serializable{
	//추상(미완성) 메소드만 멤버로 가질 수 있음
	/* public abstract */ int sum(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	int div(int a, int b);
	int mod(int a, int b);
}
