package api.lang.obj;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * object 클래스의 기능
		 * equlas객체의 주소값이 같다면 true
		 * tostring 주소값을 문자열로 반환
		 * finalize-객체가 소멸될 때 호출 , 그 시점은 알수 없
		 * 
		 */
		Person hong = new Person("홍길동");
		
		Person kim = new Person("홍길동");
		System.out.println(kim.equals(hong));
		
		System.out.println(kim.toString());
		
		//finallize가 gc가 호출되는 순서를 보장하지 않기 때문에
		//권장되지않습니다.
		
		hong = null;
		System.gc();//gc를 호출하는애. 가비지컬랙터
		
		//
		try {
			Person p = (Person)kim.clone();
			System.out.println("kim으로 부터 복사된 객체: "+p.getName());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
