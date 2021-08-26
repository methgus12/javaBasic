package collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEX {
	
	public static void main(String[] args) {
		
	/*
	 * 리스트를 매개변수나 , 반환타입으로 사용할 때 쓸 수 있는 문법
	 * List<?> - > 무엇이든 다 들어갈 수 있다 .
	 * List<? extends String> 타입은 변경 가능 ! string을 포함한 자식 클래스는 전달 가능 
	 * List<? super Integer>-> Integer의 형태를 가질 수 있다면 전달가능 
	 */
		
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		//test01 은 다 가능 !
		test01(list);
		test01(list2);
		test01(list3);
		
		//test02는 string만 가능!
		test02(list);
		//test02(list2);불가
		//test02(list3);불가
		
		//test03
		//test03(list); 불가
		test03(list2);
		test03(list3);

	
	}
	public static void test01(List<?> list) { //뭐든 다 전달될 수 있다.
		
	}
	
	public static void test02(List<? extends String > list) { 
		//string 만 가능 . 스트링의 자식이라면 가능 

	}
	
	public static void test03(List<? super Integer >list) { //Integer의 형태를가질수있으면 가능 
		
		
	}
	//리스트를 전달받는 메서드
	/*
	public static void add (List<String> list) {
		
	}
	
	//리스트를 반환받는 메서드 
	
	public static List<String> add2() {
		return null;
		
	}
	*/
}

