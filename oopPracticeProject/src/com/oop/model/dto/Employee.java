package com.oop.model.dto;

//Field 작성
	public class Employee{
		private int empNo;					//사번
		private String empName;			//이름		
		private String dept;					//소속부서
		private String  job;					//직급
		private int age;						//나이
		private char gender; 				//성별
		private int salary;					//급여
		private double bonusPoint;		//보너스포인트
		private String  phone;				//핸드폰
		private String  address;			//주소
		
		
//기본생성자 작성
public Employee() {
		
	}

public Employee(int empNo,String empName,
		String dept, String  job, int age, char gender, 
		int salary, double bonusPoint, String  phone, 
		String  address) {
	this.empNo =empNo;
	this.empName =empName;
	this.dept = dept;
	this.job =job;
	this.age =age;
	this.gender = gender;
	this.salary = salary;
	this.bonusPoint = bonusPoint;
	this.phone = phone;
	this.address = address;
}
//+ information() : String 메소드 작성
public String information() {
	return "사원정보 [ 사번 : " + this.empNo  
			+ ", 이름 : " +this.empName
			+", 소속부서 : "+this.dept
			+", 직급 : "+this.job
			+", 나이 : "+this.age
			+", 성별 : "+this.gender
			+", 급여 : "+this.salary
			+", 보너스포인트 : " + this.bonusPoint
			+", 핸드폰 : "+this.phone
			+", 주소 : "+this.address
			+" ]";
}

//setter
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public void setDept(String dept) {
	this.dept = dept;
}
public void setJob(String job) {
	this.job = job;
}
public void setAge(int age) {
	this.age = age;
}
public void setGender(char gender) {
	this.gender = gender;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setBonusPoint(double bonusPoint) {
	this.bonusPoint = bonusPoint;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public void setAddress(String address) {
	this.address = address;
}

//getter
public int getEmpNo() {
	return this.empNo;
}
public String getEmpName() {
	return this.empName;
}
public String getDept() {
	return this.dept;
}
public String getJob() {
	return this.job;
}
public int getAge() {
	return this.age;
}
public char getGender() {
	return this.gender;
}
public int getSalary() {
	return this.salary;
}
public double getBonusPoint() {
	return this.bonusPoint;
}
public String getPhone() {
	return this.phone;
}
public String getAddress() {
	return this.address;
}
}
