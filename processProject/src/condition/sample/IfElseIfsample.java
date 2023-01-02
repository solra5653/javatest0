package condition.sample;

import java.util.Scanner;

/**
 * ¥Ÿ¡ﬂ ifπÆ ≈◊Ω∫∆Æ ª˘«√ ≈¨∑°Ω∫ else ¥Ÿ¿Ωø° if(¡∂∞«Ωƒ)¿ª ªÁøÎ«œ¥¬ «¸≈¬¿” ¡¶Ω√µ» ¡∂∞«¿Ã false ¿œ∂ß ∂« ¥Ÿ∏• ¡∂∞«¿ª ¡¶Ω√«œ¥¬
 * «¸≈¬¿” if(¡∂∞«Ωƒ1){ ¡∂∞«Ωƒ1¿Ã true¿œ ∂ß Ω««‡«“ ±∏πÆ }else if(¡∂∞«Ωƒ2){ ¡∂∞« 1¿Ã false¿Ã∞Ì ¡∂∞«2∞° true¿œ ∂ß
 * Ω««‡«“ ±∏πÆ }........ }else{ ¿ßø° ¡¶Ω√µ» ∏µÁ ¡∂∞«¿Ã false¿œ ∂ß Ω««‡«“ ±∏πÆ }
 */
public class IfElseIfsample {
	// 3∞≥¿« ¡§ºˆ∏¶ ¿‘∑¬ πﬁæ∆º≠, ºº ºˆ ¡ﬂ ∞°¿Â ≈´∞™¿ª æÀæ∆≥ªº≠ √‚∑¬
	public void testThreeMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("√ππ¯¬∞ ¡§ºˆ : ");
		int first = sc.nextInt();
		System.out.print("µŒπ¯¬∞ ¡§ºˆ : ");
		int second = sc.nextInt();
		System.out.print("º¬π¯¬∞ ¡§ºˆ : ");
		int third = sc.nextInt();

