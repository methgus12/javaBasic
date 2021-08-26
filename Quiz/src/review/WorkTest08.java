package review;

import java.util.Scanner;

public class WorkTest08 {
	public static void main(String[] args) {
		
		/*
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오
		 * 입력:첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		 * 출력:1부터 n까지 합을 출력한다.
		 */
		int sum =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		
		int n = scan.nextInt();
		
		if (n >= 1 && n <= 10000) {
			
			for (int i =1; i <= n ; i++) {
		
			sum += i;
			
		} System.out.println("n까지의 정수의 합은?" + sum);
	}
	}

}
