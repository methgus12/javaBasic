package quiz17;

import java.util.Arrays;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 프로그래머스 문제
		 * participant 는 마라톤 참가자 명단입니다.
		 * conpletion은 마라톤 완주자 명단입니다.
		 * 
		 * conpletion은 pariticipant 의 길이보다 -1이 작습니다. 참가자는 동일인물이 있을 수 잇습니다.
		 * 어떤 배열이 주어지던 간에 마라톤을 완주하지못한 이름을 찾아내는 메서드를  작성하세요

		 */
		
		String [] p = {"심여명" , "김민정" , "박민지" , "탁소현" , "이혜원"};
		String [] c = {"김민정" , "박민지" , "이혜원" , "심여명"};
		
		System.out.println("완주하지못한사람>" +solution(p,c));
		
		
	}
	
	public static String solution(String [] p , String [] c) {
		
		Arrays.sort(p);
		Arrays.sort(c);
		
		for (int i =0; i < c.length ; i++) {
			if (p[i].equals(c[i])) { //같으면
				
				
			} else return p[i];	//같지않으면
		
			
		}return p[p.length-1];
		}
		
		

}
