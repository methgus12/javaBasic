package api.lang.util;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		int [] arr = {4,3,6,3,1,7};
		
		
		//sort -오름차순정렬
		
		Arrays.sort(arr);
		
		//tosting 문자열
		
		System.out.println(Arrays.toString(arr));
		
		//binarySearch - 값의 유무확인(선행조건정렬)
		int index = Arrays.binarySearch(arr, 7); //7을 찾겠다.
		System.out.println("7이있는 인덱스 위치>" + index); //없는 값이면 음수값을 반환을 시켜줍니다.
		
		//copyOf, copyOfRange - 배열의복사
		
		int [] newArr = Arrays.copyOf(arr,arr.length );
		
		System.out.println(Arrays.toString(newArr));
		
		int [] newArr2 = Arrays.copyOfRange(arr, 3, 5); //3~5인덱스 까지만 
		
		System.out.println(Arrays.toString(newArr2));
		
		//equals - 배열의 내부요소가 동일한지 확인 
		
		if(Arrays.equals(arr, newArr)) {
			System.out.println("내부값이 동일함");
		} 
		
		
		
	}

}
