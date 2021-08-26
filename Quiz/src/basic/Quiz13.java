
package basic;

import java.util.Scanner;

public class Quiz13 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 사용자가 0을 입력할 때 까지 값을 입력받습니다. 
		 * 0을 입력하면 그 전 까지 입력한 값들의 합을 출력하고 , 종료
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
				
		int i = 1;
		int sum = 0; //입력받은값을 누적할 변수 
		
		while (i != 0)  { //0일때 false 
	
			System.out.print("정수입력>>");
			i = scan.nextInt();
			sum += i;
				
			} System.out.println(sum);
			scan.close();
			
		}		
}

