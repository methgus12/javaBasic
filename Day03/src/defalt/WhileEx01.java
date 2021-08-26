package defalt;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
		
		int a = 1; //반복문의 횟수를 제어할변수 
		
		int sum = 0; // 이렇게 누적할변수는 꼭 반복문 밖에다 만들어야 함 ! 주의 *
		
		while( a <= 10 ) {
			
			System.out.println(a);
			
		
			sum += a;  //sum = sum + a; 같은표현 !
						
			a++; // a를 증가시키겠다. 제어변수의 조작을 통해서 조건이 언젠가 false가되도록 !
			
		}
		System.out.println("1~10까지의합 :" + sum);
	}

}

