package opp.method;

public class TestMethod2 {

	public static void main(String[] args) {
		// 일반 메소드 작성 및 사용 실습2
		NonStaticSample2 samp2 = new NonStaticSample2();

		// 1.
		int[] nums = samp2.intArrayAllocation(10);
		//call by value(값 전달방식의 호출)

		// 주소가 리턴되어있으므로 출력 가능
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "    ");
		}
		System.out.println();
		
		//2.
//		samp2.display(nums); //int[] --> Object[] : error
		//int[] --> Integer[] 로 바꿈 --> Object[] : 해결 또는
		//int[] --> int[] --> method overloading 으로 해결
		
		//3.
		samp2.sortDescending(nums);
		samp2.display(nums);
		
		//4.
		samp2.sortAscending(nums);
		samp2.display(nums);
		//배열명 == 주소 : 메소드 쪽으로 주소 전달함
		//call by adress(주소 전달 방식의 호출)
		//== call by reference : 
		//리턴 안해도 호출된 메소드의 처리결과를 
		//호출부에서 바로 활용할수 있게 됨
	}	
}
