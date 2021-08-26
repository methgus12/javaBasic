package review;

import java.util.Scanner;

public class WorkTest01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		int a = scan.nextInt();
		
		if(a>=0 && a<=100) {
			if(a >=90) {
				System.out.println("A");
				
			} else if (a >=80) {
				System.out.println("B");
			} else if (a>=70) {
				System.out.println("c");
			} else if (a>=60) {
				System.out.println("d");
			} else {
				System.out.println("F");
			}
			
		}
		
		
		
		
	}
	/*
	 * 시험 점수를 입력받아 90 ~ 100점은 A, 
	 * 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	 */
	


}
