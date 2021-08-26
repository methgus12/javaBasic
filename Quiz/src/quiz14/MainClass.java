package quiz14;
import java.util.Scanner;

public class MainClass {
	
	/*
	 * insertList는 list 배열에 매개변수를 순서대로 저장
	 * playList 는 배열안에 음악을 랜덤하게 출력.
	 * playLength 는 음악의 개수를 반환
	 */

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//MelonMusic 객체생성
		SongList melon  = new MelonMusic();
	
		
		while(true) {
			
			System.out.println("[메뉴] 1.추가 , 2.재생, 3.음악개수 4.종료");
			System.out.print(">");
			String menu = scan.next();
		
			if(menu.equals("1") || menu.equals("추가")) {
				
				System.out.print("음악입력>");
				String song = scan.next();
				melon.insertList(song); //추가
				
			} else if(menu.equals("2")) {
				
				melon.playList();

			} else if(menu.equals("3")) {
				int count= melon.playLength();
				System.out.println("음악의 개수" + count);//반환이 있기때문
				
				} else if (menu.equals("4")){
					System.out.println("멜론뮤직종료");
					
				} else {
					System.out.println("정확히 입력하세요 ");
				}
		}
		
	}


}
