package exception.throws_;

public class ThrowsEx02 {
	//생성
	
	public void aaa(int num) throws Exception {
		System.out.println("aaa호출");
		
		System.out.println(10/num);
		System.out.println("aaa종료");
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb호출");
		
			aaa(0);
		
		
		System.out.println("bbb종료");
	}
	
	//생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자호출");
		bbb();
		System.out.println("생성자종료");
	}
	
}
