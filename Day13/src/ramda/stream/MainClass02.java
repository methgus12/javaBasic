package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		/*
		 * 반복자 스트림은 
		 *중간처리 메서드 - 처리한 결과 stream형태로 반환
		 *최종처리 메서드 - 처리결과를 정수나 , 실수 등으로 반환
		 *
		 *람다를 적용하는 함수적 인터페이스의 종류
		 *Consumer 은 매개변수를 받고 , 반환유형은 없는 유형
		 *
		 *Predicate - 매개변수를 받고 , 반환은 boolean
		 *Function - 매개변수를 받고 , 반환은 임의로 결정
		 *정수스트림 or 실수스트림 -> 통계관련 함수들을 사용  
		 *mapToInt , mapToDouble ...
		 */
		List <Integer> list = new ArrayList<> () ;
		
		for(int i =1; i <= 10; i++) {
			Random ran = new Random();
			//int num = ran.nextInt(100) + 1;
			list.add(new Random().nextInt(100) + 1);
			
		}
		
		System.out.println(list.toString());
		//distinct : 중복을 제거해주는 중간처리메서드		
		list.stream().distinct().forEach((a)->System.out.print(a+ " "));
		
		System.out.println("\n----------------------------------");
		//sorted 정렬
		list.stream().distinct().sorted().forEach((a)-> System.out.print(a+" "));
		
		System.out.println("\n----------------------------------");
		//filter -걸러내는 기
		list.stream().distinct()
		.filter((a)-> a% 2==0) //true 인 경우에만 반
		.forEach((a)-> System.out.print(a+" "));
		
		System.out.println("\n----------------------------------");
		//map - 람다에 정의된 새로운 Stream 타입으로 반환  
		
		list.stream()
		.distinct() // 중복제거
		.sorted()   //오름차순 정렬
		.filter((a)-> a%2 ==0) // 짝수만 추출
		.map((a)-> a % 2 ==0 ? "짝" : "홀" ) //짝홀  여부 판단 
		.forEach((a)-> System.out.print(a + " "));
		
		System.out.println("\n----------------------------------");
		list.stream()
		.map((a)-> a >=50 ? a: 0)//50이상이면본인값 50보다 작으면 0으로 표시 : 새로운 값으로 만들어
		.forEach((a)-> System.out.print(a + " "));
		
		System.out.println("\n----------------------------------");
		//최종처리 메서드 collect
		List<Integer> newList = list.stream()
		.filter((a)-> a >= 50 && a % 3 == 0)
		.collect(Collectors.toList()); //새로운 list
		
		System.out.println("\n----------------------------------");
		
		//mapToInt , mapToDouble .... 등등
		long r1 = list.stream().mapToInt((a)-> a).count();
		System.out.println("개수>" + r1);
		
		int r2 = list.stream().mapToInt((a)-> a).sum();
		System.out.println("요소의 합>" +r2);
		
		double r4=list.stream().mapToInt((a)-> a).average().getAsDouble();
		System.out.println("평균>" + r4 );
		
		OptionalInt r3 = list.stream().mapToInt((a)-> a).max();
		System.out.println("제일 큰 값>" + r3.getAsInt()); //getAsInt 이용하여 정수형으로 
		
		
		
		
		
		
			
	}
	
	
}
