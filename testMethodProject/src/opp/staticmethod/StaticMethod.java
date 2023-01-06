package opp.staticmethod;

import java.util.Scanner;

public class StaticMethod {
	// field
	private static String value;
	// constructor
	// 객체 안에 만들어지는 인스턴스변수 초기화가 목적
	// 클래스의 필드가 모두 static 이면 생성자가 필요없음.

	// Method
	// setter & getter
	// 필드가 static 이면 setter 와 getter 도 static 이어야함
	public static void setValue(String v) {
//		StaticMethod.value = v;
		value = v;
	}

	public static String getValue() {
		return value;
	}

	// 필드가 모두 static 일때는 매소드도 모두 static 이어야함
	// static method
	
	// 1. 반환값 없고 매개변수 없는 메소드
	// value 필드 값을 모두 대문자로 바꾸는 static 메소드
	// 메소드명 : toUpper
	public static void toUpper() {
	        
	        char[]arr= value.toCharArray();
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]>=97 && arr[i]<=122){
	                arr[i]=(char)(arr[i]-32);
	                }
	            }
	        System.out.print(arr);
	        }

	// 2. 반환값 없고 매개변수 있는 메소드
	// 인덱스와 문자를 전달받아
	// value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	// 메소드명 : setChar
	public static void setChar(int index, char c){
//		System.out.println(value.substring(0,index) + c
//				+ value.substring(index+ 1));
		if(value != null && value.length() >0) {
			if(index >= 0 && index <value.length()) {
				//String 타입의 문자열 값에서 문자하나의 값을 변경하는
				//java.lang.String 클래스에는 문자하나의 값을 변경하는
				//String ->char[]로 바꾼다음, 문자 하나의 값을 반복
				//char[] -> String 으로 바꾸는 방법
				
				char[]  values = value.toCharArray();
				values[index] =c;
				value = String.valueOf(values);
			}
		}
		
		  }
	
	// 3. 반환값 있고 매개변수 없는 static 메소드
	// value 필드에 기록된 글자갯수 리턴 처리
	// 메소드명 : valueLength
	public static int valueLength() {
		 System.out.println(value.length());
		 return 0;
		
	}

	// 4. 반환값 있고 매개변수 있는 static 메소드
	// 문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	// 메소드명 : valueConcat
	public static String valueConcat(String s) {
		if(value != null && value.length() >0) {
			return value + s;
		}else {
			return null;
		}
	}
}
