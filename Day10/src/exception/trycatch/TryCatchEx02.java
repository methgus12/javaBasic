package exception.trycatch;

public class TryCatchEx02 {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		int i =0;
	
		while (i < 6) {//일부러 에러만들기  원래는 i < arr.length
			
		try {
			
			System.out.println(arr[i]);
			
		} catch (Exception e) {
			
			
			System.out.println("배열의 참조범위를 벗어났습니다.");
			
		}finally {
			System.out.println("이문장은 예외와상관없이 항상 출력");
		}
		i++;
		}
	}

}
