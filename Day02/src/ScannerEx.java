import java.util.Scanner;


public class ScannerEx {
	
	public static void main(String[] args) {
		
		//1.스캐너 생성
		
		Scanner scan = new Scanner(System.in);
		
		//2.스캐너가 가지고 있는 기능을 사용해서 입력받음.
		//가로에 작성위해 자동줄바꿈 안함 print만 적

		System.out.print("이름>");
		String name = scan.next(); //문자열 입력받
		
		System.out.print("나이>");
		int age = scan.nextInt(); //정수를 입력받
		
		System.out.print("키>");
		double cm = scan.nextDouble(); //실수를 입력받음
		
		System.out.println("이름:" + name + ", 나이 : " + age + ", 신장:" + cm );

		
		
		
		
		
		
		
	}

}
