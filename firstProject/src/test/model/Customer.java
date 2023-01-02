package test.model;



public class Customer {
	private String userName = "강용범";
	/**
	 * 
	 */
	private int age = 31;
	/**나이*/
	private String userid = "kang";
	/**아이디*/
	private String userPwd = "1234";
	/**패스워드*/
	private double point = 155.8;
	/**누적포인트*/
	/**기본생성자*/
	
	public void information() {
		/**고객정보 모두 출력 처리*/
		System.out.println("["+userName+ ", "+age+ ", "+userid+ ", "+userPwd+ ", "+point+"]");
	};
	
	public void setUserld(String id) {
		userid = id;
		/**아이디 변경 처리*/
	}
	
	
	public String getUSerid() {
		return userid;
		
		/**아이디 리턴 처리*/
		
	}
	
	
	

	public static void main(String[] args) {
		
		

	}

}
