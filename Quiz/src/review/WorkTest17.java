package review;

import java.util.Arrays;

public class WorkTest17 {
	public static void main(String[] args) {
		
		/*
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 입력
		 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * 
		 * 출력
		 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		 * 
		 */
		
		int n = 5;
		int [] arr = {20,10,35,30,27};
		int max=0;
		int min=0;
	
		
		for (int i =0; i < arr.length -1; i++) {
			for(int j =i+1; j < arr.length ; j++) {
				if (arr[i] > arr [j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					min = arr[0];
					max = arr[4];
					
				}
				
				}
			}System.out.println("최솟값>" + min + "최댓값>" +max);
	}
	
}
