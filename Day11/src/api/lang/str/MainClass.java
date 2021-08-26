package api.lang.str;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		char [] arr = {'안','녕','하','세','요','~'};
		
		//String str1 = new String;
		/*String str1= new String(arr);
		String str2 = new String("안녕하세요~");
		System.out.println(str1);
		System.out.println(str2);
		*/
		//length - 문자열의 길이
		String str = "안녕하세요";
		System.out.println("문자열길이>" + str.length());
		
		//charAt -문자열을 인덱스 번호 1글자 자르기
		char c= str.charAt(2);
		System.out.println(c);
		
		//indexof - 문자열을 찾아서 인덱스 반환
		int i1=str.indexOf("안녕");
		System.out.println("안녕이있는 위치>" + i1);
	
		int i2 = str.lastIndexOf("안녕");
		System.out.println("안녕이 있는 위치>" + i2);
		
		//replace - 특정 문자 변경 **중요**
		
		String str2 = "자바는 재미있습니까? 자바는 커피집 이름인데 말이죠 ";
		
		String result2= str2.replace("자바", "java");
		
		System.out.println(result2);
		System.out.println(str2);
		//기존의 str2는 바뀌지 않음을 주의!
		
		//replace를 이용한 공백제거
		str2= str2.replace(" ", "");
		
		System.out.println(str2);
		
		//substring - 문자열 자르기 (중요)
		String str3 = "123123-4567890";
		String result3 =str3.substring(7); //매개 값을 1개주면 앞 문자열을절삭
		System.out.println(result3);
		
		String result4 = str3.substring(7, 14); //매개 값을 2개 주면 첫번째 매개값 이상 ~ 두번
		System.out.println(result4);
		
		//toUpperCase, toLowerCase -대소문자로 변경
		String str4 = "hello world";
		String result5 = str4.toUpperCase();
		
		//trim- 문자열 앞뒤의 공백만 제거 
		
		String str5 = "     홍길 동    ";
		String result6 = str5.trim();
		System.out.println(result6);
		
		//valueOf - 숫자를 -> 문자로 변경 
		
		int a=1;
		int b=2;
		System.out.println(String.valueOf(a) + String.valueOf(b)); 
		
		//split - 문자열 자르기(특정문자를 기준) (중요)
		String str6 = "010-1234-5678";
		String [] arr1 =str6.split("-");
		
		System.out.println(Arrays.toString(arr1));
		
		String [] arr2 = str6.split("-",2); //잘린 배열의 최대크기 2 
		System.out.println(Arrays.toString(arr2));

		//contains - 특정문자가 포함되어있다면 true
		
		String str7= "우리집 강아지 이름은 ? 볼트입니다.";
		if(str7.contains("강아지")) {
			System.out.println("강아지가 포함되어있습니다.");
			
		}
		
	}

}
