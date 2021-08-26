package quiz15;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*
		 * 1.스캐너를 통해서 정수 2개를 입력을 받습니다.
		 * 2.입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료 하면됩니다.
		 * 3.만약 입력받은 값이 예외를 발생시키는 값이라면, "정수로만 입력하세요"를 출력한 다음
		 *다시 처음부터 입력받습니다.
		 *4.반복문을 탈출하면 프로그램 종료 구문을 띄워주세용~
		 * 
		 * 	ex) 정확히 코드를 짜면 무한 루프 > 이유를 찾아보세요
		 * 자바에서 실제로 입력받는건 buffer어쩌구~ 엄청 김 ,
		 */
		
		Scanner scan = new Scanner(System.in);

		
		while(true) {
			//무한루프 방지 첫번째 방법
			/*try {
				
				System.out.print("정수입력>");
				int a = scan.nextInt();
				System.out.print("정수입력>");
				int b = scan.nextInt();
				
				System.out.println("두 정수의 합>" + (a+b));
				break;
				
			}  catch (Exception e) {

			System.out.println("정수로만 입력하세요 ");
			scan.nextLine(); //무한루프방지 엔터값의 제거
		
		} 
		}*/
		
		//무한루프 방지 두번째 방법
		try {
			
			System.out.print(">");
			int a = Integer.parseInt(scan.nextLine());//이렇게 작성!
			System.out.print(">");
			int b = Integer.parseInt(scan.nextLine());
			
			System.out.println("두 정수의 합>" + (a+b));
			break;
			
		} catch (Exception e) {
			System.out.println("정수로만 입력하세요 ");
		}
	}

	}
}
