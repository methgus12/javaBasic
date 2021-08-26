
public class ObjectBasic02 {
	
	public static void main(String[] args) {
		
		//클래스를 이용하는 방법 !
		Calculator cal1 = new Calculator();
		
		System.out.println("1번 계산기로 계산 !!~~~");
		System.out.println(cal1.add(1));
		System.out.println(cal1.add(2));
		System.out.println(cal1.add(3));
		
		Calculator cal2= new Calculator();
		
		System.out.println("2번 계산기로 계산 !!~~~");
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(20));
		System.out.println(cal2.add(30));
		
		Calculator cal3= new Calculator();
		
		System.out.println("2번 계산기로 계산 !!~~~");
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
		System.out.println(cal2.add(300));
		
		//훨 씬 간결 !!!!
		
		
	
	}
}
