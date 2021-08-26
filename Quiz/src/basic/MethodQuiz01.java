package basic;

import java.util.Arrays;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		method1();
		
		
		System.out.println(method2("볼트"));
		
		System.out.println(	method3(2,3,5.112));
		System.out.println(	method4(10));
	
		method5(10, "볼트는 귀여워" );
		System.out.println(	maxNum(7,6));
		
		System.out.println( abs(8));
		
	
		
		char [] arr2 = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(method6(arr2));

		int [] arr1= {1,2,3,4,5};
		System.out.println( method7(arr1) );
		
		String [] arr =method8("a", "b");
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void method1 () {
		
		System.out.println("안녕");
		
		return;
	}
	
	static String method2 (String name ) {

		return name;
	}
	
	static double method3 (int a, int b, double c) {
	
	return a+b+c;
	
}

	static String method4(int num) {
		
		return num % 2 ==0? "짝수" : "홀수";
	}

	static void method5 ( int num, String str) {
		
		for (int i = 1 ; i <= num ; i++) {
			System.out.println(str + "");
			
		}
		
	}

	static int maxNum(int a , int b) {
		
		if (a > b) {
			return a;
			
		} else {
			return b;
		}
	}
	
	static int abs (int a) {
		
		
		return a<0 ? -a : a; //삼항연산식으로 리턴주기 
		
	}
	
	static String method6(char [] arr) {
		
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			
		}

		return str;
	}
	

	static int method7(int[] arr) {
		
		int sum =0;
		for (int i = 0; i <= arr.length ; i++) {
			sum +=arr[i];
		}

		return sum;
	}

    static String[] method8(String a, String b) {
    	String [] arr = {a,b};
    	return arr;
    }
}


