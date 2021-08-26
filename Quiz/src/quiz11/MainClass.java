package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		// main 에서는 buy 메서드만호출하면됩니다. 
		MyCart my = new MyCart(1000);
		
		my.buy(new Tv());
		my.buy(new Tv());
		my.buy(new Computer());
		my.buy(new Radio());
	
		
	}

}
