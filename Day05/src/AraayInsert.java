import java.util.Arrays;
import java.util.Scanner;

public class AraayInsert {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		String [] arr = new String [100];
		
		int index = 0; //입력받은 개수 (or 배열의 위치)를 나타낼 변수
		
		System.out.println("#먹고싶은 음식을 입력하세요");
		System.out.println("#중지하려면 [그만] 이라고 입력하세요");
		
		while(true) {
			
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("그만")) break; //문자열은 문자열.equals 사용 ! 꼭 기
			
			arr[index] = menu;
			index++;
			
			
		}
		//출력문
		System.out.print("먹고싶은음식: [");
		for(int i =0; i< index ; i++) {
			System.out.print(arr[i]);
			if (i == index -1) break;
			
			System.out.print(",");

			
		} System.out.print("]");
	}

}
