
public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//단항연산자 중의 부호 연산자 
		
		int i = +3;
		int j= -i;
		
		System.out.println(j);

		
		//단항 연산자 중의 증감 연산자 ++,--
		
		int k =1;
		int h = k++; //후위 연산자 - 먼저 값을 대입 후 그다음 1증가
		
		
		System.out.println("k의 값:" + k);
		System.out.println("h의 값:" + h);
		
		int x =1;
		int y = ++x; //전위 연산자 - 먼저 값을 증가 후 그다음 저
		
		System.out.println("x의 값 :" + x);
		System.out.println("y의 값 :" + y);
		
		System.out.println("________________________");
		
		x=1;
		y=1;
		
		System.out.println(++x);
		
		x=10;
		y=10;
		
		int result = x++ + ++y + 10;
		
		System.out.println(result);
		
		System.out.println("----------------------");
		
		x=10;
		y=10;
		
		//후위 연산 이라 처음은 10 그다음은 증가된 11 
		//즉 10 + 11 + 10 = 31
		int result2 = x++ + x++ + 10;
		System.out.println(result2);
		//한 상에서 여러번 사용되는 경우는 값이 올라간 형태에서 연산작업이 이루어집니다.
		
		
		byte b = 10; //2진수로 바꾸면 0000 1010
		
		System.out.println(~b); //비트 값을 뒤짚는다 ,1111 0101
		
		System.out.println(~b + 1);
		
		byte b1 = (byte)(~b + 1);
		System.out.println(~b1 +1);
		
		System.out.println("----------------------");
		
		//논리 반전 연산자 !
		
		boolean bool1 = true;
		System.out.println(!bool1);
		
		// ! 는 반대의 의미 ! 즉 true 를 반대인 false로 변경
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
