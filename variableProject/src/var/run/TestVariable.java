package var.run;

//�ٸ� ��Ű���� Ŭ���� ���� �ݵ�� import ������ �ؾ���
import var.sample.VariableSample;
import var.sample.VariableSample2;

public class TestVariable {

	public static void main(String[] args) {
		// �ڹ� ���� �׽�Ʈ
		// import �� Ŭ������ �����ϴ� �޼ҵ带 ����Ϸ���
		// Ŭ������ ���۷������� = new Ŭ������();       [new ������]
		// ���۷�������.�޼ҵ��([���ް�,...]);
		// ��ä �����̿��� new �Ἥ ��ü�� ������ �ϴ� ����
		// �����Ͻ� �ڵ����� �⺻ �����ڰ� �߰��ȴ�. �� ������ ���� Ŭ������ ���������.
		
		VariableSample vsamp = new VariableSample();
		//vsamp.testPrimitiveType();
		//5.0E7�� 5.0�� 7��
		
		//import ������� �ʰ� �ٸ� ��Ű���� Ŭ���� ��� : 
		//var.sample.VariableSample vsamp �̷��� Ŭ���� Ǯ�����̶�� �Ѵ�.
		//var.sample.VariableSample vsamp
		//			= new var.sample.VariableSample();
		
		//vsamp.testPrimitiveType();
		//vsamp.testString();
		
		//��� �޼ҵ��� ���� Ÿ���� void �϶� :
		//���۷�������.�޼ҵ��();
		//Svsamp.testInit();
		
		//���ϰ��� �ִ� �޼ҵ带 ����Ҷ� : 
		//���ϰ� �޾��� ���� = ���۷���.�޼ҵ��();
		//String value = vsamp.testInit2();
		//System.out.println("value : " + value);
		
		//�޼ҵ� �ȿ��� return �� �ѹ��� ������. ������ return�� �Ұ���.
		
		//String exam = vsamp.example();
		//System.out.println("�л����� : "+ exam);
		//vsamp.testSanner();
		
		

	}

	private static VariableSample2 VariableSample2() {
		VariableSample2 vsamp2 = new.VariableSample2();
		vsamp2.testWrapper();
	}

}
