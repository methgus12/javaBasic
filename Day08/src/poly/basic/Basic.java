package poly.basic;

/*
 * 자바에서 하나의 클래스 파일 안에는 여러 클래스 선언이가능 
 * 단 , 파일명과 동일한 클래스가 존재해야하고 , 해당 클래스만 public 이어야 합니다.
 * 
 */
class A {}
class B extends A{}
class C extends A {}

class D extends B {}
class E extends C{}

public class Basic {
	
	/*
	 * 
	 * 
	 */
	
	A a= new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//기본타입 ..
	int x =10;
	double y = x;
	
	//참조타입 
	A a1 = b; //B->A 자동형변환
	A a2 = c;
	A a3 = new D();
	A a4 = new E();
	
	//C c1 = new D(); 불가 상속 관계가없다면 다형성 적용이 불가능
	//모든 클래스는 object 의 자식클래스가 되기 때문에 object 형에는 모든 타입을 저장 가능
	
	Object o =a;
	Object o2 ="문자열";
	
	
	
	

}
