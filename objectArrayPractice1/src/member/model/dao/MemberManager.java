package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mar = new Member[SIZE];
	Scanner sc = new Scanner(System.in);

	{
		mar[0] = new Member("kyb", "강용범", "wefwwgw", "solra5090@naver.com", 'M', 31);
		mar[1] = new Member("kyt", "강정택", "wegwb", "kang5080@naver.com", 'M', 59);
		mar[2] = new Member("kys", "김용순", "webv", "kim789@gmail.com", 'F', 54);
		mar[3] = new Member("keg", "강은경", "rertt", "kang456@gmail.com", 'F', 27);
		memberCount = 4;
	}
	
	public MemberManager() {
	}
	//위의 3개의 searchMember 관련메소드를 하나로 구현한다면
	public int getMemberCount() {
		return this.memberCount;
	}

	public void memberInput() {
		if (memberCount >= SIZE) {
			System.out.println("회원 수 초과");
		} else {
			mar[memberCount] = new Member();
			System.out.println((memberCount + 1) + "번째 회원의 정보 입력");
			System.out.print(" 아이디 : ");
			mar[memberCount].setId(sc.next());
			System.out.print(" 이름 : ");
			mar[memberCount].setName(sc.next());
			System.out.print(" 비밀번호 : ");
			mar[memberCount].setPassword(sc.next());
			System.out.print("이메일 : ");
			mar[memberCount].setEmail(sc.next());
			System.out.print("성별(M/F) : ");
			mar[memberCount].setGender(sc.next().toUpperCase().charAt(0));
			System.out.print("나이 : ");
			mar[memberCount].setAge(sc.nextInt());
			memberCount++;
		}
		return;

	}
	public void deleteMember() {
		System.out.print("삭제할 회원 아이디 입력 : ");
		String dID = sc.next();
		for (int i = 0; i < memberCount; i++) {
			if (dID.equals(mar[i].getId())) {
				System.out.print("정말로 삭제하시겠습니까?(y/n)");
				char answer = sc.next().toUpperCase().charAt(0);
				if (answer == 'Y') {
					mar[i] = null;
					if (i != memberCount) {
						for (int j = i + 1; j < memberCount; j++) {
							mar[i] = mar[j];
						}
					}
				}
			}
		}
		memberCount--;
	}

	public void printAllMember() {
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar[i].memberinfo());
		}
	}

	public int searchMemberId(String id) {
		int index = -1;
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(mar[i].getId())) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int searchMemberName(String name) {
		int index = -1;
		for (int i = 0; i < memberCount; i++) {
			if (name.equals(mar[i].getName())) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int searchMemberEmail(String email) {
		int index = -1;
		for (int i = 0; i < memberCount; i++) {
			if (email == mar[i].getEmail()) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void printMember(int index) {
		System.out.println(index + "번째 멤버의 정보 : " + mar[index].memberinfo());
	}

	public void swap(int i, int j) {
		Member tmp = mar[i];
		mar[i] = mar[j];
		mar[j] = tmp;

	}

	public void sortIdAsc() {
		Member[] mar2 = new Member[memberCount];
		mar2 = mar;
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (mar2[i].getId().toUpperCase().compareTo(mar2[j].getId().toUpperCase()) > 0) {
					swap(i, j);
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar2[i].memberinfo());
		}
	}

	public void sortIDDes() {
		Member[] mar2 = new Member[memberCount];
		mar2 = mar;
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (mar[i].getId().toUpperCase().compareTo(mar[j].getId().toUpperCase()) < 0) {
					swap(i, j);
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar2[i].memberinfo());
		}
	}

	public void sortAgeAsc() {
		Member[] mar2 = new Member[memberCount];
		mar2 = mar;
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (mar[i].getAge() > mar[j].getAge()) {
					swap(i, j);
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar2[i].memberinfo());

		}
	}

	public void sortAgeDes() {
		Member[] mar2 = new Member[memberCount];
		mar2 = mar;
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (mar[i].getAge() < mar[j].getAge()) {
					swap(i, j);
				}
			}

		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar2[i].memberinfo());
		}

	}

	public void sortGenderDes() {
		Member[] mar2 = new Member[memberCount];
		mar2 = mar;
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (mar[i].getGender() < mar[j].getGender()) {
					swap(i, j);
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar2[i].memberinfo());
		}
	}

	public Member findMember(int index) {
		return mar[index];
	}
}
