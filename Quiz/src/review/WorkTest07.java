package review;

import java.util.Scanner;

public class WorkTest07 {
	/*
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 
	 * 줄에 A와 B가 주어진다. (0 < A, B < 10)
	 * 각 테스트 케이스마다 A+B를 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("T>");
		int t = scan.nextInt();
		
		int sum =0;

		System.out.println(t);
		for(int i =1; i <= t ; i++) {

			System.out.print("정수A>");
			int a = scan.nextInt();
			System.out.print("정수B>");
			int b = scan.nextInt();
			
			if(a >0 && b<10) {
			sum = a+b;
			System.out.println(sum);
		}
		
		}
		
		
		//sum = a+b;
		//System.out.println(sum);
	

}
}
