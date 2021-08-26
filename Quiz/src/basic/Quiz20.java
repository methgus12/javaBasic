package basic;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		//구구단 2-9단까지 세로로 출력 .
		
		//\t는 8칸 줄바꿈입니다 
		
		for(int i=1; i <=9 ; i+=3) { //단의 표
			System.out.print("\n");
			
			for(int j =1 ; j <=9 ; j++) {//행의표
				
				System.out.println(i + "X" + j + "=" + i*j + "\t"  +
				(i+1) + "X" + j + "=" + (i+1)*j + "\t" +
				(i+2) + "X" + j + "=" + (i+1)*j);
				} 
			
		}
		//printf ("%d를 나열하여 사용해도 됨 !!)
		
	
}
}


