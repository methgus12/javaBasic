package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayListEx {
	public static void main(String[] args) {
		
		//List-순서 (index), 중복을 허용합니다
		
		//ArrayList 생성
		//ArrayList<String> list = new ArrayList<>(); or 
		List<String> list = new ArrayList<>();
		
		//list에 추가 add()
		
		list.add("JAVA");
		list.add("JSP");
		list.add("DB");
		list.add("SPRING");
		list.add("JAVA");
		
		
		//list의 크기 size()
		System.out.println("리스트의 크기" + list.size());
		
		//list에 저장된 값을 문자열로 확인 toString()
		
		System.out.println(list.toString());
		
		//list중간에 추가 add (인덱스 , 값)
		list.add(3, "ORACLE");
		System.out.println(list.toString());
		
		//list의 수정 set (인덱스 , 값)
		list.set(3, "MYSQL");
		
		//list의 값 얻기 get(인덱스)
		
		String value =	list.get(4);
		System.out.println("4번째 인덱스의값 > " + value);
		
		//list의 값의 포함여부 contains()
		
		if(list.contains("JAVA")) { //하나라도 포함되어있으면 true 아니면 false
			System.out.println("값이 포함되어있음"); //true

		}
		
		//list의 삭제 remove(값) or remove(인덱스)
		
		list.remove("JSP");
		System.out.println(list.toString());
		
		//list의 전체삭제 clear() 
		
		list.clear();
		System.out.println("전체삭제>" +list.toString());
		
		//addAll - 컬렉션을 통제로 마지막에 추가해주는 기능 
		List<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add("이순신");
		
		list.addAll(list2);
		System.out.println(list.toString());
		
		//배열을 리스트로 바꾸는 방법
		String [] arr = {"박찬호" , "이순신"};
		List<String> list3=	Arrays.asList(arr);
		
		
	}

}
