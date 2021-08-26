package basic;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2);//5
		
		System.out.println( !('A' <= c && c <='Z') ); //false
		//&& 처리후 !가 있으니 나온답의 반대 그래서 false !!이해완료
		
		System.out.println('C'-c); //2
		System.out.println(c+1); //66
		//char 과 int 의 계산으로 int로 출력되는 것 !!
		
		//아래는 그대로 char
		
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c);  //C
		
		
		

		
		
	}
}
