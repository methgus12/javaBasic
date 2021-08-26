package defalt;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 >");
		int point = scan.nextInt();
		
		switch (point / 10) {
		
		case 9:
			
			if(point >= 95 ) {
				System.out.println("A+");				
			} else 
			System.out.println("A");
			
			break;
		case 8:
			System.out.println("B");
						
			break;
		
		case 7:
			System.out.println("C");
			break;
			
		case 6:
			System.out.println("D");
			
			break;
		default:
			System.out.println("F");
			break;
			
		}
	}

}
