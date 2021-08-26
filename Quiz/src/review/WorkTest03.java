package review;

import java.util.Scanner;

public class WorkTest03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[1.혜원언니 2.혜정 3.영서 4. 소현]");
		
		while(true) {
		System.out.print("사람의 번호를 입력하세요>");
		int a = scan.nextInt();
		System.out.println("번호를 선택하세요 >[1 ,2,3, 4]");
		int b = scan.nextInt();
		
		int num =0;
		
		if(a == 1) {
			if(b==1) {
			System.out.println("혜원언니가 드실 벌주의 양은? 소주 세잔 입니다.");
		} else if (b==2) {
			System.out.println("혜원언니가 드실 벌주의 양은? 소주 한잔 입니다.");
		} else if (b==3) {
			System.out.println("혜원언니가 드실 벌주의 양은? 없습니다.");
		} else {
			System.out.println("혜원언니가 드실 벌주의 양은? 맥주한잔 입니다.");
		}
		}
		
		if (a==2) {
			if(b==1) {
				System.out.println("혜정이가먹을  벌주의 양은? 소주세잔입니다.");
			} else if(b==2) {
				System.out.println("혜정이가 먹을 벌주의 양은? 소주한잔입니다.");
			} else if (b==3) {
				System.out.println("혜정이가 먹을 벌주의 양은? 없습니다.");
			} else {
				System.out.println("혜정이가 먹을 벌주의 양은? 맥주한잔입니다.");
			}
		}
		if(a==3) {
			if(b==1) {
				System.out.println("영서가 먹을 벌주의 양은? 소주세잔입니다.");
			} else if(b==2){
				System.out.println("영서가 먹을 벌주의 양은? 소주한잔입니다.");
				
			} else if(b==3) {
					System.out.println("영서가 먹을 벌주의 양은? 없습니다.");
			
		} else {
			System.out.println("영서가 먹을 벌주의 양은? 맥주 한잔입니다.");
		}
			
		
	} if (a==4) {  break;
	}

}
	}
}
