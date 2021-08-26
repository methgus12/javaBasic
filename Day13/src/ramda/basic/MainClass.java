package ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {

		//Person 의 greeting 메서드를 실행시켜보세요
		
		Person p = new Person();
		p.greeting(new Say01 (){
			//익명함수 : 반환없다
			@Override
			public void talking() {
				System.out.println("안녕");
				
			}
		});
		
		p.greeting(new Say02() {
			
			//익명함수법 : 반환이있다.
			@Override
			public String talking() {
				
				return "안녕하세요";
			}
		});
		
		p.greeting(new Say03() {
			
			@Override
			public String talking(String word) {
				
				return word + "홍길동입니다.";
			}
		});
		
	String r=p.greeting(new Say04() {
			
			@Override
			public String talking(String word, int i) {
				//3번인사하는 기능
				String result ="";
				for(int j =1; j <=i; j++) {
					result += word;
				}
				
				return result;
			}
		});
		System.out.println(r);
		//함수적 인터페이스를 매개변수로받는 형식은 람다로 표현될 수 있습니다. 
		//람다함수로 바꾸어보기
		
		p.greeting(()->System.out.println("안녕")); //한줄 표현은 중가로생략가능
		
		p.greeting(()-> {return "안녕하세요";} );
		//p.greeting(()-> "안녕하세요"); 한줄이면서 return 값만 적으면 생략가능

		p.greeting((word) -> word+"홍길동입니다.");
		//p.greeting((word)->{ return  word + "홍길동입니다.";}); 같은 출력 다른표현
		//타입 쓰지않고 변수명만  ()안에 적어줌
		
		String r2=p.greeting( (word , i) ->{
			String result ="";
			for(int j =1; j <=i; j++) {
				result += word;
			}
			
			return result;
		} );
		
		System.out.println(r2);
		
		
	
	
	}
	
		
	

}
