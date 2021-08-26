package Hello;

public class IntegerEX {
	
	public static void main (String[]args) {
		
		//정수형 타입
		byte a = 127;
		byte a1= -128;
		
		short b =32767;
		short b1 =-32768;
		
		int c = 2147483647;
		int c1= -2147483648;
		
		long d = 2147483648L; //long 타입은 L을 붙인다 뒤에
		
		System.out.println(d);
		System.out.println("---------------------");

		
		
		//2진수 혹은 8진수 혹은 16진수로 저장 할수있다.
		
		//2진수는 0b를 붙임 , 즉 숫자 앞에 0b를 붙이면 2진수로 표현
		int bin =0b1010;
		System.out.println("이진수 1010의 값은 :" + bin + "입니다");
		
		//8진수는 0 붙임
		
		int octa = 064;
		System.out.println("8진수 064의 값은 :"+octa+"이다.");
		
		//16진수는 0x를 붙임
		
		int hexa = 0x3a4c;
		System.out.println("16진수 0x3a4c 값은 :"+hexa);
		
		System.out.println("---------------------");
		
		float f1 =3.14f;
		double d1 = 3.14;
		
		//e표기법
		
		double d2 = 314e-2;
		double d3 = 0.0314e2;
		
		System.out.println(d2);
		System.out.println(d3);
		
		
		System.out.println("---------------------");
		//무조건 true, false만 사용가능 한 boolean
		
		boolean bool1 = true ;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
