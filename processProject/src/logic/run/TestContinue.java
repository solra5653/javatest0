package logic.run;
//logic.run.TestContinue
public class TestContinue {
	
	//continue �� �׽�Ʈ�� �޼ҵ�
	//�ݺ��� �������� ����� ���ִ� �б⹮
	//if(���ǽ�) continue;
	//�ݺ� ������ �߰� ���� ó����
	public void continueSample() {
		//1~100���� �������� �հ�
		//��, 3�� ������� ������
		int sum = 0;
		for(int no1 =1; no1 < 101; no1++ ) {
			if(no1%3 ==0) continue;
			sum += no1;
			
			System.out.print(no1 + "+");	
		}
		System.out.println();
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// continue �� �׽�Ʈ
		new TestContinue().continueSample();
		
	}

}
