package basic;

public class Quiz17 {
	
	public static void main(String[] args) {
	
		//for 문으로 해결하세요 :)
		
		
		//문제1번 
		//7~100 까지 정수중에 7의 배수를 가로로 출력 (증감식을 7씩 증가하는 형태로 )
		
		//int arr = (int)(Math.random()*100)+1;
		for (int i =7; i <=100; i+=7 ) { //꼭 1씩 증가할 필요가 없음 ! i+=7씩 증
				System.out.print(i + " ");
						
		} 
		System.out.println();
		
		
		
		//문제2번
		//1~100까지의 12의 배수를 가로로 출력
		
		//int arr2 = (int)(Math.random()*100)+1;
		
		for (int ii =1; ii <=100 ; ii++) {
			if (ii % 12 ==0) {
				System.out.print(ii + "  ");
			}
		}
		System.out.println();
		
		
		
		//문제3번
		//1~200까지 정수중의 9의 배수의 개수 
		
		//int arr3 = (int)(Math.random()*200)+1;
		int count = 0;
		
		for (int i3=1; i3 <=200 ; i3++ ) {
			if (i3 % 9 ==0) {
				count++;
			}
		}System.out.println("배의 개수:" + count);
		
		//문제4
		//50~100까지 두수 사이의 합.
		
		
		int sum=0;
		for (int i4=50; i4 <=100 ; i4++) {
				sum += i4;
				}
		System.out.println("두수 사이의 합> " + sum );
		
		
		//문제5
		//.A~Z 까지 가로로 출력 (A의 유니코드 65, Z의 유니코드90)
		for(char ch='A'; ch <= 'Z'; ch++  ) {
			
			System.out.print(ch); 
			
		
			
	}
		
		
	}

}
