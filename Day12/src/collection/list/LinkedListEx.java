package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx {
	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<>();
		
		
		//Queue<String> list = new LinkedList<>();
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		
		System.out.println(list.toString());
		
		//값 얻기
		String name = list.get(0);
		System.out.println("0번째 인덱스 값> " + name);
		
		//처음에 추가 
		list.addFirst("박찬호");
		System.out.println(list.toString());
		
		//마지막에 추가
		list.addLast("심사임당");
		System.out.println(list.toString());
		
		//전체삭제
		list.clear();
		
		
		System.out.println("============================");
		//링크리스트는 stack 처럼 동작 - LIFO(last in first out)
		//push ,pop ,peek
		
		list.push("강감찬");//첫번째로 들어감 , 가장 나오기 어려
		list.push("이순신");//두번
		list.push("탁소현");//세번째로 들어감 가장 먼저 나옴
		//밀린다고 생각
		
		list.pop(); //push 와 pop은 함께  가장 나중에 들어간게 빠짐
		list.pop();//값을 꺼내면서삭제를 해줌
		
		System.out.println(list.peek()); //값만읽기

		System.out.println(list.toString());
		System.out.println("============================");
		//링크드 리스트는 queue 처럼 동작 - FIFO(first in first out)
		//offer , poll, peek
		
		list.clear();
		
		//가장 처음 들어간게 가장 앞자리
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());
		
		//기장 먼저 들어간게 가장 먼저 나옴
		list.poll();
		System.out.println(list.toString());
		
		System.out.println(list.peek());
		System.out.println(list.toString()); //값만 읽어내기
		
		
		
		
		
		
		
	}

}
