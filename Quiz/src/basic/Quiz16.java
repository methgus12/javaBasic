package basic;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		//Math.random() 을 사용하여 2-9까지 랜덤변수를 만들고 , 해당 구구단을 세로로 출력

		
		
		int arr = (int)(Math.random()*8) +2 ; //2-9까지 랜덤변수만들기 !
		//0-10까지는 *10, 1-10까지는 *10+1
		
		System.out.println("구구단" + arr + "단"); //회전이 되는게 아니니까 반복문밖에 !
		
		for(int i =1; i<=9 ; i++) {
			System.out.println(arr + " X " + i + " = " + arr * i); 
			
			
		}
		
		
	

}
}