package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		//2021.02.19 숙제 !
				/*
				 * 입력받은 수 까지의 크기를 갖는 배열을 생성함
				 * 1부터 입력받은 수 까지 순서대로 배열에 저장 해줌
				 * 
				 * ex) 입력수: 10 
				 * 배열 = [1,2,3,4,5,6,7,8,9,10]
				 * 
				 */
				
				Scanner scan = new Scanner(System.in);
				System.out.print("크기를 지정하세요 >>");
				int size = scan.nextInt();
				
				//입력받은 크기의 배열을 생성
				int [] arr = new int [size];
				int i= 0; //시작 0
				while (i < arr.length) {
					
					arr[i] = i+1;
					i++;
					//arr[i] = ++i;
					}System.out.println(Arrays.toString(arr));
				
	}

}
