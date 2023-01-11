package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mar = new Member[SIZE];
	Scanner sc = new Scanner(System.in);

	{
		mar[0] = new Member("kyb", "�����", "wefwwgw", "solra5090@naver.com", 'M', 31);
		mar[1] = new Member("kyt", "������", "wegwb", "kang5080@naver.com", 'M', 59);
		mar[2] = new Member("kys", "����", "webv", "kim789@gmail.com", 'F', 54);
		mar[3] = new Member("keg", "������", "rertt", "kang456@gmail.com", 'F', 27);
		memberCount = 4;
	}
	
	public MemberManager() {
	}
	//���� 3���� searchMember ���ø޼ҵ带 �ϳ��� �����Ѵٸ�
	public int getMemberCount() {
		return this.memberCount;
	}

	public void memberInput() {
		if (memberCount >= SIZE) {
			System.out.println("ȸ�� �� �ʰ�");
		} else {
			mar[memberCount] = new Member();
			System.out.println((memberCount + 1) + "��° ȸ���� ���� �Է�");
			System.out.print(" ���̵� : ");
			mar[memberCount].setId(sc.next());
			System.out.print(" �̸� : ");
			mar[memberCount].setName(sc.next());
			System.out.print(" ��й�ȣ : ");
			mar[memberCount].setPassword(sc.next());
			System.out.print("�̸��� : ");
			mar[memberCount].setEmail(sc.next());
			System.out.print("����(M/F) : ");
			mar[memberCount].setGender(sc.next().toUpperCase().charAt(0));
			System.out.print("���� : ");
			mar[memberCount].setAge(sc.nextInt());
			memberCount++;
		}
		return;

	}
	public void deleteMember() {
		System.out.print("������ ȸ�� ���̵� �Է� : ");
		String dID = sc.next();
		for (int i = 0; i < memberCount; i++) {
			if (dID.equals(mar[i].getId())) {
				System.out.print("������ �����Ͻðڽ��ϱ�?(y/n)");
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
		System.out.println(index + "��° ����� ���� : " + mar[index].memberinfo());
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
