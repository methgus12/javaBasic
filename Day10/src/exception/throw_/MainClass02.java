package exception.throw_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 * 처리할 작업
		 * 1.입력한 값이 숫자가 아니라면 , 반드시 숫자만입력하세요(단,카운트 증가안됨)
		 * 를 출력한 뒤에 다시 입력받으면 됩니다. 
		 * 2.입력한 값이 1에서 100사이의 값이 아니라면 예외처리 부문으로 이동하고 
		 * 다시 입력받도록 처리 (단, 카운트 증가)
		 * 
		 * 
		 */
		
		//updown

			
			Scanner scan = new Scanner(System.in);
			int i = (int)(Math.random()*100) +1;
			int count=0 ;
	
			while (true) {
			

			try {
				System.out.println("1과 100사이의 값을 입력하세요>");
				int num = scan.nextInt();
				
				if(!(num <= 100 && num >=1)) {
					throw new Exception();
					
				}
				count++;
	
				if(i == num) {
					System.out.println(num+" 정답입니다>");
					
					break;
					
				} else if (i > num ) {
					
				 System.out.println("더 큰수를입력하세요");
				 
				 
				} else if (i < num ) {
					System.out.println("더 작은수를입력하세요");
					
				} 
				
			} catch (InputMismatchException e) {//문자로 입력되었을 떄 오류로 넘어옴
				System.out.println("정수로만 입력하세요");
				scan.nextLine(); //엔터값제거	
				//e.printStackTrace();
			
					
				} catch (Exception e) {
					
					System.out.println("1-100사이의 값을 입력하셔야합니다. 다시입력하세요");
					count++;
			
				}
				
			
			
		
		}System.out.println("시도 횟수" + count);
	}
	

}
