
public class EnhancedForEx {
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		//for (int i =0; i <= arr.length; i++) {일반적인 배열에 접근하는 for문
			
			
		for ( int i : arr ) { //값을 받을 변수 : 배열명 )
			System.out.println(i);
			
		}
		System.out.println("==========================");
		//향상된for문으로 출력하기
		
		String [] arr2 = {"월" ,"화", "수", "목", "금","토" , "일"};
		for (String i : arr2) { 
			System.out.println(i);
		}
		
		
		
		System.out.println("==============================");
		
		int [] arr3 = {40,20,50,33,50}; //arr3의 평균과 합계
		int sum = 0;
		
		for (int i : arr3) {
			sum += i;
			}
		System.out.println("합계 > " + sum);
		System.out.println("평균 > " + sum / arr3.length); //sum 앞에 double을 붙이면 실수까지 나옴 , 정확한 평균 구하기가능
		
		
		
		}
		

}
