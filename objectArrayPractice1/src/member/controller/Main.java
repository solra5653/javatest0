package member.controller;

import member.view.MemberMenu;

public class Main {

	public static void main(String[] args) {
		// 메뉴 start
		new MemberMenu().mainMenu();

		System.out.println("회원관리 프로그램을 종료합니다.");
	}
}
