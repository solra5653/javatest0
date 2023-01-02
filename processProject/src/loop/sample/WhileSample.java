package loop.sample;

import java.util.Scanner;

/**
 * while�� �׽�Ʈ�� Ŭ���� �ݺ��� Ƚ���� �������� ���� �ݺ� ����� �ַ� ��� while(�ݺ��� ���� ���ǽ�){ --> ������ ���� ����
 * �ݺ� ����� �ݺ� ���� �� ���뿡 ���� ������; }
 *
 */
public class WhileSample {

	// Ű����� ���� �ϳ��� �Է¹޾�, �� ������ �����ڵ� ���
	// �ݺ� ����
	// �ݺ� ������ '0'�Է� �Ǹ� �����
	public void printUnicod() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�(���� ����:0) : ");
		char ch = sc.next().charAt(0);

		while (ch != '0') {
			System.out.println(ch + " is unicode " + (int) ch);

			System.out.print("���� �Է�(���� ����:0) : ");
			ch = sc.next().charAt(0);
		}

		System.out.println("====== The End ======");

	}

	// �ߺ� ���� ���̱�
	public void printUnicod2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�(���� ����:0) : ");
//			char ch = sc.next().charAt(0);
		char ch;
		while ((ch = sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int) ch);

			System.out.print("���� �Է�(���� ����:0) : ");
//				ch = sc.next().charAt(0);
		}

		System.out.println("====== The End ======");

	}

	// �ߺ� ���� ���̱�2
	public void printUnicod3() {
		Scanner sc = new Scanner(System.in);

		// true�� �ϸ� Ư�� ������ ���� �ʴ� �̻� ���� ������ ����
		while (true) {
			System.out.print("���� �Է�(���� ����:0) : ");
			char ch = sc.next().charAt(0);

			// �� if���� ���°�� ���� ������ ���ư���
			if (ch == '0') {
				// �ݺ��� �����Ŵ
				break;
			}
			System.out.println(ch + " is unicode " + (int) ch);
		}
		System.out.println("====== The End ======");
	}

	// for ���� while ������ �ٲٱ�
	// 1���� 100���� �������� �հ� ���ϱ�
	public void testWhile1() {
		int sum = 0;

//			for(int n = 1; n <101; n++) {
//				sum += n;
//			}

		int n = 1;
		while (n < 101) {
			sum += n++;
//				n++;
		}
		System.out.println("1���� 100���� �������� �հ� : " + sum);
	}

	// while ���� for ������ �ٲٱ�
	public void printUnicod4() {
		Scanner sc = new Scanner(System.in);

//			System.out.print("���� �Է� : ");
//			char ch = sc.next().charAt(0);

//			for( ; ch != '0';) {
//			for( ; true; ) {
		for (;;) { // while(true) �� ����
			System.out.print("���� �Է� : ");
			char ch = sc.next().charAt(0);

			if (ch == '0') {
				break;
			}

			System.out.println(ch + " is unicode " + (int) ch);

		}

		System.out.println("====== The End ======");
	}

	// ���ڿ����� �Է� �޾Ƽ�, ���� ���� ī��Ʈ�ؼ� ����ϰ�
	// ����ҹ��ڴ� �빮�ڷ� �ٲٱ�
	// ���ڿ� �Է� : java
	// ���� ���� : 4
	// �ݺ� ���� : ���� �ϳ��� ����ҹ������� Ȯ���ϰ�
	// �ҹ����̸� �빮�ڷ� �ٲٴ� �ݺ��Ǵ� ����
	public void strLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = sc.next();
		System.out.println("���ڰ��� : " + str.length());
		// ���ڰ����� ���ڿ��� ���ڹ迭�� �ٲ㼭 Ȯ���� ���� ����
		char[] array = str.toCharArray();
		System.out.println("���ڰ��� : " + array.length);

		// ���ڿ� ���� ���ڰ��� ����ҹ������� Ȯ���ϰ�
		// �ҹ����̸� �빮�ڷ� �ٲٱ�

		// String ���� ����ϱ�
		int index = 0;
		while (index < str.length()) {
			char ch = str.charAt(index);

			if (ch >= 'a' && ch <= 'z') {
				// 'a' : 97, 'A' :65 => 97-65 =>32
				// �ҹ��ڴ� -32�� �ϸ� �빮�ڷ� �ٲ�
				// String ���� index ��ġ�� ���ڹٲٱ� ���(�޼ҵ�) ����
				// char[]�� index ��ġ�� ���� ���� ������
				array[index] -= 32;
			}
			index++; // ���� ����ĭ���� �̵�(���� if������ ���Ͽ� ���ϼ� ����)

		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));

		// char[] (���ڹ迭)�� ����ϱ�

	}

	public void strLength2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = sc.next();
		System.out.println("���ڰ��� : " + str.length());
		char[] array = str.toCharArray();
		System.out.println("���ڰ��� : " + array.length);

		for (int index = 0; index < str.length(); index++) {

//				char ch = str.charAt(index);
//				if(ch >= 'a' && ch <= 'z') {
			if (Character.isLowerCase(str.charAt(index))) {
				array[index] -= 32;
			}
		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));
	}

	public void strLength3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = sc.next();
		System.out.println("���ڰ��� : " + str.length());
		char[] array = str.toCharArray();
		System.out.println("���ڰ��� : " + array.length);
		
		//char[] �� ����� ���
		for (int index = 0; index < array.length; index++) {

			if (Character.isLowerCase(array[index])) {
				array[index] -= 32;
			}
		}
		System.out.println("before : " + str);
		System.out.println("after : " + String.valueOf(array));
	}
	
	//���ڿ� �Է� �ް�, ���� �ϳ� �Է� �޾Ƽ�
	//���ڿ� �ȿ� �Է¹��� ���ڰ� � ���ԵǾ� �ִ��� ���� ���
	//���ڿ� �Է� : apple
	//���� �Է� : p
	//"apple �� ���Ե� p�� ������ 2��" ���
	//�ݺ����� : 
	//���ڿ� �ȿ� ���Ե� ���� ī��Ʈ
	public void containChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.next();
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
//		int index = 0, count = 0;
//		while (index <str.length()   ) {
//			
//			index++;
		int count =0;
		for (int index = 0; index <str.length(); index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("["+str + "]�� ���Ե� [" + ch + "]������ ������ [" + count + "]��");
	}
}
