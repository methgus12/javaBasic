package api.lang.obj;

public class Person implements Cloneable {
	
	private String name;
	
	public Person (String name) {
		this.name = name;

		
	}
	//get, set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//오버라이딩 확인 
	//equlas 오버라이딩 -> 객체의 이름이 같으면 true 반환
	@Override
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Person) {
			
			Person p =(Person)obj; //Person 캐스팅
			String name = p.getName();
			
			if(name.equals(this.name)); {
				
				return true;
			}
		}
	return false;//이름이 같지않다.

}
	@Override
	//tostring() 오버라이딩
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "객체가 소멸됨");
		super.finalize();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

	
}

