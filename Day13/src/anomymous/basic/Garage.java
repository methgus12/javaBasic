package anomymous.basic;

interface Car {//인터페이스
	void run();
	
}
/*class Tico implements Car{

	@Override
	public void run() {
		System.out.println("~~~~~~~");
		
	}
	
}*/

public class Garage {
	
	
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("사용할때마다 내용이 바뀐다면 익명클래스로 생성이 가능.");
			
		}
	};
}


