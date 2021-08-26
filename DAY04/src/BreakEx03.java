
public class BreakEx03 {
	
	public static void main(String[] args) {
		
		//중첩반복문의 탈출
		
		/*boolean flag = false; //탈출을 위한 변수 
		
		for (char u  = 'A' ; u <= 'Z'; u++) {
			
			for(char l = 'a'; 1<= 'z' ; l++) {
				
				System.out.println(u + "-" + l);
				flag = true;
			
				if(l=='c') break;
				
				
			}
		}
		if(flag) break;
		*/
		
		//탈출할 반복문에 이름을 붙이고 break뒤에 이름을 붙여 탈출하는 방법
		//자주 쓰이진 않지만 복잡할때 사용하면 편리함 
		
		es :for(char u = 'A'; u <= 'z' ; u++) {
			for(char l= 'a'; l <= 'z'; l++) {
				System.out.println(u + "-" + l);
				if (l=='c') break es;
				
				
			}
		}
		
		
	}
	

}
