
public class OperatorEX02 {
	
	public static void main(String[] args) {
		
		//2항 연산자 
		//산술연산자
		
		int i = 7/3 ; //2
		int j = 7 % 3; //1
		int k = 8 * 3; //24
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("------------------");
		
		//비교연산자
		
		System.out.println(i == j); //false
		System.out.println(i != j); //true
		System.out.println(i >= j); //true
		System.out.println(i < j); //false
		System.out.println(k != 21); //true
		System.out.println(k % 2 != 0); //false
		System.out.println(k%2 == 0); //ture
		
		//2로 나눴을때 0인지 아닌지의 여부는 짝수 홀수를 구분 할 수있는 중요한 단서가 될 수 있는 식 
		//어떤 값  %   2 == 0  t : 짝 f : 홀 
		
		System.out.println(k%6 == 0); //ture
		// 즉 6의 배수라고 유추 가능 !
		
		System.out.println("------------------");
		//비트연산자 & ,| , ^
		
		int a = 5; //0000 0101
		int b = 3;// 0000 0011
		
		System.out.println(a & b); //0000 0001 둘다 1이여야 1
		
		System.out.println(a | b); //0000 0111 둘중에하나라도 1이면 1
		
		System.out.println(a ^ b); //0000 0110 다르면 1 같으면 0
		
		
		//비트 쉬프트 >> , <<
		
		int h = 100;
		System.out.println(h >> 3);
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
