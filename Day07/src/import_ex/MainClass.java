package import_ex;

//fruit 패키지안에 Apple 을 가져오기 .
//import.패키지명을 포함한 전체경로를 적습니다.
import fruit.Apple;
import fruit.Orange;
import fruit.*; 
//*의 의미 ,곱하기 , 전부다 , fruit 패키지의 모든것을 다 가져오겠다는 의미 , 훨씬 간편

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;


public class MainClass {
	public static void main(String[] args) {
		
		Apple a = new Apple ();
		Orange o= new Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF(); // ctrl + comm + space 
		Scanner scan = new Scanner(System.in); // 생성자의매개변수 로 system.in 
		int i =1;
		
		System.out.println(i);
		System.out.println(a);
		System.out.println(o);
		
		
	}
	
	
	
	
	
}
