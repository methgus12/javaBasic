
public class CastingEx03 {
	
	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		
		//서로 다른 타입의 연산에서 큰타입에 맞추어 자동형변환됩니다.
		
		char cc = (char)(c+i);
		int ii = c+i;
		
		System.out.println(cc);
		//A가 65 C가 67이기 때문에 65 +2 67 즉 C로 출력됨
		
		System.out.println('A'+2);
		//67로 출력 
		
		
		int j=10;
		double d =3.14;
		
		double dd=j+d;
		System.out.println(dd);
		
		//int 형보다 작은 타입의 연산의 결과는 int가 됩니다.
		
		byte b1 =100;
		byte b2 = 12;
		
		byte b3 = (byte)(b1+b2) ;
		
		byte b4 =10;
		short s1 =100;
		
		
		short ss = (short)(b4 +s1);
		
		System.out.println(ss);
		
		
		
		
		
		
		
		
	}

}
