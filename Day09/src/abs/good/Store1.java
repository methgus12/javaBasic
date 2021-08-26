package abs.good;

public class  Store1 extends ParentStore {

	@Override
	public void apple() {
		System.out.println("서울 지점의 사과는 500원");
	}

	@Override
	public void grape() {
		System.out.println("서울 지점의 포도는 600원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점의 오렌지는 700원");
		
	}
	
	

}
