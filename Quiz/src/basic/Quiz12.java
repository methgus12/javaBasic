package basic;

import java.util.Scanner;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		
		
		
		//1. 1~ 입력받은 수까지의 3의 배수이거나, 4의 배수일 경우에 출력합니다.
		//2. 1~ 입력받은 수까지의 6의배수의 합계
		//3.1~1000 까지의 정수중의 4의 배수이면서, 8의 배수가 아닌 수의 개수
		//4.1000의 약수의 개수 
		
		//문제 1
		
		/*Scanner scan =new  Scanner(System.in);
		System.out.print("정수입력 >>");
		int a = scan.nextInt();
		
		int i = 1;
		while( i <= a) {
			if (i % 3 == 0 || i % 4 == 0) {
				System.out.println( i + ""  );
				
				
				
			} i++;
		} */
		
		//문제 2
		
		/*Scanner scan =new  Scanner(System.in);
		System.out.print("정수입력 >>");
		int a = scan.nextInt();
		
		int i = 1;
		int sum =0;
		
		while (i <= a) {
			if (i % 6 ==0) {
				sum += i;
		
				
			} i++;
		}System.out.println( a+ "까지의 6의배수의합 >> "+ sum);*/
		
		
		
		
		
		
		//문제3
		
		
		/*int i = 1;
		int count= 0;
		
		while (i <= 1000 ) {
			if (i % 4 ==0 && i % 8 !=0) {
				count++;
			}i++;
			
		}System.out.println("4의 배수이면서 , 8의 배수가 아닌 수의 개수는 >" + count);
		
		
		
	}*/
		
		//문제4
		
				int a =1;
				int count = 0;
				
				while (a <= 1000) {
					if (1000 % a == 0) {
						
						count++;
						
					}a++;
				} System.out.println( "1000의 약수의 개수" + count );
				}
		}

		

		
	
		


	
