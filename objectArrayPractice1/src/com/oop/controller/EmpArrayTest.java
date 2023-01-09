package com.oop.controller;

import com.oop.model.dto.Employee;


public class EmpArrayTest {

	public static void EmpArray1() {
		Employee emp1 = new Employee();
		Employee[] emp = new Employee[3];
		double[] year =new double[3];

		emp[0] = new Employee();
		emp[1] = new Employee(201503, "박길동", null, null, 29, 'M', 0, 0.0, "010-1234-5678", "경기도 의정부시");
		emp[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");
		for (int i = 0; i < emp.length; i++) {
			System.out.println("ear["+i + "] : " + emp[i].empInformation());
		}
	}
	public static void EmpArray2() {
		Employee[] emp = new Employee[3];

		emp[0] = new Employee(201305, "이영희", "총무부", "대리", 28, 'F', 3750000, 0.1, "010-9512-7534", "경기도 동두천");
		emp[1] = new Employee(201503, "박길동", "기획부", "사원", 29, 'M', 2900000, 0.05, "010-1234-5678", "경기도 의정부시");
		emp[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");
		for (int i = 0; i < emp.length; i++) {
			System.out.println("ear["+i + "] : " + emp[i].empInformation());
		}
		System.out.println("-------------------------------------------------------");
	
		int payTotal =0;
		for (int i = 0; i < emp.length; i++) {
			int payOfYear =(int)(emp[i].getSalary() + (emp[i].getSalary()* emp[i].getBonusPoint()))*12;
			System.out.println(emp[i].getEmpName()+"의 연봉 : " + payOfYear);
			payTotal += payOfYear;	
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("직원들의 연봉의 평균 : " + (payTotal /emp.length));
	}
	public static void main(String[] args) {
//		EmpArray1();
		System.out.println("-------------------------------------------------------");
		EmpArray2();
		System.out.println("-------------------------------------------------------");
	}
}
