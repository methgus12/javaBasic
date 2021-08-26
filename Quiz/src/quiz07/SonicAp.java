package quiz07;

public class SonicAp extends Airplane{

	/*
	 *부모클래스는 절대 수정하지 않습니다.(부모 Airplane)
	 *
	 *1.flyMode int형 멤버변수를 선언하세요
	 *2.생성자는 name을 저장할 수 있도록 처리하세요
	 *3.fly() 매서드를 오버라이딩 합니다.
	 *   기능 - flyMode 가 1이라면 "고속모드로 비행합니다"
	 *         flyMode 가 0이라면 super를 통해서 부모님의매서드를 호출시키세요 
	 */
	

	
	SonicAp(String name) {
		super(name);
	}
	
	int flyMode;
	
	void fly() { //앞에 아무것도 붙이지 않은 형태 , default형태 가 자동으로들어간것 !
		if(this.flyMode ==1) {
			System.out.println("고속모드로 비행합니다.");	
		} else  {
			super.fly();
		}
	
	

}
}