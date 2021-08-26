import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		//메서드의 매개변수, 반환유형으로 배열을 전달하는 방법.
		//int [] a; 배열선언  
		
		int [] arr = {1,2,3};
		String [] arr2 = {"홍길동" , "이순신"};
		method1(arr, arr2);
		
		String [] arr3 = method2();
		System.out.println(Arrays.toString(arr3));
		
	}
	
	//매개변수로 배열을 전달 받는 매서드
	
	static void method1(int[] a , String [] b) {
		System.out.println(Arrays.toString(a));
	}

	
	//스트링 배열을 반환하는 매서드
	static String[] method2() {
		String [] arr = {"월" , "화" , "수"};
		
		return arr;

}
	}
