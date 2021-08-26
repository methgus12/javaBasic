package basic;

import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * 가로,세로를 스캐너를 통해 입력받습니다.
		 * 가로길이, 세로길이만큼 사각형을 출력하면 됩니다.
		 * 단, 윤곽만 나타나면 됩니다.
		 * 사각형을 우선 만들자 -> 첫행이면 출력 , 아니면 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 >");
		int w = scan.nextInt();
		System.out.print("세로 >");
		int h = scan.nextInt();
		
		for (int i = 1; i <= h ; i++) {//행
			for(int j =1; j <= w; j++) {//열
				
				if (i==1 || i==h) {
					System.out.print("*");
					} else { //중간
						if( j==1 || j== w) { //첫열과 마지막열
							System.out.print("*");}
						else {System.out.print(" ");
					}
			

			
		}
	}	
			System.out.println();
}
	
	}
}
	


