package basic;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		//구구단을 입력받아서, 입력받은단수의 구구단을 출력해주세요  : 성공!
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int a = scan.nextInt();

		System.out.println("구구단 : " + a + "단");
		
		int gugu = 1;
				
		while (gugu <= 9) {
			
			System.out.print(a + "x" + gugu + "=");
			System.out.println (a * gugu );
			//이렇게 따로가 아닌 , 아래처럼 한번에 하는 게 간단!
			//(a + "x" + gugu = "=" + a * gugu);
			//printf 로 표현하는것도 좋음 ! 
			//system.out.printf("%d x %d = %d \n" , a , i , a*i);
			//훨 간단!! 주의 할것 :printf는 자동 줄바꿈이 없어서 줄바꿈 넣어주기!
			
			
			
			
			
			gugu++;
			
			
			
		}
		
		
		
	}
}
