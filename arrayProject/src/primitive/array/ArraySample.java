package primitive.array;

import java.util.Random;

public class ArraySample {
	public void test1() {
		int[] arr = new int[10];
		
		int sum = 0;

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
			sum += arr[i];
			System.out.println("arr" + "[" + i + "]: "+ arr[i]);
		}
		System.out.println("10개의 정수들의 합: " + sum);
	}
	public void test2() {
		int[] arr = new int[10];
		
		int max = 0;
		int min = 0;
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			if(i==0) {				// 첫번째 랜덤값에서 부터 비교하게 하기 위
				max = min = arr[0];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: ");
	}
	public void test3() {
		byte arr[] = new byte[10];
		// byte 자료형 값 범위: -128 ~ 127
		int sum = 0;
		Random random = new Random();
		new Random().nextBytes(arr);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += i;
			}
			System.out.println("arr" + "[" + i + "]: "+ arr[i]);
		}
		System.out.println("sum: " + sum);
	}
	
	public void test4(){
		
	}
	
}





























