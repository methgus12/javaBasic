package basic;

import java.util.Scanner;

public class Quiz24 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.두수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
		 * 2.2가지의 정수를 1~100사이의 난수를 발생시켜 지속적으로 문제를 출제한 후 정답이면 정답 카운트를 +1씩
		 * 틀리면 오답카운트를 +1씩 올려주는 프로그램을 만드세요 
		 * 또한 이 프로그램은 0을 입력받으면 반복을 중단 합니다 (탈출)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int count1 =0; //정답카운트
		int count2 =0; //오답카운트
		
		while(true) {
			int aa = (int)(Math.random()*100)+1;
			int bb = (int)(Math.random()*100)+1;
			
			System.out.println(aa + " + " + bb + " = " + " ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int quiz = scan.nextInt();
			
			if (quiz == 0) { //탈출의 조건
				
				System.out.println("프로그램을 종료합니다.");
			
				break;
				
			} else if (quiz == aa + bb) {
				
					System.out.println("정답입니다 !!");
					count1++;
				
				
			} else {
					System.out.println("틀렸는데요?");	
					count2++;
					
				}System.out.println("----------------------");		
			
		}
		System.out.println("정답횟수 : " + count1);
		System.out.println("틀린횟수 : " + count2);
	
		
	}

}
