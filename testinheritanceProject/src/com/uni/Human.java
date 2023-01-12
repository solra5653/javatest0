package com.uni;

public class Human {
	//Field
	protected String name;//name:String
	protected int age;//age:int,
	protected int height;//height:int
	protected int weight;//weight:int
	
	public Human() {
		super();
	}
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String printInformation() {
		return name 
				+ "\t" + age 
				+ "\t"+ height 
				+ "\t" + weight;
	}
	
	
	
}
