package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEX {
	public static void main(String[] args) {
		
		//Map -(키, 값)을 쌍으로 저장하는 구조 , 키값은 고유하다
		
		//멀티제너릭 
		//HashMap<K, V> map = new HashMap<>();
		
		Map<Integer, String> map = new HashMap<>();
		
		
		//map에 추가하는 경우 put(키, 값)
		
		map.put(1, "홍길동"); //한 쌍 : entry
		map.put(2, "이순신");
		map.put(3,"홍길자");
		map.put(4,"신사임당");
		
		System.out.println("맵의크기> " + map.size());
		System.out.println(map.toString());
		
		//맵에 같은 key를 저장했을 경우에 , key에 해당하는 value값을 수정합니다.
		//4번자리가 바뀜 
		map.put(4, "김유신");
		System.out.println(map.toString());
		
		//map에 저장된 value 얻기 get(키0
		
		String value = map.get(1);
		System.out.println("1번키에 해당하는 값 > " + value);//홍길동
		
		System.out.println("===============================");
		
		//맵에 들어있는 값을 순차적으로 확인하고싶다면 
		//keySet, enterySet을 이용해서 set 형태로 바꾸어 사용
		
		Set<Integer> keySet= map.keySet(); //key 만 뽑아서 Set으로 변경
		
		System.out.println(keySet.toString()); 
		
		//향상된 for문 사용하기
		for ( Integer i : keySet) {
			System.out.println(map.get(i)); //맵에들어가있는 값을 순서대로  
			
			
		}
		
		System.out.println("===============================");
		
		//이터레이터 사용
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) { //뒤에 아무것도 없을 때 까지
			System.out.println(map.get(iter.next()));
			
		}
		
		System.out.println("===============================");
		
		Set< Entry <Integer , String>> entSet = map.entrySet();
		
		for(Entry<Integer, String> e : entSet) {
			//Entry 안에는 getkey, getvalue 를 이용하여 
			//키, 값을 각각 얻을 수 있습니다.
			System.out.println(e.getKey() + ":" + e.getValue());
			
		}
		System.out.println("===============================");
		
		//map에 있는 key 여부 확인  containsKey (키)
		
		if (map.containsKey(3)) {//key가 있다면 true , 없다면 false
			System.out.println("3번키는 존재");
		}
		
		
		System.out.println("===============================");
		//map에 삭제 remove(키)
		
		map.remove(4);
		System.out.println(map.toString()); //삭제
		
		
	}

}
