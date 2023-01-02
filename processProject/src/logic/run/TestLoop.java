package logic.run;

import loop.sample.DblForSample;
import loop.sample.DoWhileSample;
import loop.sample.ForSample;
import loop.sample.WhileSample;

public class TestLoop {

	public static void main(String[] args) {
		//
		ForSample fsamp = new ForSample();
//		fsamp.sumNumbers();
//		fsamp.sumNumbers2();
//		fsamp.sum1To100Even();
//		fsamp.sumMintoMax();
//		fsamp.printGugudan();
//		fsamp.sum1toRandom();
		
		WhileSample wsamp = new WhileSample();
//		wsamp.printUnicod();
//		wsamp.printUnicod2();
//		wsamp.printUnicod3();
//		wsamp.testWhile1();
//		wsamp.printUnicod4();
//		wsamp.strLength();
//		wsamp.strLength2();
//		wsamp.strLength3();
//		wsamp.containChar();
		
		DoWhileSample dsamp = new DoWhileSample();
//		dsamp.printUnicode();
//		dsamp.printUnicode2();
//		dsamp.displayMenu();
		
		
		DblForSample dbl = new DblForSample();
//		dbl.testDoubleFor();
//		dbl.gugudan();
//		dbl.printNumbers();
//		dbl.printNumbers2();
//		dbl.printNumberStar();
//		dbl.printNumberStar2();
		dbl.printStar();
		System.out.println("반복문 연습 프로그램 종료!");
	} //main() 끝나면 프로그램 종료임.

}
