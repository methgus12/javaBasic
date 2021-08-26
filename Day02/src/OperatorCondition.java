
public class OperatorCondition {
	public static void main(String[] args) {
		
		System.out.println(Math.random()); //double 형태의 0.0~1.0미만의 랜덤수를만들어주는 기능
		
		
		//double d= Math.random() * 10; //0.0 ~10.0
		//System.out.println(d);
		
		//int r =(int)d;
		//System.out.println(r);
		
		int r = (int)(Math.random() *10) +1;
		System.out.println(r);
		
		//삼항 연산식 (조건 ? 연산 1 : 연산 2)
		
		String result = r % 2 ==0 ? "짝" :"홀";
		
		System.out.println(result);
		
		//외우기
		
		
		
		
		
		
		
		
		
	}

}
