package quiz18;

import java.util.ArrayList;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		
		//list에 1~20까지 정수를 저장

		//저장한 값을 반복문으로 출력

		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i =1; i <=20 ; i++) {
			list.add(i);
			
		}
		System.out.println(list.toString());
		
		for(int i =0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}
