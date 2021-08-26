import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		//1.배열의 선언
		
		//타입 뒤에 []를 붙여야 올바른 방법 !
		
		int[] arr ; 
		
		//2.배열의 생성 - 생성시의 크기를 지정
		//암기해야함 !
		
		arr = new int [5]; //5는 크기 즉 칸 5개가 만들어진것
		
		System.out.println(arr);
		
		//3. 배열의 초기화 ( 값을 지정하는 과정 ) : index 개념이 나옴
		arr [0] = 10; // [] 안의 수는 0번째 즉 첫번째 순서에 10을넌다는것
		arr [1] =20;
		arr [2] =30;
		arr [3] =40;
		arr [4]= 50;
		
		//4.배열의 사용확인
		System.out.println("배열의 3번째 값:" + arr[2]); //2배열의 3번째 
		
		arr[2] = 1000;
		System.out.println("배열의 3번째 값:" + arr[2]);
		
		//5. 배열의 저장된 값을 한눈에 확인하는 명령
		System.out.println(Arrays.toString(arr));
		//외우자!
		
		//6.배열의 길이를 확인하는 명령어
		
		System.out.println("배열의 길이:" + arr.length);
		
		//7.배열의 선언과 생성을 동시에 
		
		byte[] arr2= new byte [7];
		
		//8. 배열의 선언과 생성 그리고 초기화르 동시에 하는법
		
		short [] arr3 = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr3));
		
		short [] arr4 = new short [] {1,2,3,4,5};
		
		//배열의 초기값을 지정하지 않더도 각 타입의 기본값으로 초기화 됩니다. 
		//(0, 0.0, null)
		
		System.out.println("______________________");
		
		//1.문자열 배열을 생성 본인의이름과 ,전화번호를 문자열로 저장
		
		//2. 크기가 3인 int 형 배열에 1~3까지의 랜덤값을 각각저장
		
		
		
		//1.문제
		
		String[] sh = new String[2];
		sh[0]= "탁소현";
		sh[1]="01011111111";
		
		System.out.println(Arrays.toString(sh));
				
				
		
		
		
		
		//2.문제
		
		
		
		//강사님 코드
		
		int [] iArr = {(int)(Math.random() *3) +1,
		(int)(Math.random() *3) +1,
		(int)(Math.random() *3) +1
		};
		
		System.out.println(Arrays.toString(iArr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		}
		
		
		

				
		
		
		
		
		
		
	}


