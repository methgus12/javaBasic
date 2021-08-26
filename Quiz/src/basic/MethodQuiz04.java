package basic;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class MethodQuiz04 {
	public static void main(String[] args) {
		//배열의 정렬
		
		/*int [] arr = {5,4,3,2,1};
		int [] arr2= {5,3,4,1,2};
		
		//sort 기억 ! =오름차순으로 정렬해줌 !
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		//배열의 비교 , 문자열 비교는 equals =>int도같음!
		//배열의 내부요소가 동일하면 true , 아니면 false 
		
		System.out.println(Arrays.equals(arr,arr2));
		*/
		
		int [] arr =lottoNum();
		System.out.println(Arrays.toString(arr));
		
		long num = lottoRun(arr);
		System.out.println("당첨되기까지 금액:" + num );
	}
	
	static int [] lottoNum() {
		
		//중복되지않는 1~45 까지의 랜덤수 
		
	
		int [] arr = new int [6];
		int index = 0;
		
		start:while(true) {
			int num  = (int)(Math.random()*45)+1;
			if (index ==6) break;
			
			for (int i =0; i < index; i++) {
				
				if(num == arr[i])
					continue start;
			}

			arr[index] = num ;
			index ++;
			
			if (index == arr.length) break;

		}
		Arrays.sort(arr);
		return arr ;

	} static long lottoRun( int [] arr) {
		long count =0;
		
		while (true) {
			//매서드안에서는 다른메서드 호출이 가능
			int [] ranArr= lottoNum ();
			if (Arrays.equals(arr, ranArr)) {//단 정렬이 선행조건.
				return count * 1000;
				
			} else { //당첨이 아닐
				count ++;
				
				
			}
	}
	

}
}


