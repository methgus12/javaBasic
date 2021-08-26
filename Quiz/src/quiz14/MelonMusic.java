package quiz14;

public class MelonMusic implements SongList {
	
	/*
	 * insertList는 list 배열에 매개변수를 순서대로 저장
	 * playList 는 배열안에 음악을 랜덤하게 출력.
	 * playLength 는 음악의 개수를 반환
	 * 
	 * 
	 */
	
	//멤버변수
	private String[] list = new String [100];
	private int count =0;
	
	
	@Override
	public void insertList(String song) {
	
			list[count] = song;
			count++;	
		}
		
	
	@Override
	public void playList() {
		for(int i =0; i < count ; i++) { //음악의 개수만큼 회전 
			int num = (int)(Math.random() * count);
			System.out.println(list[num]);
			
		}
		
		}
		
	
	@Override
	public int playLength() {
		return count;
	}
	
	

	

}
