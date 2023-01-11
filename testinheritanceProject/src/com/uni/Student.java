package com.uni;

public class Student extends Human {
	private String number;
	private String major;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int height,
			int weight, String number, String major) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.number = number;
		this.major = major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public String printInformation(){
		return super.printInformation()+ "\t "+ this.number + this.major;
		
	}
	
	
}
