package quiz16;

public class StrQuiz04 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(method("다시다"));
		System.out.println(method("로꾸"));
		System.out.println(method02("로꾸꺼"));
		System.out.println(method02("다시다"));
		
	}
	/*
	 *Palindrome함수 는 매개변수로 스트링 값을 받아서 회문여부를 검사하는 메서드 입니다.
	 *회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나문장
	 *
	 *예) 다시다 , 다시 합창합시다.
	 * 
	 * 문장은 공백을 포함해서 매개값을 받아도 됩니다.
	 * 회문이라면 "회문" 아니라면 "회문이 아닙니다" 를 리턴합니다.
	 * 
	 */
	
	public static String method(String a) {
		
		a= a.replace(" " , "");
	
		for (int i =0; i <  a.length()/2; i++) {
			System.out.println(i);
			
			if(a.charAt(i) != a.charAt(a.length()-1 - i)) {
				return "회문이아닙니다";
			} 
			}

		return "회문입니다";
		
		
	}
	
	public static String method02(String b) {
		
		b= b.replace(" ","");
		StringBuffer sb = new StringBuffer(b);
		
		sb.reverse();
		String s = sb.toString();
		return s.equals(b) ? "회문" : "회문이 아닙니다";

		//더 줄이기 ->위의 세줄을 한줄로 ~~~~
		//return sb.reverse().tostring().equals(b)? "회문" : "회문이 아닙니다."
		
	}
		//외부라이브러리를 추가하는 방법
	//프로젝트에 scr 폴더 생성 -> jar 파일추가 -> 우클릭 빌드 패스 -> library 탭 -> external jar 로 파일 추가
	
	

}


