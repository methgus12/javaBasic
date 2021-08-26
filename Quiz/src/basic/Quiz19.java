package basic;

import java.util.Arrays;
import java.util.Random;

public class Quiz19 {
	
	public static void main(String[] args) {
		
		/*
		int x = 1;
		int y = 5;
		
		int temp = x;
		x=y;
		y=temp;
		System.out.print("x:" + x+  " , y:" + y);
		*/
		
		/*
		 * 배열의 들어가있는 값 중에서 절대 중복되지 않는 숫자 3개를 랜덤으로 추출하려 합니다.
		 * 
		 * 
		 *  방법 - 배열의길이만큼 회전하되, 랜덤하게 뽑힌 인덱스 위치값의 자리를 바꿉니다. 
		 */

		//r번째값 과 i번째값을 치환해라
	//0~2째 값을 새로운 배열에 옮기세요 

		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			int r =(int)(Math.random() * arr.length); //랜덤 인덱스
			
			int temp = arr[i];
			arr[i] =arr[r];
			arr[r] =temp;
			//한 줄로 연결해서 보면 훨씬 편함 !
		
				
			}System.out.println(Arrays.toString(arr));
			
			//0~2번째 값을 새로운 배열에 옮기세요 .
			
			int [] newArr = new int [3]; //새로운 배열 만들기
			for(int i =0 ; i < newArr.length; i++) {
				newArr [i] = arr[i];
				
			}System.out.println(Arrays.toString(newArr));
			

	
	}	
			
			
			
}
