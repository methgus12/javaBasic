package quiz25;

public class MainClass {
	public static void main(String[] args) {
		
		Video v = new Video();
		Download d = new Download();
		
		Thread v1= new Thread(v);
		Thread d1= new Thread(d);
		
		v1.start();
		d1.start();

		
	}
	
	

}
