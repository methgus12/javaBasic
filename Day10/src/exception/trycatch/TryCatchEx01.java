package exception.trycatch;

public class TryCatchEx01 {
	public static void main(String[] args) {
		
		int i =10;
		int j = 0;
		
		System.out.println(i +j);
		
		
		//에러구문을 try안에다가 넣어주세요.
		
		try {
			System.out.println(i/j); //0분의 10은 없으므로 에러가 남 .
			
			System.out.println("이문장은 실행되나요?"); //이문장은 실행안됨
			
			//catch 뒤에는 해당 예외를 처리할 수 있는 예외 종류가 들어갑니다.
			//Exception은 모든 예외를 처리할수있습니다.
			
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
			
			
		}
		
		
		
		System.out.println(i * j);
	}
}
