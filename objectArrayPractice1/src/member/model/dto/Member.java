package member.model.dto;

public class Member {
	private String id;//- id:String	//아이디
	private String name;//- name:String	//이름
	private String password;//- password:String	//패스워드
	private String email;//- email:String	//이메일주소
	private char gender;//- gender:char	//성별
	private int age;//- age:int		//나이
	
	public Member(){}
	
	public Member(String id,String name, String password, 
			String email, char gender, int age ){
		this.id = id;
		this.name = name;
		this.password = password;
		this.email =email;
		this.age = age;
		this.gender = gender;
	}
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender =gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
}
