package anomymous.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();
		
		Car car = new Car() {
			
			@Override
			public void run() {
				
			}
		};
		
		
	}

}
