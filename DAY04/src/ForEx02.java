import java.util.Scanner;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		//정수를 입력받아서 소수인지 판별.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>>");
		int num = scan.nextInt();
		
		int count =0; //개수를 세어주는 변수 
		
		for(int i = 1 ; i <= num ; i++ ) {
			if(num % i ==0) { //num 에 대한 약수 구하는 공식 !
				System.out.print(i + ""); //약수를 보기 
				count++; //나누어 떨어질때마다 카운트를 세겠습니다 

			}
		} 
		System.out.println();
		System.out.println(num + "약수의 개수:" + count);
		System.out.println(count ==2 ? num +"은 소수" : num + "은 소수가아닙니다");
	}

}
