package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.Random 객체를 이용하여 1-45 까지 랜덤정수를 만들고
		 * 2.set 계열을 이용해서 중복되지않는 로또번호를 만들어내는코드를 작성
		 * 
		 */
		
		
		Random ran = new Random();
		Set<Integer> set = new HashSet<>();
		//or treeset 이용 : 오름차순정렬 
		
		while(set.size()<=5) {
			int num = ran.nextInt(45) +1;
			set.add(num);
		}
		
		System.out.println("로또번호는>" + set.toString());
		
		
		
		
		
		
		
	
			
	

		
		
	

}
	}
