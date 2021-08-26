package static_.basic;

import java.util.Arrays;

import com.sun.net.httpserver.Authenticator.Result;

public class MainClass {
	
	public static void main(String[] args) {
	
		//1.계산기 2개를 만들고 각각 색상을 지정
		Calculator cal = new Calculator();
		cal.setColor("Red");
		
		Calculator cal2 = new Calculator();
		cal2.setColor("green");
		
		//2.계산기색상을 확인 하세요
		
		System.out.println("계산기 1의 색상" + cal.getColor());
		System.out.println("계산기 2의 색상" +cal2.getColor());
		
		//4.pi 와 areacircle() 메서드를 이용해서 원의 넓이를 구하세요.
		
		System.out.println("원의 넓이" + Calculator.pi * 4 * 4 );
		System.out.println("원의넓이" + Calculator.areaCircle(4));
		//cal.아닌거 주의! Calculator.!!
		
		//
		int [] arr ={1,2,3};
		System.out.println(ArrayPrint.printArray(arr));
		Arrays.toString(arr);
		
				
	}
	
	
	
	
	

}
