import java.util.Scanner;

public class ContinueEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 >");
		int num= scan.nextInt();
		int count  = 0;
		int sum = 0;
		
		
		for ( int i = 1 ; i <= num ; i ++) {//검증할 숫자
			
			count = 0 ; //검증전 카운트 초기화 
			ex:for (int j = 1; j <= i ; j++ ) {//소수인지 판별 
				
				if(i % j ==0) { //i의 약수인 경우 count
					count++;
				}
				
				if(count > 2) {
					continue ex;
				}
			}
			if (count ==2) {
				sum += i;
				
			}
			
			
		}System.out.println(num +"까지 소수의 합은"+ sum);
		
	}

}
