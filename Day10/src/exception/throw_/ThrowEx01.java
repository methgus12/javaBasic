package exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		/*
		 * 예외만들기- throw
		 * 메서드, 생성자에서 실행도중 throw 키워드를 만나면
		 * 즉시 예외를 만들고 예외처리구문을 찾습니다.
		 * 
		 * 예외가 만들어지면 , 코드가 즉시 중단되고 가까이에있는
		 * 예외처리 구문으로 이동하게 됩니다.
		 * 
		 */
		
		try {
			System.out.println("결과:" + calSum(10));
			System.out.println("결과:" + calSum(-4));
			
		} catch (Exception e) {
			//System.out.println("반드시 양수로 전달해야 합니다.");
			//System.out.println(e.getMessage());
			//예외발생시에 전달한 예외메세지를 얻어오는 기능
			
			
			e.printStackTrace();//예외가 어디서 , 어떤 예외가 만들어진것을 단순히 알려주는 기능
			//매우중요
		}

		
	}
	//매개값을 받아 합계를 리턴하는 메서드
	
	
	public static int calSum (int a) throws Exception {
		
		if(a<0) {
			//예외생성
			throw new Exception("반드시 양수로 전달해야합니다.");
			
		}
		int sum =0;
		for (int i =1; i <= a; i++) {
			sum +=i;
		}
	
		return sum ;
	}
	
	
}
