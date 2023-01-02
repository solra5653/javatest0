package operator.sample;

import java.util.Scanner;

/**
 * �ڹٰ� �����ϴ� ������ ��� Ȯ�ο� Ŭ�����̴�.
 * created by 2002-12-23
 * developer : �����
 * �ڹٰ� �����ϴ� 45���� �����ڸ� Ȯ���ϱ� ���� �޼ҵ带 �����Ѵ�.
 */

public class OperatorSample {
	/**
	 * ������ �ʱ�ȭ �׽�Ʈ
	 * ������ �ʱ�ȭ��, ���� ����� ���ÿ� �ʱⰪ ����ϴ� ��
	 * ���� :
	 * 		�ڷ��� ������ = �ʱⰪ;
	 */
	public void initVariable() {
		//���(���ڿ�), �����̸�(���ڿ�), �޿�����(����),
		//���ʽ�����Ʈ(�Ǽ�), ��ȥ����(����)�� ���� �ʱ�ȭ
		
		String empId = "E123";
		String empName = "ȫ�浿";
		int salary = 4800000;
		double bonusPct = 0.2;
		char marriage = 'Y';
		
		System.out.println("�������� [ " + empId +", "
									+ empName +", "+ salary +", "
									+ bonusPct +", " +marriage +" ]");
	}
	
	/**
	 * Ű����� ���� �Է¹޾�, ���� �ʱ�ȭ ó��
	 * ���, �̸�, �޿�, ���ʽ�����Ʈ, ��ȥ���θ� Ű����� �Է� �޾�
	 * ���� �ʱ�ȭ ó�� �׽�Ʈ
	 * ���ʽ�����Ʈ�� ����� ������ ����ؼ� ��� ó�� �߰���
	 */
	public void initInputVariable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���. ");
		System.out.print("��� : ");
		String empld = sc.next();
		System.out.print("�̸� : ");
		String empName = sc.next();
		System.out.print("�޿� : ");
		int salary = sc.nextInt();
		System.out.print("���ʽ� ����Ʈ : ");
		double bonusPct = sc.nextDouble();
		System.out.print("��ȥ ����[��ȥ:Y / ��ȥ:N] : ");
		char marriage = sc.next().toUpperCase().charAt(0);
		
		int pay = (int)(salary +(salary * bonusPct) *12);
		
		System.out.println("[��������] ");
		System.out.println("��� : " + empld);
		System.out.println("�̸� : "+ empName);
		System.out.println("�޿� : "+ salary+ "��");
		System.out.println("���ʽ� ����Ʈ : "+ bonusPct+ "point");
		System.out.println("��ȥ ����[��ȥ:Y / ��ȥ:N] : " +marriage);
		System.out.println("���� : " + pay + "��");
	}
	
	//15���� : ����������(,)
	public void testComma() {
		
//		int a = 10;
//		int b; 
//		int c = 30;
		
		//�ڷ����� ���� ���� ���� ���� �ѹ��� ������ �� ����
		int a = 10, b, c =30;
		
		//�ڹٿ����� ���� ���� �� ������ ����� �� ���� : ����
		b = a +c;
		
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	//�ֿ켱������(1����) : (), [], ., ->
	
	public void testLevel1() {
		System.out.println("result1 : " +(10+ 20 * 30));
		System.out.println("result1 : " +((10+ 20) * 30));
	}
	
	//���׿�����(2����) : ��ȣ(sign), ������(+,-)
	//������ �ϳ� �Է¹޾Ƽ�, ����̸� �״�� ����ϰ�
	//�����̸� ����� �ٲ㼭 ���
	public void testSign() {
		System.out.print("���� �ϳ� �Է� : ");
		int value = new Scanner(System.in).nextInt();
		
		//���� ������(13����) : �׸��� 3��
		//��� �� �������� = (���ǽ�)? ���϶� ������ ��: �����϶� ������ ��;
		int result = (value > 0)? value: -value;
		System.out.println("value : " +value);
		System.out.println("result : " +result);
			}
	
	//���׿����� : ������������(! : boolean not);
	//��� : true, false �� �ݴ�� �ٲٴ� ������
	//���׿����� : �񱳿�����(>, >=, <, <=, ==, !=)
	//					����� true | false ��
	public void testBooleanNot() {
		int first = 10, second = 20;
		
		System.out.println(first + " > " + second + " : "
									+ (first > second) ); //false
		System.out.println("!("+first + " > " + second + ") : "
									+ !(first > second) ); //true
		System.out.println(first + " < " + second + " : "
									+ (first < second) ); //true
		System.out.println("!("+first + " < " + second + ") : "
									+ !(first < second) ); //false
		System.out.println(first + " == " + second + " : "
									+ (first == second) ); //false
		System.out.println("!("+first + " == " + second + ") : "
				+ !(first == second)); //true
	}
	
	//���׿����� : ����������(++: 1����, --:1����)
	public void testIncDec() {
		int num = 12;
		System.out.println("num : " + num); //12
		
		// ���������ڰ� ������ �Բ� �ܵ����ÿ���
		// ���� ��/�� ��ġ ���� ����
		// ����++; == ++����; 1����
		// ����--; == --����; 1����
		num++;
		System.out.println("num : " + num); //13
		++num;
		System.out.println("num : " + num); //14
		num--;
		System.out.println("num : " + num); //13
		--num;
		System.out.println("num : " + num); //12
		
		//���������� �ٸ� �����̳� �ٸ� ������ �Ϻη� ���Ǹ�
		//������������ ��ġ�� �����ؾߵ�
		//�κ� ����, ���� �ڿ� ��ġ�ϸ� ���� �� ������ ����
		//�κ� ����, ���� �տ� ��ġ�ϸ� ������ ������ ����
		int result = 3 + num++ * 2;
		//����ϰ� ������ ������ 1�����Ѵ�(ó�� �� ����)
		//12 * 2 > 24+3 > 27 -> result �� ����
		//�� ������ num�� 1 ������
		System.out.println("result : " + result); // 27
		System.out.println("num : " + num); //13
		
		System.out.println("num : " + num++); //14
		//����ϰ� �� ������ 1���� (ó�� �� ����)
		
		result = ++num + 5; //15+5
		//num�� 1������Ű�� ������
		System.out.println("result : " + result); //20
		System.out.println("num : " + num); // 15
		
		System.out.println("num : " + ++num); //16		
	}
	
	//���׿����� : ��������� (+, -, *, /(��), %(������, mod))
	//3���� : *, /, %
	//4���� : +, -
	public void Operataor1() {
		int num = 123;
		int div = 7;
		
		System.out.println("123 / 7 �� : " + (num / div));
		System.out.println("123 / 7 ������ : " + (num % div));
	}
	
	//�������Կ����� : �����ʿ��� �������� ����
	//���� = �� �Ǵ� ���� = ����
	
	public void testSubst() {
		int x = 12, y, z;
		
		z = y = x;
//		(12)<-(12)<-12
		int sum = x + y + z;
		
		System.out.println(x + ", " + y + ", " + z);
		System.out.println("sum =" + sum);
	}
}
