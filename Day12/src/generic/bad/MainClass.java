package generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		abc.setObj("홍길동"); //저장
	
		
		String name = (String)abc.getObj();
		
		abc.setObj(new DEF());
		DEF def = (DEF)abc.getObj();
		
		//이렇게 된 경우 정확한 타입으로 잘라주어야 사용가능 !
		/*
		 *object 형으로 선언하면 무엇이든 저장 할 수 있지만 , 
		 *반대로 저장했던 값을 사용할 때 타입별로 형변환을 해야하는 문제가 발생
		 *그리고 잘못형변환하면 예외를 발생시킵니다.
		 *
		 */
		
	}

}
