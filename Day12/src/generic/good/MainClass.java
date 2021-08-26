package generic.good;

public class MainClass {
	
	public static  void main(String[] args) {
		/*
		 * 제네릭을 사용하면 , 객체를 생성할 때 사용할 타입을 지정할 수 있고,
		 * 다양한 값을 저장하도록 생성해서 사용이 가능합니다.
		 */
		
		
		
		ABC<String> abc = new ABC<String>();
		
		abc.setT("안뇽");//저장
		System.out.println(abc.getT());//사용
		//or sting name = abc.getT();
		
		ABC<DEF> abc2 = new ABC<DEF>();//뒤에 타입은 생략가능 ! 
		//이런식으로 ABC<DEF> abc2 = new ABC<>();
		
		abc2.setT(new DEF());//저장
		DEF def = abc2.getT();//사용
		
		ABC<Integer> abc3 = new ABC<>(); //기본형 저장 불가 , int 같은것 불가
		
		
		
		
		
	}
}
