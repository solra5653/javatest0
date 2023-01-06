package oop.test;

import oop.member.Employee;

public class EmpSubClass extends Employee {
	public void subMethod() {
		//부모의 public, protected 멤버는 후손이 사용 가능함
		//protected 필드는 상속받은 후손 안에서만 사용 가능
		//주소.필드명
		this.phone = "010-1111-2345";  //public
		this.empNo = "920405-2345678"; //protected
		//this.marriage = 'N';   //default(package private)
		//this.empId = "s200";   //private
	}
}
