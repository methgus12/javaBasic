package quiz15;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		//updown
		
		Scanner scan = new Scanner(System.in);
		
		int i = (int)(Math.random()*100) +1;
		int count=0 ;
		
		while (true) {
			
			try {
				System.out.println("1과 100사이의 값을 입력하세요>");
				int num = scan.nextInt();
				count++;
				
				if(i == num) {
					System.out.println(num+" 정답입니다>");
					
					break;
				} else if (i > num ) {
					
				 System.out.println("더 큰수를입력하세요");
				 
				 
				} else if (i < num ) {
					System.out.println("더 작은수를입력하세요");
					
				}
				
			} catch (Exception e) {
				
				System.out.println("잘못입력했습니다.");
				scan.nextLine(); //엔터값제거
				count++;
			}
			
		}System.out.println("도전한 횟수" + count);
	}

}
