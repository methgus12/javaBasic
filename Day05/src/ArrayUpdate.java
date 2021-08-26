import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		
		String[] arr = {"강타" , "토니안" , "문희준" , "장우혁", "이재원" };
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		System.out.print("찾을 이름>");
		String name = scan.next();
		
		boolean chk = false ; //적어도 한번 수정된 결과를확인하는 변수
		
		for ( int i =0; i <arr.length; i++) {
			if(name.equals(arr[i])) {//문자열이같은지 안같은지를 구분하는 공식 같으면 참 아니면 거짓으로 출
				System.out.println(arr[i]+"학생이름을 수정합니다");
				System.out.println(arr[i] + "수정할이름 >");
				arr [i] = scan.next();
				chk = true; //변경되었다는 의미  
				
				
			}

		}
		if (chk) {
			System.out.println("정상적으로 수정되었습니다.");
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("찾는 이름이 없습니다.");
		}
	}
	}
}
