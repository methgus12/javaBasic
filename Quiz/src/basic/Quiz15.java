package basic;

public class Quiz15 {
	

	public static void main(String[] args) {
		
		//동전 : 금액을 큰 금액부터 거슬러서 몇개가 나오는 지 출력 
		int [] arr = {1000,500,100,50,10};
		
		//금액 hint : 몫 과 나머지를 생각 해서 풀어보기 / , %
		int money = 17780;
		int i = 0;
		
		while ( i< arr.length) {
			System.out.println(arr[i] + "원 :" + money / arr[i]);
			money = money % arr[i];
			
			
			i++;
			
			
		}
		
	}
	
}	
		
		
		
		
		/*
		 * 2021.02.19 숙제
		 * 
		 */
	


