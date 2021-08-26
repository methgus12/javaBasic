
public class MethodEx02 {
	public static void main(String[] args) {
		
		/*
		 *매개변수 (parameter)
		 *1.매개변수는 매서드 호출시 실행에 필요한 값을 전달하는 매개체입니다.
		 *2.매개변수를 몇개 받을지는 매서드를 선언할 때 결정합니다 . 
		 *3.매개변수를 여러개 받을땐 ,를 이용하여 연결하면 됨
		 *4.만약 매개변수가 없다면 ()를 비워두면됩니다.
		 *
		 */
		
		//매개변수가 있으면 그대로 적는 것이 아님 
		//전달할 값을 적으면 됨 . 
		
		System.out.println("1~10까지의 합:" + calSum(10));
		System.out.println("1~100까지의 합:" + calSum(100));
		System.out.println("1~50까지의 합:" + calSum (50));
		
		
		int result= calSum2(10,20);
		System.out.println("10~20까지의 합" + result);
		
		String result2= calSum3(1,3, "가");
		System.out.println(result2);
		
		String result3= calSum3(3,1, "가");
		System.out.println(result3);
	
	}
	
	static int calSum (int end) { //()안에 들어가는것도 자유임 , 변수 
		
		int sum = 0;
		for (int i = 1; i <= end ; i++) {
			sum +=i;
			
		}
		
		
		return sum; 
	}

	static int calSum2(int start , int end) { //,를 이용하여 여러개도 가능 
		
		int sum = 0;
		for (int i = start ; i <= end ; i++) {
			
			sum += i;
		}
		
		
		return sum;
		}
	
	
	
	
	//정수 2개 , 문자열 1개를 매개변수로 전달 받는 calSum3()
	//기능 - 두 정수사이의 차 만큼 문자열을 붙인결과 반환
	//	ex) 입력값 (1,3,"가") - 반환 : 가가
	
	static String calSum3(int a , int b, String s) {
		
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max =a ;
			min =b;

		} else {
			max =b;
			min =a;
			}
		
		String str = "";
		for (int i =min ; i <= max ; i++) {
			str +=s;
	
		}

		return str;
		
	}
		
		
	
}

