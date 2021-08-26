package quiz16;

import java.util.Scanner;

public class StrQuiz03 {
	
	public static void main(String[] args) {
		

		System.out.println(test01(123123));
		System.out.println(test01(0));
		System.out.println(test02(100000));
		//System.out.println(result);
		
		//실제 코딩테스트 문제
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return 하는메서드를 작성해주세요
		 * 
		 * 조건
		 * n은 1억이하의 자연수
		 * n을 자료형으로 변환해서 연산하지말것
		 * (string사용 - test1 , string 사용 하지않고 test2)
		 * 
		 */
		
		
		/*
		 * Scanner scan= new Scanner(System.in) ;
		System.out.print("자연수 입력>");
		int n = scan.nextInt();
		int sum =0;
		while(n>0) {
			sum += n%10;
			n /= 10;
			
		}

		 * 
		 */
	}
		
		public static  int test02 (int n) {
		
		int result=0;
		
		String s = String.valueOf(n);
		
		
		for(int i =0; i < s.length(); i++) {
			result  += Integer.parseInt(s.charAt(i) + "") ;

		}
		
		return  result;
	
	}
		public static int test01(int num) { 
			int sum =0;
			for(int i =1000000000; i >=1 ; i/=10) {
				
				sum+= (num/i);
				num -= (num /i) * i;
				System.out.println(i);
			}
			return sum;
		}
		
		
	

		
	}
	
