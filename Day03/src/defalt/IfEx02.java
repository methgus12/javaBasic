package defalt;

import java.util.Scanner;

public class IfEx02 {
	
	public static void main(String[] args) {
		
		//입력받은 점수를  A~F등급으로 분리
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt(); //정수형 Int
		
		if(point >= 90) {
			
			if (point > 100) {
				System.out.println("잘못된 점수입니다.");
			} else if (point >= 95) {
				System.out.println("A+ 학점 입니다");
				
			}else { //90 <= x < 95
				
				System.out.println("A학점입니다.");
				
			}
			
		} else if (point >= 80) { 
			System.out.println("B학점입니다");
		} else if (point >= 70) {
			System.out.println("C학점입니다");
		} else if (point >=60) {
			System.out.println("D학점입니다");
			//위의 내용의 점수에 포함 안되면 !
		} else {
			System.out.println("F학점입니다");
		}
		
		
		
		
		
	}

}
