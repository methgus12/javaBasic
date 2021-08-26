package basic;

import java.util.Arrays;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello" , "아이시떼루", "*&%^%"};
		
		
		//랜덤값을 이용해서 0-3 까지의 랜덤수를 발생시켜주세요
		//나오는 랜덤수를 배열의 index에 적용하여 , 선택된 단어가 어느나라인지 출력해주세요
		
		
		int ran = (int)(Math.random() * arr.length);
		System.out.println("선택된 단어:" + arr[ran] );
		
		switch (arr[ran]) {
		case "안녕" :
			System.out.println("한국어 입니다.");
			break;
			
		case "hello":
			System.out.println("영어 입니다.");
			break;
			
		case "아이시떼루":
			System.out.println("일본어 입니다.");
		
			break;
			
		case "*&%^%":
			System.out.println("외계어 입니다.");
			break;

		default:
			System.out.println("이상한언 입니다.");
			break;
		}

		
		}
		
		
		
		
		
	}


