package Hello;

public class CastingEX01 {
	public static void main(String[] args) {
		
		
	
		byte b = 10; //작은 바이트에 큰 숄트입으로 자동 형변환 된것 
		short s = b; // byte -> short 	자동변
		int i = b; //byte -> int 자동변환
		
				
		
		System.out.println(s);
		System.out.println(i);
		
		char c = '가';
		
		int o=c;
		System.out.println(o);
		System.out.println("가의 유니코드 숫자값은 :"+o);
		
		int k = 1000; //int 가 자동으로 double 로
		double d=k;
		
		System.out.println(d);
		
		
		
		

		
		
	
		
		
	}

}
