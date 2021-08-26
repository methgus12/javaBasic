package quiz26;

public class MainClass {

	
	public static void main(String[] args) {
		
		VoteThread v = new VoteThread();
		VoteThread v2 = new VoteThread();
		VoteThread v3 = new VoteThread();
		
		Thread t =  new Thread(v, "Location1");
		Thread t2 = new Thread(v2,"Location2");
		Thread t3 = new Thread(v3, "Location3");

		t.start();
		t2.start();
		t3.start();

		
		
		
	}

}
