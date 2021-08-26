package defalt;

import java.util.Scanner;

public class WhileEx02 {
	
	//입력받은 값까지의 짝수의 개수를 확인해보기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력 >");
		int num = scan.nextInt();
		int count = 0 ; //개수를 누적할 변수
		
		int i =1;
		while(i <= num) {
			
			if(i % 2 ==0) {//짝수
				
				count++; //짝수일 경우의 개수를 누적 
				
			}
			
			i++;
		}System.out.println( num+"까지짝수의 개수 :" + count);
	}
	

}
