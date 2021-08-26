package basic;

import java.util.Scanner;

public class MethodQuiz03 {
	
	public static void main(String[] args) {
	//quiz 18
		String str = java(4);
		System.out.println(str);
		
	//quiz 19
		System.out.println(sum (5));
		
	//quiz 20
		System.out.println("3의 소수의 개수" + primeNum(3));
		
	//quiz 21
		System.out.println("7과 9사이의 합" + sumNum(7,9) );
		System.out.println("7과 9사이의 합" + sumNum(9,7) );
		System.out.println("7과 9사이의 합" + sumNum(5,5) );
		}
	
	//18번
	static String java (int num ) {
		
		String result = "";
		
		for(int i = 1; i <= num ; i++) {
			
			String str =(i % 2 == 1) ? "자" : "바" ;
			
			result += str;
		} return result;
	
		
	}
	
	//19번
	static int sum(int num) {
		
		int sum = 0;
		
		for (int i = 1; i <=num ; i++ ) {
			
			if ( num %  i ==0 ) { //약수 의 조건 
				sum += i;
			} 
		}
		
		return sum;
		
		
	}

	//20번
	static int primeNum(int a) {
		int primeNum =0;

		
		for(int i =1; i <= a ; i++) {
			int count = 0;
			//소수판별
			for(int j =1; j <= i ; j++) {
				
				if (i % j ==0) {
					count ++;
				} if (count > 3) {
					break;
				}if ( count ==2) { //소수
					
					primeNum++;
				}
			}
			
		}return primeNum;
	}
	
    //21번
	
	static int sumNum(int a, int b) {
		int max = 0 ;
		int min =0;
		int sum =0;
		
		
		
		if (a==b) {
			return a; //같은경우 종료
			
		}
		else if  (a > b ) {
			max = a;
			min=b;
			} else { //a<b
				max = b;
				min=a;
			}
		for (int i = min ; i <= max; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
	



