package ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {
	
	public static void main(String[] args) {
		
		/*
		 * 반복자 스트림이란?
		 * 컬렉션의 값을 조금 더 빠르고 , 간결하게 사용할 수 있도록 제공해주는 구조물
		 * 반복자 스트림은 함수적 인터페이스를 받고 있기 때문에 람다식을 지원 
		 * 
		 */
		
		String [] arr = {"홍길동" , "이순신", "박찬호", "김유신" , "강감찬"};
		
		List<String> list = Arrays.asList(arr);//배열을 리스트로 변환
		
		list.stream();
		
		Stream< String> stream = list.stream();//리스트를 스트림으로 변환
		
		//익명화
		/*
		 * stream.forEach(new Consumer<String>() {//<> 안에 타입 작성 !
		 * 
		 * @Override public void accept(String t) { System.out.println(t);
		 * 
		 * }
		 * 
		 * 
		 * });
		 */
		
		//람다함수화
		
		list.stream().forEach((t)-> System.out.println(t));//타입 안보는 거 !잊지말기 변수만 !
		
		
		
	}

}
