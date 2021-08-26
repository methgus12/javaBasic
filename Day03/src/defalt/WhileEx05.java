package defalt;

public class WhileEx05 {
	
	
	public static void main(String[] args) {
		//int [] arr = new []
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		//첫번째 지만 항상 0번째 , 마지막은 항상 배열의 길이의 -1 잊지말기 !
		
		
		//배열의순차적인 접근은 0에서 길이 미만 까지 반복문을 회전합니다!
		
		int sum=0;
		int i = 0;
		//배열의길이를 알아보는 함수 : 변수.length -1
		//혹은 변수.length 를 쓴 후 이상, 이하 부등호가 아닌 미만 , 초과 부등호를 써주면 훨 쉬움
		
		while(i < arr.length ) {
			
			//System.out.println(arr[i]);
			
			sum += arr[i];
			
			i++;
		}
		System.out.println("배열의 요소의 합:" +sum);
		
		
		
		
	}

}
