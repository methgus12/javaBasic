package quiz05;

public class ArrayPrint {
	
	String printArray(String [] arr) {
		
		String result = "[";
		for (int i =0; i < arr.length; i++) {
			result += arr[i];//값을 하나 붙이기.
			if (i == arr.length-1) break; //탈출 
			
			result += ","; // , 붙이기

			
		}
		result += "]";
		
		return result;
		
	}
	
	String printArray(int [] arr) {
		String result = "[";
		for (int i =0; i < arr.length; i++) {
			result += arr[i];//값을 하나 붙이기.
			if (i == arr.length-1) break; //탈출 
			
			result += ","; // , 붙이기

			
		}
		result += "]";
		
		return result;
		
	}
	
	
	String printArray(double [] arr) {
		String result = "[";
		for (int i =0; i < arr.length; i++) {
			result += arr[i];//값을 하나 붙이기.
			if (i == arr.length-1) break; //탈출 
			
			result += ","; // , 붙이기

			
		}
		result += "]";
		
		return result;
		
	}
	
	void test (String ar) {
		System.out.println(ar);
		ar="가나다";
	}
	
	void test (String[] ar) {
		System.out.println(ar);
		ar[0] = "가나다";
		
		
	}
		
	/*
	ArrayPrint클래스는
	배열을 매개변수로 받아 배열의 내부를 [값, 값, 값...] 형태로 출력해주는 메서드를 가집니다.
	스트링 배열, int 배열, double 배열을 받아 출력하는 printArray() 를 오버로딩 하세요.
	
	Main에서 각각 배열들을 전달해 결과를 확인하세요
	*/
	//printArray 메서드를 각각 실행해보아라.
	
}
