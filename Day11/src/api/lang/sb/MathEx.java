package api.lang.sb;

public class MathEx {
	
	public static void main(String[] args) {
		
		//math 는 전부 static 메서드 -> 클래스.이름   빠르게 접근
		
		double d = Math.random();
		System.out.println(d);
		
		//올림
		double d2 = Math.ceil(1.1); 
		System.out.println(d2);
		
		//내림
		double d3 = Math.floor(1.1);
		System.out.println(d3);
		
		//반올림
		double d4=Math.round(1.1); 
		System.out.println(d4);
		
		//큰수 비교
		int max = Math.max(1, 3);
		System.out.println("큰수:" + max);
		
		
	}

}
