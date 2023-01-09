package opp.method;

public class TestMethod2 {

	public static void main(String[] args) {
		// 일반 메소드 작성 및 사용 실습2
		NonStaticSample2 samp2 = new NonStaticSample2();

		
		int[] nums = samp2.intArrayAllocation(10);
		//call by value(값 전달방식의 호출)

		// 주소가 리턴되어있으므로 출력 가능
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "    ");
		}
		System.out.println();
		
	
//		samp2.display(nums); //int[] --> Object[] : error
		//int[] --> Integer[] 로 바꿈 --> Object[] : 해결 또는
		//int[] --> int[] --> method overloading 으로 해결
		
		samp2.sortDescending(nums);
		samp2.display(nums);
	
		samp2.sortAscending(nums);
		samp2.display(nums);
		//배열명 == 주소 : 메소드 쪽으로 주소 전달함
		//call by adress(주소 전달 방식의 호출)
		//== call by reference : 
		//리턴 안해도 호출된 메소드의 처리결과를 
		//호출부에서 바로 활용할수 있게 됨
		
		//1.
		int count = samp2.countChar("test method", 't');
		System.out.println("문자열 안에 포함된 t문자의 갯수 : "
		+ count +  " 개");
		
		//2.
		int sum = samp2.totalValue(100, 50);
		System.out.println("합계 : "+sum);
		
		//3. pCarAt() 사용
		char ch = samp2.pCharAt("test method", 5);
		System.out.println("인덱스 5번째의 문자 : " + ch);
		
		//4.pConcat() 사용
		String res = samp2.pConcat("test", "method");
		System.out.println(res);
		//메소드 안의 반환값 사용 위치에 해당 메소드 사용해도 됨.
		System.out.println(samp2.pConcat("test", "method"));
	}	
}
