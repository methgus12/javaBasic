package basic;

import java.util.Arrays;

public class Quiz23 {
	
	
	public static void main(String[] args) {
		
		//int [] arr= {5,23,1,43,100,200,40}; //오름차순정렬 : 점점커지는 
		
		//오름차순일 경우 i인덱스가 j인덱스보다 크면 위치변경
		
		/*for (int i =0; i < arr.length -1; i++) {//마지막 까진 갈필요 없음
			for (int j = i+1; j< arr.length ; j++) {
				if (arr[i] >arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					}
					
			
				
			}
			
			
		}//Arrays.sort(arr);선택정
		System.out.println(Arrays.toString(arr));//Arrays.sort(arr);
		*/
		
		//버블정렬 = 큰 수를 뒤로 
		int [] ar = {5,2,43,20,1};
		
		//1회전 - {2,5,20,1,43}
		//2회전 - {2,5,1,20,43}
		//3회전 - {2,1,5,20,43}
		//4회전 - {1,2,5,20,43}
		
		for(int i =1; i <ar.length ; i++) {
			for(int j = 0; j < ar.length-i ; j++){
			System.out.println(i + "-" +j);
			if (ar[j] > ar[j+1]) {
				int temp = ar[j];
				ar[j]= ar[j+1];
				ar[j+1] = temp;
						
			}
			
		}
		
	} System.out.println(Arrays.toString(ar));
}
}
