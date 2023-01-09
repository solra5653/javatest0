package opp.method;

public class NonStaticSample2 {
	public NonStaticSample2() {
	}
	
	// int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
	// 처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여,
	// 임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
	// 메소드 명 : intArrayAllocation
	// 매개변수도 있고 반환값도 있는 메소드
	public int[] intArrayAllocation(int su) {
//		int[] ar = null;
		int[] ar = new int[5];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random()*100) +1;
			
		}
		return ar;  //ar 이 각진  int[] 의 주소가 리턴됨	
	}
	
	// 메소드 명 : display
	// 매개변수 있고 반환값 없는 메소드
	// 처리할 내용 : 배열을 전달받아 화면에 출력함
	public void display(Object[] array) {
		//자바로 만들어지는 모든 클래스는
		//java.lang.Object 의 후손클래스이다.
		//기본 자료형에 대한 wrapper 클래스가 있다.
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+ "    ");
		}
		System.out.println();
	}
	
	//메소드 오버로등(overloading) : 중복 정의
	//한 클래스 안에 이름이 같은 메소드 여러개 작성한 경우
	//주의 : 매개변수가 반드시 달라야 함 (갯수, 자료형)
	// 접근제한자, 반환자료형은 관련이 없음.
	public void display(int[] array) {
	for(int i = 0; i<array.length; i++) {
		System.out.print(array[i]+ "    ");
	}
	System.out.println();
}
	
	// 메소드명 : swap
	// 매개변수 있고 반환값 없는 메소드
	// 처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아
	// 두 인덱스의 값을 교환함
	public void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	// 메소드명 : sortDescending
	// 매개변수 있고 반환값 없는 메소드
	// 처리할 내용 : 위에서 작성한 swap 메소드를 이용하여
	// 배열의 값 들을 내림차순 정렬 처리함
	public void sortDescending(int[] ar) {
		//select sort 방식
		for(int i = 0; i < ar.length -1; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if(ar[i]< ar[j]) {
//					swap(ar,i,j);
					this.swap(ar, i, j);
					//클래스 안의 다른 메소드 호출은
					//this.메소드명() 사용
				}
			}
		}
	}
	
	// 메소드명 : sortAscending
	// 매개변수 있고 반환값 없는 메소드
	// 처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
	public void sortAscending(int[] ar) {
		//select sort 방식
		for(int i = 0; i < ar.length -1; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if(ar[i]> ar[j]) {
//					swap(ar,i,j);
					this.swap(ar, i, j);
					//클래스 안의 다른 메소드 호출은
					//this.메소드명() 사용
				}
			}
		}
	}

	
	// 1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
	// 포함된 문자가 없으면 0 리턴함
	// 메소드명 : countChar
	public int countChar(String s, char c) {
		int count =0;
		
		if(s != null && s.length() > 0) {
			//문자열 값이 있을때만 처리하도록 함
			for(int i=0; i <s.length(); i++) {
				if(s.charAt(i) == c) {
					count++;
				}
			}
		}
		
		return count;
		//return 문은 메소드 맨마지막에 실행되게 작성해야됨.
		//return 문은 메소드에서 딱 한번 실행되게 작성해야 함.
		//return 값; 반환값 또는 반환 주소는 딱 한개만 사용함.
		
	}
	

	// 2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
	// 리턴하는 메소드
	// 메소드명 : totalValue
	public int totalValue(int first, int second) {
		int sum = 0, min, max;
		if(first >second) {
			max = first;
			min = second;
		}else {
			max = second;
			min = first;
		}
		
		for(int n = min; n <= max; n++) {
			sum +=n;
		}
		return sum;
	}
	

	// 문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
	// 메소명명 : pCharAt
	public char pCharAt(String s, int index) {
		//char[] chArr = s.toCharArray();
		//return chArr[index];
		//method chaining : 레퍼런스.메소드().메소드().메소드()
		//반환값이 있는 메소드일 때 사용할 수 있음.
		//단, 반환값이 주소일 때 사용할 수 있음.
		
		//반환값이 배열일 때도 사용할 수 있음
		return s.toCharArray()[index];
		
		//return s.charAt(index);		
	}

	
	// 두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
	// 메소드명 : pConcat
	public String pConcat(String s1, String s2) {
		return s1 + s2;
	}
}
