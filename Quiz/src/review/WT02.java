package review;

import java.util.Scanner;

public class WT02 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("n을입력하세요 >");
	
	int n = scan.nextInt();
	int sum=0;
	for(int i =1; i <= n ; i++ ) {
		
		 sum +=i;
		 
				 
     }
	System.out.print(sum);
	}

}
