package abs.good;

import abs.bad.parentStore;

public abstract class ParentStore {
	
	/*
	 *1.메서드에 abstract 키워드를 붙이면 추상메서드가 됩니다. 
	 *이 메서드는 상속을 통해서 반드시 오버라이딩이 되야합니다 .'
	 *
	 *2.추상메서드는 {} 가 없는 메서드의 선언입니다.
	 *3.추상메서드는 일반 클래스에 선언 할 수는 없습니다. 
	 *즉 추상메서드를 사용하려면 클래스도 추상클래스가 되어야 합니다. 
	 *
	 *4.추상 클래스는 일반메서드 , 일반 멤버변수 , 생성자 모두 사용이 가능하다.
	 *
	 */
	
	//멤버변수
	private String storeName = "호식이 세마리 치킨";
	
	//생성자
	public ParentStore() {
		System.out.println("추상클래스의 생성자 호출");
	}
	public String getStoreName() {
		return storeName;
		
	}
	
	//메서드    abstract 는 final 과 반대 
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	
	
	//final 오버라이딩불가 abstract 와 반대의 개념
	public final void mango() {//오버라이딩 금지 
		System.out.println("망고는 전 지점 1000원입니다.");
	}
	

}
