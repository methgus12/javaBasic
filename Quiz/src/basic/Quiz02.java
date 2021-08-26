package basic;

import java.util.Random;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		//1. 1 ~ 100 까지 랜덤한 정수를 생성하고 , 3의 배수인지 아닌지3항 연산식으로 판별
		
		//2. -5 ~ 5 까지 랜덤한 정수를 생성하고 , 무조건 절대값만 출력하는 3항연산식을만드세요
		
		//3. 1~200까지의 랜덤한 수를 만드는데 이것을 사과의 개수라고 가정.
		//bucket은 사과를 담는 바구니 입니다.(10)
		//어떤 사과가 나오던, 필요한 바구니의 개수를 구하는 3항연산식을 만드세요
		
		
		//1번 문제
		int r = (int)(Math.random() * 100) +1; // +1 빼먹지말기!!
		
	
		System.out.println(r % 3 == 0? r+ "3의 배수다 " : r+  "3의배수가 아닙니다");
		
		//String result = r % 3 == 0 ? "3의배수" : "3의 배수 아니다";
		
		//System.out.println(result);
		
		System.out.println("---------------------");
		
		
		//2번 문제 11곱해준후 5를빼
		
		int rr = (int)(Math.random()* 11)-5;
		
		System.out.println(rr + "의 절대값" + (rr <0 ? -rr : rr));
		
		System.out.println("---------------------");
		
	
		
		//3번문제 사과가 150개면 15개의바구니 필요 157개의 사과면 16개가 필요 
		//즉 딱 나누어 떨어지느냐가 중요한 포인트임 !
		//사과를 10으로 나눈 몫에 나머지가 있으면 몫 +1 
		
		
		int num = (int)(Math.random()* 200)+1;
		int bucket = 10;
		int count = num % bucket ==0? num / bucket : num / bucket +1;
		System.out.println("사과의 개수 : "+ num + "필요한 바구니의 개수 "+ count);
		
		//복습하기 ! 
		
	
		
		
		
		
		
		
		//System.out.println(apple);
		
		
		
		
		
			
	}

}
