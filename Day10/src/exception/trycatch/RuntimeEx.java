package exception.trycatch;

public class RuntimeEx {
	public static void main(String[] args) {
		
		//실행예외 종류
		//nullpointer
		
		//String str = null;
		//str.charAt(1); //한글자잘라주는것
		
		//ArrayIndexBoundsExcpeption
		//int [] arr = {1,2,3};
		//arr[10] =10;
		
		int a=1;
		System.out.print(a + ""); //숫자를 문자로 바꾸는 법
		
		String s ="1";
		int ss = Integer.parseInt(s); //문자를 숫자로 바꾸는법:매우중요
		System.out.println(ss);
		
		//NumberFormat
		//String e ="^^7";
		//int sss = Integer.parseInt(e); //에러
		
		//ClassCasting
		
		//String s =(String)new Object();//에러
		
		
		
	}

}
