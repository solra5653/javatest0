package operator.sample;

import java.util.Scanner;

public class OperatorSample2 {
	// �����ڴ� 1 ~ 15��� ���е�.
	// ������ �ֿ켱, ����, ����, ����, ����, ���������ڷ� �з���.
	// ���׿����ڰ� ����ȭ�� ����Ʈ, ��, �������ڷ� ����.

	// ��������� : +, -, *, /(��), %(������, mod)
	// 3���� : *, /, %
	// 4���� : +, -
	public void testOperator1() {
		int num = 120;
		int div = 7;

		System.out.println("��� 1 : " + (num + 2 * div));
		System.out.println("��� 2 : " + ((num + 2) * div));
		System.out.println("120/7 �� : " + (num / div));
		System.out.println("120/7 ������ : " + (num % div));

	}

	public void testDimension() {
		float pi = (float) Math.PI;

		System.out.println("pi : " + pi);

		// �Ҽ����Ʒ� ��°�ڸ������� ���� : 10�� 3���� == 1000
		float result = (int) (pi * 1000) / 1000f;
		System.out.println("result : " + result);

		// �Ҽ����Ʒ� ��°�ڸ������� ���� : 10�� 2���� == 100
		result = (int) (pi * 100) / 100f;
		System.out.println("result : " + result);

		// java.lang.Math �� �����ϴ� round() �޼ҵ� ���
		// �Ҽ��� �Ʒ� ù°�ڸ� ���� 5�̻��̸� �ڵ� �ݿø��ϸ鼭
		// ������ �����ϴ� �޼ҵ�

		System.out.println("pi : " + (Math.round(pi * 1000) / 1000f));
	}

	// �������Կ����� : �����ʿ��� �������� ����
	// ���� = ��; �Ǵ� ���� = ����;
	// ���� = ���۷���.�޼ҵ�(); --> ���ϰ� �ִ� �޼ҵ常 ��밡��
	// �޼ҵ尡 �����ϴ� ���� ������ ������

	public void testSubst() {
		int x = 12, y, z;
		z = y = x; // y = x; -> z = y;

		int sum = x + y + z;

		System.out.println(x + " + " + y + " + " + z + "= " + sum);
	}

	// ���մ��Կ�����(14����) : �ٸ� �����ڿ� ���Կ����ڸ� ��ģ��
	// ��� ����, ����Ʈ����, ��Ʈ������
	// = �� �����ʿ� ��ġ�� : ������ =
	// ������Կ����� : +=, -+, *=, /+, %=
	// ����Ʈ���Կ����� : <<=, >>=, >>>=
	// ��Ʈ�����Կ����� : &=, ^=, |=
	// �޸� ������ ���� �����ϴ� ����� : ó�� �ӵ��� ����(����)
	public void testComlexSubst() {
		int num = 10;
		System.out.println("num : " + num); // 10

		// 1���� : ++
		num++;
		System.out.println("num : " + num); // 11

		// 3���� : += 3
		num += 3; // num = num+3;
		System.out.println("num : " + num); // 14

		// 1���� : --
		num--;
		System.out.println("num : " + num); // 13

		// 2���� : -= 2
		num -= 2; // num = num-2;
		System.out.println("num : " + num); // 11

		// 4������ : *= 4
		num *= 4; // num = num*4;
		System.out.println("num : " + num); // 44

		// 4�谨�� : /= 4
		num /= 4; // num = num/4;
		System.out.println("num : " + num); // 11
		}
	//�� ������ �׽�Ʈ
	//�� ���� ������̸� ���ؼ� true | false �� ����� ����
	//6���� : > (ũ��, �ʰ�), < (������, �̸�)
	//			>= (ũ�ų� ������,�̻�), <=(�۰ų� ������,����)
	//7���� : ==(������), !=(���� �ʴ���)
	//�ڹٴ� �̸��� �ѱ� ��� ������ : unicode ���ڼ� ���
	public void �񱳿������׽�Ʈ() {
		int first, second;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� : ");
		first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		second = sc.nextInt();
		
		//%d = 10�� ����
		System.out.printf("%d�� %d���� ũ��? %b \n",
									first, second, (first > second));
		System.out.printf("%d�� %d���� ������? %b \n",
				first, second, (first < second));
		System.out.printf("%d�� %d���� ũ�ų� ������? %b \n",
				first, second, (first >= second));
		System.out.printf("%d�� %d���� �۰ų� ������? %b \n",
				first, second, (first <= second));
		System.out.printf("%d�� %d���� ������? %b \n",
				first, second, (first == second));
		System.out.printf("%d�� %d���� ���� ������? %b \n",
				first, second, (first != second));
		}
	
	//�Ϲݳ�������
	//���� true | false �� ������ �� ������ ��
	//11���� : &&(�׸���, ~�鼭)
	//				-> ���� ������ ��� �����ϴ��� Ȯ�� �Ҷ� �ַ� ���
	//12���� : ||(�Ǵ�, ~�ų�)
	//				-> ���� ���� �� �ϳ��� �´°� �ִ��� Ȯ���� �� ���
	public void �Ϲݳ��������׽�Ʈ() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǻ�� Ȱ��ɷ� ���� : ");
		int comp = sc.nextInt();
		System.out.print("�����ͺ��̽� Ȱ�� ���� : ");
		int db = sc.nextInt();
		System.out.print("��Ʈ��ũ : ");
		int netw = sc.nextInt();
		
		int average = (comp + db + netw)/ 3;
		
//		String result = (comp >= 40 && db >= 40 && 
//								netw >= 40 && average >=60)? "�հ�" :"���հ�";
		String result = (comp >= 40 & db >= 40 & 
				netw >= 40 & average >=60)? "�հ�" :"���հ�";
		System.out.println(result);
		
		System.out.print("������ �Ͻðڽ��ϱ�?[y/n]");
		char answer = sc.next().charAt(0);
		
//		String aresult = (answer == 'Y' || answer == 'y')? 
//				"��������": "���� �� ��";
		String aresult = (answer == 'Y' || answer == 'y')? 
				"��������": "���� �� ��";
		System.out.println(aresult);
	}
	//�Ϲݳ��������� ���� Ȯ��
	//&& : ���� false �̸� �ڸ� ���� ����
	//|| : ���� true �̸� �ڸ� ���� �� ��
	//��Ʈ�� &, | �� ���� ���� ����� ����
	public void �������ڼ���Ȯ��() {
		//���� ������ �˻��� �� && �����
		//����ǥ�� : �񱳰�1 <= ���� <= �񱳰�2
		//�ڵ�ǥ�� : ���� >= �񱳰�1 && ���� <= �񱳰�2
		
		//�Էµ� ������ �ݵ�� 1���� 100������ ���̾���Ѵٸ�
		System.out.print("���� �ϳ� �Է� : ");
		int num = new Scanner(System.in).nextInt();
		
		if(num >=1 && num++ <= 100) {
			
			System.out.println(num + "�� ���� ���� ���̴�.");
			
		}
		else {
			System.out.println("1~100���� ���� �ƴմϴ�.");
		}
		
		System.out.println("num : " + num);
	}
}
