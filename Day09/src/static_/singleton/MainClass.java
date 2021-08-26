package static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		
		//싱글톤의 호출
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);
		s1.setS("이순신"); //값의 변경
		
		
	}
}
