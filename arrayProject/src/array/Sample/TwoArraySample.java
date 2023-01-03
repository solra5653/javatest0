package array.Sample;

import java.util.Random;
import java.util.Scanner;

/**
 * 2차원 배열 테스트용 클래스 1차원 배열 : 자료형이 같은 변수들의 묶음, 배열 선언과 할당시에 배열기호[] 1개 순번(index) ex)
 * int a, b, c, d, e; => int[] ar = new int[5];
 * 
 * 2차원 배열 : 자료형이 같은 1차원 배열의 묶음 배열선언과 할당시에 배열기호[][] 2개 행(층|줄)과 열(호|칸) ex) int[]
 * ar = new int[5]; int[] br = new int[5]; int[] cr = new int[5]; => int[][] tar
 * = new int[3][5]; 3행 5열로 읽음 자바는 1차원 배열만 연속할당임 2차원배열은 각 1차원 배열의 주소들을 배열로 관리함
 * 자바의 2차원배열 == 주소(레퍼런스)배열임 3차원 배열 : 자료형이 같은 2차원 배열의 묶음 배열선언과 할당시에 배열기호[][][] 3개
 * 면(동|페이지)/행(층|줄)/열(호|칸)
 * 
 */
public class TwoArraySample {
	// Field
	// 접근제한자 자료형 변수면 [= 초기값];
	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();

	// Method
	// 접근제한자 반환자료형 메소드명([자료형 매개변수]){ 소스작성 }
	// []는 생략 가능함
	public void testMethod() {
		// 1. 2차원배열 선언
		// 2차원 배열에 대한 레퍼런스(주소변수) 만들기
		// 자료형[][] 배열레퍼런스;
		// 자료형 []배열레퍼런스[];
		// 자료 배열레퍼런스[][];
		int[][] tar; // 지역변수는 동적메모리 stack 에 할당됨

		// 2. 배열 생성
		// 힙 메모리에 배열공간 만들기
		// 정변 배열 만들기 : 각 1차원 배열들의 방갯수(열)가 동인한 경우
		tar = new int[3][5];

		System.out.println("할당된 행 갯수 : " + tar.length);
		System.out.println("각 1차원배열의 방갯수 : ");
		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "번째 : " + tar[i].length);
		}

		// 2차원배열의 사용 : 2중 for문을 사용함
		// for(행반복){ for(각 행별 열에 대한 반복){ 배열레퍼런스[행][열] }}
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				System.out.print(tar[i][j] + "     ");
			}
			System.out.println();
		}

		// 1~100사이의 랜덤값 기록 처리
		for (int i = 0; i < tar.length; i++) {

			for (int j = 0; j < tar[i].length; j++) {
				tar[i][j] = random.nextInt(100) + 1;
				System.out.print(tar[i][j] + "     ");
			}
			System.out.println();
		}

		// 출력확인
		for (int i = 0; i < tar.length; i++) {
			System.out.print(i + "행 : ");
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf("%7d", tar[i][j]);
			}
			System.out.println();
		}
	}

	// 가변배열 테스트용
	// 각 1차원배열들의 방갯수가 다른 경우
	public void testMethod2() {
		// 2차원배열 선언과 생성시 열값 생략할 수 있음
		int[][] tar = new int[3][];
		// 각 1차원배열의 주소보관용 배열 만들기만 함

		// 각 행별 열(방)갯수는 나중에 지정하는 형태임
		// 2번째 new는 1차원 배열 만들기임
		tar[0] = new int[7];
		tar[1] = new int[4];
		tar[2] = new int[10];

		System.out.println("행갯수 : " + tar.length);
		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "행별 열갯수 : " + tar[i].length);
		}
		// 출력확인
		for (int i = 0; i < tar.length; i++) {
			System.out.print(i + "행 : ");
			for (int j = 0; j < tar[i].length; j++) {
				System.out.printf("%5d", tar[i][j]);
			}
			System.out.println();
		}
	}
	
	//1차원배열의 초기화 : 배열공간 할당과 동시에 초기값 기록
	//자료형[] 배열명 = {초기값, 초기값, .......};
	//자료형[] 배열명 = new 자료형[]{초기값, 초기값, ......};
	public void initTwoArray() {
		//정변배열 초기화
		int[][] tar = {{10,20,30,40}, 
				{11,22,33,44}, {12,23,34,45}}; //3행 4열
		//출력확인
		for(int i=0;i<tar.length; i++) {
			//각 행별 열(값)에 반복
			for(int j = 0; j<tar[i].length; j++) {
				System.out.print(tar[i][j]+ "  ");
			}
			System.out.println();
		}
	}
	public void initTwoArray2() {
		//가변배열 초기화
		int[][] tar = {{10,20,30,40,50}, 
				{11,22,33,44}, {12,23,34,45,56,78,89}}; //3행 열은 제각각
		//출력확인
		for(int i=0;i<tar.length; i++) {
			System.out.println(i + "행의 값 갯수 : " + tar[i].length);
			//각 행별 열(값)에 반복
			for(int j = 0; j<tar[i].length; j++) {
				System.out.print(tar[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}