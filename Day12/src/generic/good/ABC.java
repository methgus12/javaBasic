package generic.good;

public class ABC <T>{ //<>안에 원하는 변수명 쓰면 됩니다. (T는 아직 미정)
	
	
	private T t;
	
	//setter
	public void setT(T t) {
		this.t = t;
	}
	
	//getter
	public T getT() {
		return t;
	}
	
	
	

}
