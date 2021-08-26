package generic.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic<Integer , String> basic = new Basic<>();
		
		basic.set(1, "홍길동");
		System.out.println(basic.get(1));
		
		String name = basic.get(1);
		System.out.println(basic.toString());
		
	}

}
