package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in); 
	private MemberManager mManager = new MemberManager(); 


	public MemberMenu() {
	}

	public void mainMenu() {
		do {
			System.out.println("***** 회원 관리 프로그램 *****\n");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				this.searchMenu();
				break;
			case 3:
				this.modifyMenu();
				break;
			case 4:
				this.sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까?(y/n) : ");
				char c = sc.next().toUpperCase().charAt(0);
				if (c == 'y' && c=='Y') {
					return;
				}

				break;
			}

		} while (true);
	}

	public void searchMenu() {
		do {
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			int index = -1;
			switch (num) {
			case 1:
				System.out.print("아이디 입력 : ");
				index = mManager.searchMemberId(sc.next());
				mManager.printMember(index);
				return;
			case 2:
				System.out.print("이름 입력 : ");
				index = mManager.searchMemberName(sc.next());
				mManager.printMember(index);
				return;
			case 3:
				System.out.print("이메일 입력 : ");
				index = mManager.searchMemberEmail(sc.next());
				mManager.printMember(index);
				return;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;

			}

		} while (true);
	}

	public void sortMenu() {
		do {
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				mManager.sortIdAsc();
				break;
			case 2:
				mManager.sortAgeDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;

			}

		} while (true);
	}

	public void modifyMenu() {
		do {
			System.out.println("***** 회원 정보 수정 메뉴 *****");
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			int index = -1;
			switch (num) {
			case 1:
				System.out.print("변경할 회원의 아이디 : ");
				index = mManager.searchMemberId(sc.next());
				if (index != -1) {
					mManager.printMember(index);
					System.out.print("변경할 암호 : ");
					mManager.findMember(index).setPassword(sc.next());
					System.out.println("회원 정보가 변경되었습니다.");
				}
				return;
				
			case 2:
				System.out.print("변경할 회원의 아이디 : ");
				index = mManager.searchMemberId(sc.next());
				if (index != -1) {
					mManager.printMember(index);
					System.out.print("변경할 이메일 : ");
					mManager.findMember(index).setEmail(sc.next());
					System.out.println("회원 정보가 변경되었습니다.");
				}
				return;
			case 3:
				System.out.print("변경할 회원의 아이디 : ");
				index = mManager.searchMemberId(sc.next());
				if (index != -1) {
					mManager.printMember(index);
					System.out.print("변경할 나이 : ");
					mManager.findMember(index).setAge(sc.nextInt());
					System.out.println("회원 정보가 변경되었습니다.");
				}
				return;				
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			}
		} while(true);
	}
}
