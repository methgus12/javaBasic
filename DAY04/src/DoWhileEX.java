
public class DoWhileEX {
	
	public static void main(String[] args) {
		
		
		/*
		 *do ~ while 문은 조건을 마지막에 검사하기 때문에 false여도 한번은 실행이됨
		 *그이후부터는 while문과 동일합니다!
		 */
		//while 문 - 1~10합
		int sum = 0;
		int i =1;
		while (i <= 10) {
			sum +=i;
			i++;
			
			
		} System.out.println("1~10까지의합 :" +sum);
		int sum2=0;
		int k = 1 ;
		do {
			
			sum2 += k;
			System.out.println("1~10까지의 합:" +sum);
			k++;
		
		}while (k <= 10);
		System.out.println("1~10까지의 합 :" +sum2);
	}

}
