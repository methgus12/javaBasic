package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEX {
	
	public static void main(String[] args) {
		
		//set 계열은 순서 X , 중복 X => list와 반대 
		
		//방법 1: HashSet <String> set =new HashSet<>();
		
		//방법 2 : set이라는 인터페이스에 담기도 가능
		Set<String> set = new HashSet<>();	
		
		set.add("Java");
		set.add("jsp");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		//set에 저장된 크기 size()
		
		System.out.println("크기>" + set.size());
		
		System.out.println(set.toString());
		
		//순서도다르고 중복된 값은 들어가지않음
		
		//set에 들어있는 객체를 검색하려면 , 반복자를 통해서 하나씩 순서대로 확인합니다.
		
		Iterator <String> iter =set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//set에 검색 (포함여부) - > contains()
		
		if(set.contains("Java")) {
			System.out.println("java 가 포함되어있음");
		}
		
		//set에 삭제 remove (값)
		set.remove("ORACLE");
		System.out.println(set.toString());
		
		
		
		
		
	}

}
