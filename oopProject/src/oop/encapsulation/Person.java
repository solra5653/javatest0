package oop.encapsulation;

//사람들의 정보 저장용
public class Person {
	//Field : 켑슐화 원칙임
	private String personID;	//주민번호
	private String name;		//이름
	private int age;			//나이
	private char gender;		//성별
	private double height;		//키
	private double weight;		//몸무게
	
	//Constructor -----------------------------------
	//기본생성자	
	public Person() {}
	
	//모든 필드값 초기화하는 생성자 
	public Person(String personID, String name, int age, 
			char gender, double height, double weight) {
		this.personID = personID;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	//Method ---------------------------------------------
	//setters	
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getters	
	public String getPersonID() {
		return this.personID;
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
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	//필드값들을 하나의 문자열로 만들어서 리턴
	public String personInfo() {
		return "개인정보[" + this.personID + ", " 
				+ this.name + ", " + this.age + ", "
				+ this.gender + ", " + this.height
				+ ", " + this.weight + "]";
	}	
	
	//Nested : 내부클래스를 말함
	//클래스 안에 작성된 클래스임
	//별도의 목적을 가지고 작성해서 사용하는 클래스임
}






