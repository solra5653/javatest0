package operator.run;

import operator.sample.BitOperator;
import operator.sample.OperatorSample;
import operator.sample.OperatorSample2;
import operator.sample.TernaryOperator;

/**
 * 2022-12-23(��) �ۼ�
 * 
 * @author ����� �ڹٿ��� ���Ǵ� ������ �׽�Ʈ�� Ŭ��
 */

public class TestOperator {

	public static void main(String[] args) {
		// Ŭ������ �����ϴ� �޼ҵ带 ����Ϸ��� (non-static)
		// Ŭ������ ���������� = new ������();
		// [�ڷ��� ���ϰ� ���� ���� = ] ��������.�޼ҵ��([���ް�);

		// static �޼ҵ��̸�
		// [�ڷ��� ���ϰ� ���� ���� = ] Ŭ������.�޼ҵ��([���ް�]);

		OperatorSample osamp = new OperatorSample();

		// osamp.initVariable();
		// osamp.initInputVariable();
		// osamp.testComma();
		// osamp.testLevel1();
		// osamp.testSign();
		// osamp.testBooleanNot();
		// osamp.testIncDec();
		// osamp.Operataor1();
		// osamp.testSubst();

		OperatorSample2 osamp2 = new OperatorSample2();

		// osamp2.testOperator1();
		// osamp2.testDimension();

		// ���Կ����� �����ʿ��� ��ȯ�� �ִ� �޼ҵ常 ��� �� �� ����.
		// int result = osamp2.testDimension(); //����

		//osamp2.testSubst();
		//osamp2.testComlexSubst();
		//osamp2.�񱳿������׽�Ʈ();
		//osamp2.�Ϲݳ��������׽�Ʈ();
		osamp2.�������ڼ���Ȯ��();
		
		TernaryOperator test= new TernaryOperator();
		
		//test.testAbs();
		//test.testNesting();
		
		
		BitOperator btest = new BitOperator();
		
		//btest.testBit();
	}

}
