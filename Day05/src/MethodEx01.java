
public class MethodEx01 {
	
	public static void main(String[] args) {
		System.out.println("1~10까지의 합 :" +calSum());	//호출은 변수명만 기억! 출력문 안에
		
		int result = calSum(); 
		System.out.println("1~10까지의 합 :" +result);
		
		String result2 = strPlus();
		System.out.println(result2);
		
		String result3 = randomStr();
		System.out.println(result3);
	}

		/*
		 * 1.매서드(함수)는 매서드 내부에 선언할 수 없습니다.
		 * 2.매서드는 만드는 과정 과 사용하는 과정이 (호출)이 있습니다. 
		 * 3.매소드는 호출했을때 실행에 결과를 매서드호출문으로 돌려줍니다.
		 */
	
	//end main (매서드는 중첩될 수 없어서 main 밖에다 만들어야함

	//매서드모습]
	//데이터 타입  변수이름  () {} : ()안의 매개변수는 없으면 비워놓으면 됨
	static int calSum () {

		int sum =0;
		for ( int i =1; i <= 10 ; i++) {
			sum += i ;
			}
		return sum; 
	}

	static String strPlus () {
		
		String str = "";
		for (char c= 'A' ; c<= 'Z' ; c++) {
			str += c;
		}
		
		return str;
		
	}

	static String randomStr() {
		
		double d = Math.random();

		String s = "";
				
		if(d <= 0.3) {
			//s= "가위";
			return "가위";
			
		} else if (d <= 0.6) {
			//s= "바위";
			return "바위";
		} else {
			//s= "보";
			return "보";
		}
	
		
		//return s;
		
	}



}
