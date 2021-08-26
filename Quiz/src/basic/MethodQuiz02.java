package basic;

import java.util.Scanner;

public class MethodQuiz02 {
	public static void main(String[] args) {
		/*
		//print() 
		System.out.println("정수 두개를 입력하세요");
	
		
		//input() 2번 호출
		 * Scanner scan = new Scanner(System.in);
 		System.out.print("정수>");
		int num1 = scan.nextInt();
		System.out.print("정수>");
		int num2 = scan.nextInt();
		
		//add() 결과를 반환
		int result = num1 + num2;
		
		//result() 결과값을 출력
		System.out.println("두수의 합:" + result);
	*/	
		print();
		int num1 =input();
		int num2 = input();
		
		int result = add(num1,num2);
		result(result);

		
	}
	
	static void print() {
		
		System.out.println("정수 두개를 입력하세요");
		
	}
	
	static int input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();

		return num;

	}
	
	static int add(int a , int b) {
		return a+b;
		
	}
	
	static void result(int r) {
		System.out.println("두수의 합:" + r);
	}

     
//method 6,7,8, 만들고 quiz 18~21 까지 만들어오기. ㅋㅅ

}


