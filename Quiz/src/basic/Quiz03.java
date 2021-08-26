package basic;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		//2021.2.17일 수요일 숙제
		// 조건 , if 와 else 사용금지
		
		//문제1.
		//-10 ~ 10 까지의 랜덤수를 만들고
		//이 랜덤한 값이 0인지, 양수, 음수인지를 판단
		
		int r = (int)(Math.random() * 10);
		
		System.out.println( (r == 0) ? "0이네" : r >0 ?   "양수" : "음수");
		System.out.println("값은:" + r);
		
		
		
		
		
		
		
		
	}

}
