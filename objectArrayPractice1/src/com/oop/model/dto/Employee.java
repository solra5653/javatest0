package com.oop.model.dto;

public class Employee {
	private int empNo;		//사번
	private String empName;		//이름
	private String dept;		//소속부서
	private String job;			//직급
	private int age;			//나이
	private char gender;		//성별
	private int salary;				//급여
	private double bonusPoint;		//보너스포인트
	private String phone;		//핸드폰
	private String address;		//주소
	
	public Employee() {} //기본 생성자
	
	public Employee(int empNo, String empName, int age, char gender,
							String phone, String address) { //매개변수 생성자
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		}
	
	public Employee(int empNo, String empName, String dept, String job, // 매개변수 생성자 2
					 int age, char gender, int salary, double bonusPoint, String phone, String address) { 
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public void setEmpNo(int empNo) { //setter 시작
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
	} // setter 종료
	
	public int getEmpNo() { // getter 시작
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
	} // getter 종료
	
	public String empinformation() {
		return "사원번호 : " + empNo + ", 이름 : " + empName + ", 소속부서 : " + dept + ", 직급 : "
						+ job + ", 나이 : " + age + ", 성별 : " + gender + ", 급여 : " + salary + ", 보너스포인트 : "
						+ bonusPoint + ", 핸드폰 : " + phone + ", 주소 : " + address + "]";
		
	}
	
}
	
