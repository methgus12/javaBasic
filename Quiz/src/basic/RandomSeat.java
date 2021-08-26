package basic;

import java.util.Arrays;
import java.util.Scanner;


public class RandomSeat {
	
	public static void main(String[] args) {

		/*
		 * 1.사람수를 입력받을 수 있습니다.
		 * 2.입력받은 사람만큼 랜덤값을 생성하여 , 배열의 절대 중복되지않게 랜덤으로 배정을 합니다.
		 * 3.해당배열의 크기만큼 °으로 출력해주세요 
		 * 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 제대로 선택된 좌석이라면 ,자리번호를공개하고 제대로 선택되지않은 자리라면 
		 * "출력문을 띄우고 다시 선택하도록 "
		 * 그리고 선택된 자리는 다시 •으로 출력해주세
		 */ 
		

		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요 >");
		int seat = scan.nextInt();
		String [] arr = new String [seat];
		int [] arr1 = new int [seat];
		
		for (int i =0 ; i < arr.length; i++) {//빈자리채우기 
			arr[i] = "o";
			

		}
		for (int i = 0; i < arr1.length ; i++) {
			int rand = 0;
			boolean check = (false);
			
			do {//중복검사하기
				check = false;
				rand = (int)(Math.random()*seat)+1;
			for(int j =0; j < arr1.length; j++) {
				if(rand == arr1[j]) {
					check = true;
					break;
				}	
			}
			} while (check) ;
			
			arr1 [i] = rand;
		}
	

		while(true) { 
			System.out.println("-------------좌석선택 프로그램 ------------------");
			System.out.println();

		for (int i = 1 ; i <= seat ; i++) {//좌석번호 출력
			System.out.printf("%3d" , i);}
		
		System.out.println();
		for(int i = 0; i < arr.length ; i++) {//arr표시
			System.out.printf("%3s" ,arr[i] ); 
		} 
		
		
		System.out.println();
		System.out.print("좌석선택>");
		int aa = scan.nextInt();
		
		if ( aa==0) {
			System.out.println("종료합니다.");
			break;
		}
		
		
		if (arr[aa-1] == "o") {
			System.out.println("자리번호를 공개합니다:" + arr1[aa-1]);
			arr[aa-1] = "x";
		} else {
			System.out.println("이미선택된 자리입니다.");
		}
	System.out.println();
		
		}
		
		/*
		 * Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 입력하세요>");
		int size = scan.nextInt();
		int arr [] = new int[size];
		int index =0;

		
		start:while(true) {
			int seat = (int)(Math.random() * size) + 1;
			for (int i =0; i < index ; i++) {
				if (arr[i] == seat) continue start;
			}
			arr[index] = seat;
			index++;
			
			if (index == size) break;
		}
		System.out.println(Arrays.toString(arr));
		//좌석선택작업
		
		while (true) {
		System.out.println("-----좌석선택 프로그램-----");
		//System.out.println();

		for(int i =0 ; i < arr.length ; i++) {
			System.out.printf("%-3d", i+1 ); //여유공간 3칸을 잡고 , 좌측에서 채운다 .
		}System.out.println();
		
		for(int i =0; i< arr.length ; i++ ) {
			
			if (arr[i] == -1) {
				System.out.printf("%-3s", "x");
				
			} else {
				System.out.printf("%-3s", "o");
			}
			
		}System.out.println();	
		
		System.out.print("좌석선택> ");
		int select = scan.nextInt();
		
		if(select-1>size || arr[select-1]==-1 ) {
			System.out.println("이미 선택된자리입니다");
		} else {
			
		
		System.out.println("자리번호 >" + arr[select-1]);
		arr[select -1] =-1 ; //선택되었다는 의미 
		}
		}
		 */
		
		
		
		
		
		
		
		
	
		

		
	
	
	}

}
