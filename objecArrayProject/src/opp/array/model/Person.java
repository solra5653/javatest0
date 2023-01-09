package opp.array.model;

//한사람의 정보 저장용 클래스
public class Person {
	//Field : 인스턴스변수
	private String name;		//이름
	private int age;				//나이
	private char gender;		//성별
	private double point;		//포인트
	
	//Constructor
	//기본생성자
	public Person() {
		
	}
	
	//매개변수 있는 생성자
	public Person(String name, int age,
			char gender, double point) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}
	
	//Method
	//setter & getter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public double getPoint() {
		return this.point;
	}
	
	//인스턴스(객체) 안의 인스턴스변수 값들을 문자열로 합쳐서 리터
	public String personInfo() {
		return "정보 [ name : " + this.name 
				+ ", age : " + this.age
				+ ", gender : " + this.gender
				+ ", point : " + this.point + " ] ";			
	}
}
