package quiz05;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("원의넓이 >" + cal.circle(5));
		System.out.println("곱셈>" + cal.multi(10));
		System.out.println("나눗셈>" + cal.div(10)) ;
		
		Computer com = new Computer();
		System.out.println("원의 넓이>" + com.circle(9));
		System.out.println("정사각형의넓이>" + com.rect(6));
		System.out.println("직사각형의넓이>" + com.rect(6, 10));
		System.out.println("정사각형의넓이>" + com.rect(3, 7, 10));
		
		
		//한번더 복습하기!!
		ArrayPrint ap = new ArrayPrint();
		
		String [] ar = {"가", "나", "다"};
		System.out.println(ap.printArray(ar));
		
		int [] ar2 = {1,2,3};
		System.out.println(ap.printArray(ar2));
		
		double [] ar3= {3.14, 2.32};
		System.out.println(ap.printArray(ar3));
		
		System.out.println(Arrays.toString(ar));
		
		//어려워...
		
		
			
		}
		
		
	}
	

