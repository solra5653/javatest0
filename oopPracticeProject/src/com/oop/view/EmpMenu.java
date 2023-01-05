package com.oop.view;

import java.util.Scanner;

import com.oop.controller.EmpManager;
import com.oop.model.dto.Employee;

public class EmpMenu {
	
	public static void mainMenu(){
		
		int no;
		EmpMenu emu = new EmpMenu();
		Employee e = new Employee();
		EmpManager em = new EmpManager();
			do{
				System.out.println("******* 사원 정보 관리 프로그램 ************");
				System.out.println("1. 새 사원 정보 입력");
				System.out.println("2. 사원 정보 수정");
				System.out.println("3. 사원 정보 삭제");
				System.out.println("4. 사원정보 출력");
				System.out.println("9. 끝내기");
				
				System.out.print("번호 입력 : ");
				Scanner sc = new Scanner(System.in);
				no = sc.nextInt();
	
				
					switch (no) {
					case 1:
						e =em.empInput();
						break;
					case 2:
						emu.modifyMenu(e);
						break;
					case 3:
						e = null;
						e =  new Employee();
						break;
					case 4:
						em.empOutput(e);
						break;
						case 9:	
							System.exit(0);
						break;
						}
				
			}while(true);
}
public static void modifyMenu(Employee e){
		
		int no;
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("**** 사원 정보 수정 메뉴 *****");
				System.out.println("1. 이름 변경");
				System.out.println("2. 급여 변경");
				System.out.println("3. 부서 변경");
				System.out.println("4. 직급 변경");
				System.out.println("5. 이전 메뉴로 이동");

				
				no = sc.nextInt();
				
					switch (no) {
					case 1:
						System.out.print("수정할 이름을 입력해주세요");
						e.setEmpName(sc.next());
						break;
					case 2:
						System.out.print("수정할 급여을 입력해주세요");
						e.setSalary(sc.nextInt());
						break;
					case 3:
						System.out.print("수정할 부서을 입력해주세요");
						e.setDept(sc.next());
						break;
					case 4:
						System.out.print("수정할 직급을 입력해주세요");
						e.setJob(sc.next());
						break;
					case 5:
						return;
						}
			}while(true);
}
}