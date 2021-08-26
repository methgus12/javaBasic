import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		//문제를 보여주고 , 정답을 맞출때까지 계속 입력받는 프로그램
		Scanner scan = new Scanner(System.in);
		while (true) {
			
			System.out.println("4 x 6 = ?");
			
			System.out.print(">");
			
			int answer = scan.nextInt();
			
			if (answer == 24) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("틀렸는데요? ");
			}
		}
	}

}
