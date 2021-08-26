package defalt;

import java.util.Scanner;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		//10번 숫자를 입력받고 , 입력받은 값들의 합 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
		
		while (i <=10) {
			System.out.print(" 정수 입력 >>");
			int num = scan.nextInt();
			
			sum +=num; // sum = sum + num ;
		
			i++;
		} System.out.println("입력받은 수들의 합 : " + sum);
		
		scan.close(); //닫아주기 scan 
		
	}

}
