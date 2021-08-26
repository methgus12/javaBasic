package Hello;

public class CastingEx02 {

	public static void main(String[] args) {
		
		//크기가 큰 타입을 작은 타입에 저장할 때는 캐스팅을 사용해서 
		//명사적 형 변환 해야
		//자주나오니까 중요!!
		
	
		
		
		int i =65;
		char c=(char)i ;
		short s = (short)i;
		
		System.out.println(c);
		System.out.println(s);
		
		float f =3.14f;
		int j = (int)f;
		System.out.println(j);
		
		
		int a =1000;
		byte b = (byte)a;
		System.out.println(b);
		
		//왜 b가 -24로 나온것인가 ? => 10진수 1000은 이진수로 8자리만 남음
		//바이트기 때문 바이트에서 11101000은 -24로 계산됨
		//강제 타입 변환시 주의할 점은 값을 받아들일 수 없는 범위가 들어오면
		//잘려나간 쓰레기 값을 저장하게 됨 ! 
		
		//예외도 있음 !!  char 와 short 는 같은 값이지만, 바로 담을 수 없음
		//강제 캐스팅을 또 해야함 
		//char 값을 short 형 으로 변경할 때도 명시적으로 형변환 해야함
		
		
		
		char cc = 'A'; //문자형
		short ss = (short)cc ; //정수형
		
		System.out.println(ss); //즉 숫자로 나오는 이유
		
		short kk = 65; //정수형
		char pp =(char)kk; //문자형
		
		System.out.println(pp); //즉 문자로 나오는 이유
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
