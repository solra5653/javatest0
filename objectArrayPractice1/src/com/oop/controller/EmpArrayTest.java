package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// 3개의 생성자를 이용하여 3개의 객체를 배열로 생성
		Employee[] ear = new Employee[3];
		ear[0] = new Employee();
		ear[1] = new Employee(201503,"박길동",29,'M',"010-1234-5678", "경기도 의정부시");
		ear[2] = new Employee(201004,"김철수", "개발부" , "과장" , 34, 'M', 4500000, 0.15,
				"010-2143-9876", "서울시 노원구 노원동 123");
		
		for(int i=0; i<ear.length; i++) {
			System.out.println("emp["+i+"] : " + ear[i].empinformation());
		}
		
		System.out.println("------------------------------------------------------------------------------");
		
		//3개의 객체 중 값이 없는 필드에 각각 값을 입력
		ear[0].setEmpNo(201305); 
		ear[0].setEmpName("이영희");
		ear[0].setDept("총무부");
		ear[0].setJob("대리");
		ear[0].setAge(28);
		ear[0].setGender('F');
		ear[0].setSalary(3750000);
		ear[0].setBonusPoint(0.1);
		ear[0].setPhone("010-9512-7534");
		ear[0].setAddress("경기도 동두천");
		
		ear[1].setDept("기획부");
		ear[1].setJob("사원");
		ear[1].setSalary(2900000);
		ear[1].setBonusPoint(0.05);
		
		for(int i=0; i<2; i++) {
			System.out.println("ear["+i+"] : " + ear[i].empinformation());
		}
		System.out.println("------------------------------------------------------------------------------");
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산해서 출력
		int payTotal = 0;
		for(int i=0; i< ear.length; i++) {
		int payOfYear = (int)(ear[i].getSalary()+(ear[i].getSalary()*ear[i].getBonusPoint()))*12;
		System.out.println(ear[i].getEmpName()+ "의 연봉 : " + payOfYear);
		payTotal += payOfYear;
		}
		System.out.println("직원들의 연봉의 평균 : " + payTotal/ear.length);
		
//		int em0Salary = (int)(ear[0].getSalary()+(ear[0].getSalary()*ear[0].getBonusPoint()))*12;
//		int em1Salary = (int)(ear[1].getSalary()+(ear[1].getSalary()*ear[1].getBonusPoint()))*12;
//		int em2Salary = (int)(ear[2].getSalary()+(ear[2].getSalary()*ear[2].getBonusPoint()))*12;
		
		
//		System.out.println(ear[0].getEmpName()+ "의 연봉 : " + em0Salary);
//		System.out.println(ear[1].getEmpName()+ "의 연봉 : " + em1Salary);
//		System.out.println(ear[2].getEmpName()+ "의 연봉 : " + em2Salary);
		System.out.println("------------------------------------------------------------------------------");
		
		// 3직원의 1년 연봉의 평균을 구하여 출력함
//		int avgSalary = (em0Salary + em1Salary + em2Salary) / 3 ;
		
//		System.out.println("직원들의 연봉의 평균 : " + avgSalary);
	}
	
	

}
