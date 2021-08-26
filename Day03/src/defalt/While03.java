package defalt;

import java.util.Scanner;

public class While03 {

	
	public static void main(String[] args) {
		
		//어떤 값에 대한 검증 (조건 형태가 여러가지일수 있다.)
		//입력받은 수가 소수인지 아닌지 검증
		
		Scanner scan = new Scanner(System.in);
		System.out.print("소수인지 판별할 정수를 입력 >");
		int num = scan.nextInt();
		
		int i =2; //제어변수의 시작을 2로한다.
		
		while (num % i !=0) {
			
			
			
			i++;

			
		}
		System.out.println(num == i ? num + "는 소수" : num + "는 소수가아닙니다");
		
		
	}

}
