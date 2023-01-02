package home.menu;

import java.util.Scanner;

public class CashBurgerKing {

	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		int no;
		int price = 0;
		String a = null;
		String list = "";
		int sum = 0;
		
		do {
			System.out.println("*** 메뉴를 선택하세요 ***\n");
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거		3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김		1000원");
			System.out.println("5. 샐러드			2000원");
			System.out.println("음료수 ***************");
			System.out.println("7. 에이드			1200원");
			System.out.println("8. 커피			1000원");
			System.out.println("********************");

			System.out.print("번호 선택 : ");
			no = sc.nextInt();
				switch (no) {
				case 1:
					System.out.println("불고기버거를 선택하셨습니다. ");
					a="불고기버거";
					price = 3500;
					break;
				case 2:
					System.out.println("치킨버거를 선택하셨습니다. ");
					a="치킨버거";
					price = 3200;
					break;
				case 3:
					System.out.println("감자튀김를 선택하셨습니다. ");
					a="감자튀김";
					break;
				case 4:
					System.out.println("치즈스틱를 선택하셨습니다. ");
					a="치즈스틱";
					price = 400;
					break;
				case 5:
					System.out.println("샐러드를 선택하셨습니다. ");
					a="샐러드";
					price = 2000;
					break;
				case 6:
					System.out.println("콜라를 선택하셨습니다. ");
					a="콜라";
					price = 700;
					break;
				case 7:
					System.out.println("에이드를 선택하셨습니다. ");
					a="에이드";
					price = 1200;
					break;
				case 8:
					System.out.println("커피를 선택하셨습니다. ");
					a="커피";
					price = 1000;
					break;
				}
				System.out.print("수량 : ");
				int su = sc.nextInt();
				list += a+" : " +su + "개"+ " - "+(price*su)+ "원" + "\n";
				sum +=(price*su);
					System.out.println("추가 주문하시겠습니까?(y/n) : ");
			         char answer = sc.next().toUpperCase().charAt(0);
			         if(answer == 'Y') {
			        	 continue;
			         } else {
			        	System.out.println("* 주문하신 정보는 다음과 같습니다. *");
					 	System.out.println("-----------------------------------------------");
					 	System.out.print(list);
					 	System.out.println("-----------------------------------------------");
					 	System.out.println("총 가격 : " + sum);
			        	 break;
			         }		       
			} while (true);		
		}
	}
