package basic;

import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입해주세요 >" );
		int money = scan.nextInt();
		
		System.out.println("남은금액 : " + money + "원");
	
		
	
		start:while(true) {
	
			System.out.println("[1] 뎀이소다 : 400원 , [2] 밀키스 : 500원, [3]코카콜라 : 600원, [4] 잔돈받기");
			System.out.print("음료수선택 >");
			int drink = scan.nextInt();
			
		
			switch (drink) {
			
			case 1: 
				if(money >= 400) {
					System.out.println("뎀이소다를 받았습니다.");
					money -= 400;
				}else {
						System.out.println("금액이 부족합니다. 돈을 넣어주세요");
					}
				break;
				
			case 2:
				if(money >=500) {
					
					System.out.println("밀키스를 받았습니다.");
					money -= 500;
					
					} else {
						System.out.println("금액이 부족합니다. 돈을 넣어주세요");
					}break;
				
			case 3 :
				if(money >= 600) {
					System.out.println("콜라를 받았습니다.");
					money -= 600;
					} else {
						System.out.println("금액이 부족합니다. 돈을 넣어주세요");
						}break;
						
			default : 
				System.out.println("남은금액" + money + "원 반환");
				break start;
		}
			
			
		}
	}
}

