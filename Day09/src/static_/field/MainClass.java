package static_.field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;//1
		c1.b++;//1
		
		System.out.println("일반멤버변수" + c1.a);
		System.out.println("정직멤버변수" + c1.b);
		
		Count c2 = new Count();
		c2.a++;//1
		c2.b++;//2
		
		System.out.println("일반멤버변수" + c2.a);
		System.out.println("정직멤버변수" + c2.b);
		
		Count c3 = new Count();
		c3.a++;//1
		c3.b++;//3
		
		System.out.println("일반멤버변수" + c3.a);
		System.out.println("정직멤버변수" + c3.b);

		/*
		 * static 은 클래스 외부에 1개 생성된다. 의 의미를갖습니다.
		 * 그래서 static 변수는 객체와 상관없기 때문에
		 * 
		 * 클래스이름.변수명으로 사용할 수 있습니다.
		 * 예 ) Count.b
		 */
		
		Count.b++; //중요!!
		
		Count.b =100;
		c2.b++;//101
		
		System.out.print(Count.b);//101 
		
	}

}
