package first.run;

//import : �ٸ� ��Ű���� �Ҽӵ� ���� �����ϴ� ������
//import ��Ű����.*; 
//import ��Ű����.Ŭ������;

//import static : �̱���(Single-Ton) ������ �������� �ۼ���
//Ŭ������ �޼ҵ� import�ÿ� �����
//single-ton :  ���α׷��� �����Ǵ� ���� �޸𸮿� �� �Ѱ��� ����
//					��� �����ϸ鼭 ����ϰ� �ۼ��ϴ� �����
import static java.lang.Math.max;
//import�� Math�� �ҷ��ͼ� ���صǴ°��̴�.


public class TestimportStatic {

	public static void main(String[] args) {
		// Ŭ������ ���� public static ��� ���
		// Ŭ������.���
		System.out.println("������ : " + Math.PI );
		System.out.println("��� : " + max(12.5, 33.7));
		//System.out.println("��� : " + Math.max(12.5, 33.7));
		System.out.println("���밪 : " + Math.abs(-5));
		//System.out.println("���밪 : " + abs(-5)); ���� import�� �������ϸ� ����
		/*
		Math math = new Math();
		math.abs(-3.5);
		*/
		
		
	}

}
