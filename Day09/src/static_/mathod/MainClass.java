package static_.mathod;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a=10;
		
		c.method1();
		Count.b++;
		
		//static의 메서드 사용 => 클래스이름.메서드
		Count.method2(); 
		
		//b?
		System.out.println(Count.b); //클래스이름.변수]
		
		
		 // 왜 static 이 중요할까?
	
		//Math m = new Math(); X 불가
		
		System.out.println(Math.abs(-5));//"절대값"staticmethod
		
		System.out.println(Arrays.toString(new int[10]));//staticmethod
		 
		System.out.println(Integer.parseInt("1"));//staticmethod
		
		
		MainClass t  = new MainClass(); //아래의 void에 static 을 사용하기 위해 .
		
		
		
	}
	
	public  void test() {
	
		
	}
	

}
