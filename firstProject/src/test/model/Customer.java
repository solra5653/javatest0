package test.model;



public class Customer {
	private String userName = "�����";
	/**
	 * 
	 */
	private int age = 31;
	/**����*/
	private String userid = "kang";
	/**���̵�*/
	private String userPwd = "1234";
	/**�н�����*/
	private double point = 155.8;
	/**��������Ʈ*/
	/**�⺻������*/
	
	public void information() {
		/**������ ��� ��� ó��*/
		System.out.println("["+userName+ ", "+age+ ", "+userid+ ", "+userPwd+ ", "+point+"]");
	};
	
	public void setUserld(String id) {
		userid = id;
		/**���̵� ���� ó��*/
	}
	
	
	public String getUSerid() {
		return userid;
		
		/**���̵� ���� ó��*/
		
	}
	
	
	

	public static void main(String[] args) {
		
		

	}

}
