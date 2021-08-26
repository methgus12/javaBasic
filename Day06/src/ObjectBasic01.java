
public class ObjectBasic01 {
	public static void main(String[] args) {
		
		//기존에 사용하던 방법 보다시피 배우 복잡 -> 엄청 많은 계산을 할 경우.
		
		//1번 계산
		System.out.println("1번 계산기로 계산 ");
		System.out.println(add(1));
		System.out.println(add(2));
		System.out.println(add(3));
		
		//2번계산
		System.out.println("2번 계산기로 계산 ");
		System.out.println(add2(10));
		System.out.println(add2(20));
		System.out.println(add2(30));
		
		//3번계산
		System.out.println("3번 계산기로 계산 ");
		System.out.println(add3(100));
		System.out.println(add3(200));
		System.out.println(add3(300));
				
	
		
	}
	//1번 계산기
	static int result = 0;
	
	static int add(int a) {
		result += a;

		return result;
	}
	//2번 계산기
	static int result2 =0;
	
	static int add2(int a) {
		
		result2 += a;
		return result2;
	}
	//3번 계산기
	
	static int result3=0;
	
	static int add3(int a) {
		
		result3 += a;
		return result3;
	}
}
