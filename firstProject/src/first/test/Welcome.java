package first.test;
//�ڹ� doument ���� ������ �ּ� ���
/**
 * �ڹٷ� Ŭ���� �ҽ� ���� �ۼ� ��� ������ Ŭ�����̴�.
 * ��Ű�� ����� Ŭ���� �ۼ� Ŭ���� ���� ��� �ۼ��� �����Ͽ���.
 *
 */
public class Welcome{
	/**
	 * ȯ�� ���� ����� ��������̴�.
	 */

	private String message;
	/**
	 * �⺻ �������̴�.
	 */
	
	
	public Welcome(){}

	/**
	 * message �ʵ尪 ��¿�޼ҵ��̴�.
	 */
	public void printMessage(){
		System.out.println(message);
			}
	/**
	 * 
	 * @param msg
	 * ���ο� �޼����� ���޹޾Ƽ� message �ʵ��� ���� �����ϴ�
	 * �޼ҵ��̴�.
	 */
	public void setMessage(String msg) {
		message = msg;
	}
}