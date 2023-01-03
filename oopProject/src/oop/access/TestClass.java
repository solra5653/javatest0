package oop.access;

//final class는 상속에서 부모로 사용할 수없음.
public class TestClass extends java.util.Calendar /* extends String */{
	//다른 클래스의 사용
	//1. 필드로 사용
	private DefaultSample dsamp;
	private PublicSample psamp;
	
	//2. 메소드에서 지역변수 사용
	public void testMethod(DefaultSample dsamp) {
		PublicSample psamp;
		// abstract(미완성된) class : 추상클래스라고 함
		// => 객체 못 만듦, 레퍼런스 변수는 만들수 있음.
		java.util.Calendar today;
//		today = new java.util.Calendar(); //객체 생성 못함
		
		
		
	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}
}
