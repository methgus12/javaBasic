
public class MultiFor02 {
	
	
	public static void main(String[] args) {
		
		//중첩반복문에서 조건이 변경되는 형태
		
		for(int i = 1; i <= 5 ; i++) { //행을표현
			for(int j = 1; j <= 5 ; j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println("-------------------------");

		int star = 5;
		for(int i =1 ; i <= 5 ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("-------------------------");
		
		for(int i = 1; i <= star; i++) {
			for(int j =1; j <= 6-i; j++) {
				System.out.print("*");
				
			}System.out.println();
		}System.out.println("-------------------------");
		
		for(int i =1; i<= star; i++ ) {
			
			for(int j =1 ; j <= i; j++) {
				System.out.print("\n");
			}

		}System.out.println();
		
		//int star = 10;
		for(int i =1; i<= star; i++ ) {
			for(int j =1 ; j <= star-i; j++) {
				System.out.print(" ");	
			} 
			for(int j=1; j<= (i*2)-1 ; j++) {
					System.out.print("*");
				}System.out.println();
				
			}

		
	}

}