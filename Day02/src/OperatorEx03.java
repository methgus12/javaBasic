
public class OperatorEx03 {
	
	public static void main(String[] args) {
		
		int  x = 10 , y =20;
		
		//if 문장  뒤에 소괄호가 true 면 if 문 실행 아니면 else 문 실행
		
		
		if(x==10 && ++y == 21) {
			System.out.println("참입니다");
				
		} else {
			System.out.println("거짓입니다");
			
		}
		
		
		System.out.println("x는 :" + x + ",y 는 :" +y);
		
		if (x==10 || ++y ==21) {
			System.out.println("참입니다");
			
		}else {
			System.out.println("거짓입니다");
			
			
		}
		System.out.println("x는 :" + x + ",y 는 :" +y);
		
		int a =5;
		
		a += 1;
		System.out.println(a);
		
		int b =6;
		b /= 2;
		System.out.println(b);
		
	}

}
//두개 짜리 && 와 ||는 만족할 수없는 조건일 때 뒤를 실행하지 않음 !