		int max; // ∞°¿Â ≈´ ∞™ ¿˙¿ÂøÎ
		if (first > second && first > third) {
			max = first;
		} else if (second > first && second > third) {
			// else == (second >= first || third >= first)
			max = second;
		} else {
			max = third;
		}
		System.out.println("ºº ¡§ºˆ¿« ∞™¡ﬂ ¡¶¿œ ≈´ ∞™¿∫ : " + max);
	}

	// ¡°ºˆ∏¶ ¡§ºˆ∑Œ ¿‘∑¬ πﬁæ∆,
	// ¥‹, ¡°ºˆ¥¬ π›µÂΩ√ 0¿ÃªÛ¿Ãø©æﬂ «‘
	// ¡°ºˆ∞° 90¡° ¿ÃªÛ¿Ã∏È µÓ±ﬁ¿ª 'A' ¥Î¿‘
	// ¡°ºˆ∞° 80¿ÃªÛ 90¡° πÃ∏∏¿Ã∏È µÓ±ﬁ¿ª 'B' ¥Î¿‘
	// ¡°ºˆ∞° 70¿ÃªÛ 80¡° πÃ∏∏¿Ã∏È µÓ±ﬁ¿ª 'C' ¥Î¿‘
	// ¡°ºˆ∞° 60¿ÃªÛ 70¡° πÃ∏∏¿Ã∏È µÓ±ﬁ¿ª 'D' ¥Î¿‘
	// ¡°ºˆ∞° 60¡° πÃ∏∏¿Ã∏È µÓ±ﬁ¿ª 'F' ¥Î¿‘
	// ¡°ºˆøÕ µÓ±ﬁ √‚∑¬
	// ¡°ºˆ∞° 0¡° πÃ∏∏∏È "¿ﬂ∏¯ ¿‘∑¬«œºÃΩ¿¥œ¥Ÿ." √‚∑¬
	public void testScoreGrade() {
		System.out.println("¡°ºˆ∏¶ ¿‘∑¬«œΩ√ø¿.");
		Scanner sc = new Scanner(System.in);
		System.out.print("¡°ºˆ : ");
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.println("AµÓ±ﬁ¿‘¥œ¥Ÿ.");
		} else if (a >= 80) {
			System.out.println("BµÓ±ﬁ¿‘¥œ¥Ÿ.");
		} else if (a >= 70) {
			System.out.println("CµÓ±ﬁ¿‘¥œ¥Ÿ.");
		} else if (a >= 60) {
			System.out.println("DµÓ±ﬁ¿‘¥œ¥Ÿ.");
		} else if (a < 60 && a >= 0) {
			System.out.println("FµÓ±ﬁ¿‘¥œ¥Ÿ.");
		} else {
			System.out.println("¿ﬂ∏¯ ¿‘∑¬«œºÃΩ¿¥œ¥Ÿ.");
		}
	}

	// πÆ¿⁄¿« ¿Ø¥œƒ⁄µÂ∏¶ ¡§ºˆ «œ≥™ ¿‘∑¬πﬁæ∆
	// ¡§ºˆ¥¬ π›µÂΩ√ 0 ~ 65535 π¸¿ß¿« ∞™¿ÃæÓæﬂ «‘
	// π¸¿ß∏¶ π˛æÓ≥≠ ∞™¿Ã∏È, "0 ~ 65535" ªÁ¿Ã¿« ∞™∏∏ ¿‘∑¬«œººø‰." √‚∑¬
	// ¡ˆ¡§µ» π¸¿ßæ»¿« ¡§ºˆ¿Ã∏È
	// øµæÓ ¥ÎπÆ¿⁄¿Ã∏È "Upper"√‚∑¬«œ∞Ì
	// øµæÓ º“πÆ¿⁄¿Ã∏È "Lower"√‚∑¬«œ∞Ì
	// º˝¿⁄πÆ¿⁄¿Ã∏È "Numeric" √‚∑¬«œ∞Ì
	// ∞°~»˛ π¸¿ß¿Ã∏È "«—±€" √‚∑¬«œ∞Ì
	// ±◊ ø‹¿« ∞™¿Ã∏È "Other" √‚∑¬
	public void testCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Ø¥œƒ⁄µÂ(¡§ºˆ)∏¶ ¿‘∑¬«œΩ√ø¿");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (i >= 'A' && i <= 'Z') {
				System.out.println("Upper");
			} else if (i >= 'a' && i <= 'z') {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (i >= '∞°' && i <= '∆R') {
				System.out.println("«—±€");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ªÁ¿Ã¿« ∞™∏∏ ¿‘∑¬«œººø‰.");
		}
	}

	public void testCharacter2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Ø¥œƒ⁄µÂ(¡§ºˆ) ¿‘∑¬«œΩ√ø¿");

		int i = sc.nextInt();

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (i >= 0 && i < 9) {
				System.out.println("Numeric");
			} else if (Character.isLetter(i)) {
				System.out.println("«—±€");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ªÁ¿Ã¿« ∞™∏∏ ¿‘∑¬«œººø‰.");
		}
	}

	// ¡§ºˆ ¿‘∑¬¿ª πÆ¿⁄¿‘∑¬¿∏∑Œ ∫Ø∞Ê
	public void testCharacter3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("πÆ¿⁄ «œ≥™ ¿‘∑¬«œΩ√ø¿");
		char i = sc.next().charAt(0);

		if (i >= 0 && i <= 65535) {
			if (Character.isUpperCase(i)) {
				System.out.println("Upper");
			} else if (Character.isLowerCase(i)) {
				System.out.println("Lower");
			} else if (Character.isDigit(i)) {
				System.out.println("Numeric");
			} else if (this.isKorean(i)) {
				System.out.println("«—±€");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("0 ~ 65535 ªÁ¿Ã¿« ∞™∏∏ ¿‘∑¬«œººø‰.");
		}
	}
	//«—±€¿Œ¡ˆ »Æ¿Œ«œ¥¬ ∏ﬁº“µÂ
	public boolean isKorean(char ch) {
//		boolean result = false;
//		result = (ch >= '∞°' && ch <= '∆R');
		
//		boolean result = (ch >= '∞°' && ch <= '∆R');

//		return result;
		
		return (ch >= '∞°' && ch <= '∆R');
	}
}
