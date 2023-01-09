package test.method;

public class NonStaticSample {
	public NonStaticSample() {
	}

	// 1. 반환값 없고 매개변수 없는 메소드
	// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	// 메소드명 : printLottoNumbers
	public void printLottoNumbers() {
//		System.out.println("this : " this.hashCode());
		int[] lottos = new int[6];

		// 값 발생
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = (int) (Math.random() * 45) + 1;

			// 중복값 확인
			for (int j = 0; j < i; j++) {
				if (lottos[i] == lottos[j]) {
					i--;
					break;
				}
			}
		}
		// 정렬 (오름차순정렬 : ascending)
		// 작은 값에서 큰값 순으로 배치
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int j = i + 1; j < lottos.length; j++) {
				// 오름차순
				if (lottos[i] > lottos[j]) {
					// if(lottos[i] > lottos[j]){ //내림차순
					// 앞의 값이 크면 서로 값을 바꿈
					// swap 공식
					int temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp;
				}
			}
		}

		// 출력
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "	");
		}
		System.out.println();
		return;
	}

	// 2. 반환값 없고 매개변수 있는 메소드
	// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	// 메소드명 : outputChar
	public void outputChar(int count, char c) {
		for (int k = 1; k <= count; k++) {
			System.out.print(c + "	");
		}
		System.out.println();

		return;
	}

	// 3. 반환값 있고 매개변수 없는 메소드
	// 실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	// 메소드명 : alphabette
	public char alphabette() {
		int code = 0;
		do {
			// 'A'(65)~ 'z'(122) 까지 정수 발생
			code = (int) (Math.random() * ('z' - 'A' + 1)) + 65;

			// 92~96
//			if((code >='A'&& code <='Z')||
//					(code >='a'&& code <='z')) {
			// 반환값 있는 메소드는 조건식 위치에 사용할 수도 있음
			// 단, 반환자료형이 boolean(참/거짓) 이어야함
			if (Character.isAlphabetic(code)) {
				break;
			}

		} while (true);
		return (char) code;
	}

	// 4. 반환값 있고 매개변수 있는 메소드
	// 실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	// 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	// 메소드명 : mySubstring
	public String mySubstring(String s, int beginIndex, int endIndex) {
		String returnValue = null;

		if (s != null && s.length() > 0) {
			// 전달된 인덱스도 문자열 범위 안이어야 함
			if (beginIndex < s.length() && endIndex < s.length()) {
				// 시작인덱스가 끝 인테스보다 작은지 확인
				if (beginIndex < endIndex) {
					returnValue = String.valueOf(s.charAt(beginIndex));
					for (int i = beginIndex + 1; i <= endIndex; i++) {
						returnValue += s.charAt(i);
					}
				}
			}
		}
		return returnValue;
	}
}
