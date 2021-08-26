package exception.multicatch;

public class MainClass {
	
	public static void main(String[] args) {
		
		//main에 인자값을 전달하는 방법
		/*
		 * run탭 -> run_configuratuins -> arguments 탭 -> ${string_prompt}
		 * 
		 * 
		 */
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int num1=Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			
			String str = null;
			str.charAt(0);
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) { //catch뒤에는 정확한 에러의 종류가 전달됩니다.
			System.out.println("실행 매개값을 반드시 2개이상 전달하세요");}
			
			catch (NumberFormatException e) {
				System.out.println("실행 매개값을 반드시 숫자로 전달해주세요");
				
			} catch(Exception e) { //예외의 강위부모이기 때문에 모든 예외를 받아서  처리합니다. 
				System.out.println("기타예외입니다.");
				
				
			}


}
}
