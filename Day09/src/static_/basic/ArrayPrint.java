package static_.basic;


public class ArrayPrint {
	
	//Arrays.tostring() 처럼 사용될 수 있도록 각각 메서드를 처리.
	
	
	private ArrayPrint() {
		//외부에서 객체 생성을 할 수 없도록 처리.
	}
	
	public static String printArray(String [] arr) {
		
		String result = "[";
		for (int i =0; i < arr.length; i++) {
			result += arr[i];//값을 하나 붙이기.
			if (i == arr.length-1) break; //탈출 
			result += ","; // , 붙이기

			
		}
		result += "]";
		
		return result;
		
	}
	
	public static  String printArray(int [] arr) {
		String result = "[";
		for (int i =0; i < arr.length; i++) {
			result += arr[i];//값을 하나 붙이기.
			if (i == arr.length-1) break; //탈출 
			
			result += ","; // , 붙이기

			
		}
		result += "]";
		
		return result;
		
	}
	
	
	public static String printArray(double [] arr) {
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
	
	
}
