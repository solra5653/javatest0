package com.oop.controller;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpManager {
	private Scanner sc = new Scanner(System.in);

	public EmpManager() {

	}

	//키보드입력용 메소드
	public Employee empInput() {
		Employee e = new Employee();

	
		System.out.println("등록할 사원정보를 입력하세요.");

		System.out.print("사번 : ");
		e.setEmpNo(sc.nextInt());

		System.out.print("이름 : ");
		e.setEmpName(sc.next());

		System.out.print("소속부서 : ");
		e.setDept(sc.next());

		System.out.print("직급 : ");
		e.setJob(sc.next());
		
		System.out.print("나이 : ");
		e.setAge(sc.nextInt());
		
		System.out.print("성별 : ");
		e.setGender(sc.next().charAt(0));

		System.out.print("급여 : ");
		e.setSalary(sc.nextInt());
		
		System.out.print("보너스포인트 : ");
		e.setBonusPoint(sc.nextDouble());
		
		System.out.print("핸드폰 : ");
		e.setPhone(sc.next());
		
		System.out.print("주소 : ");
		e.setAddress(sc.next());
		
		return e;
	}
	//출력용 메소드
	public void empOutput(Employee e) {
		System.out.println(e.information());
	}
}
