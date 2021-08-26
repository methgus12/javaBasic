

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		/*
		 * 반환유형 (return type)
		 * 1.반환유형은 매서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2.반환유형이 있는 매서드는 호출구문이 하나의 값이 되기 때문에 다른 매서드의매개값으로도 사용됩니다.
		 * ex)print(매서드 호출);
		 * 
		 * 3.반환이 없는 매서드는 void 라고 적습니다 . 
		 * 4.모든 메서드는 return키워드르 만나면 강제종료됩니다.
		 * 그래서 모든 void형 메서드에도 return 키워드가 사용 가능하고 , return 아래에는 코드작성이 불가합니다.
		 * 
		 */
		
		int result =add(add(1,2),5); //이런모양도 가능함 즉 중첩이가능함 . 반환이 있는 매서드에서만 가능 
		System.out.println("결과:" + result);
		
		//void형 메서드는 return 값이 없어서 호출만 가능합니다. 
		sub(1,2); 
		//즉 출력구문 작성불가능 , 호출한 결과를 돌려받는것도 불가능 
		multi();
		
		noReturn ("똑똑이");
	}

	static int add (int a, int b ) {
		
		return a+b;
	}

	//반환이 없는 메서드 
	
	static void sub (int a , int b) {
		
		System.out.println("두수의 차:" + (a-b));
		
	}//반환과 매개변수가 없는 메서드 
	static void multi() {

		System.out.println("안녕하세요?");
		
	}

	
	static void noReturn (String name) {
		if (name.equals("똑똑이")) {//문자열비교
			System.out.println("참잘했어요 !");
			return; //메서드의 종료를 의미 
			

		}
		System.out.println("틀렸습니다. 똑똑이를 입력하세요");
	}
}
