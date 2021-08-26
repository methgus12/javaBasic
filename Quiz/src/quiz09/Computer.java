package quiz09;
public class Computer {
	
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key ;
	private Mouse mo;
	private Monitor moni;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	public Computer(){
		key= new KeyBoard();
		mo = new Mouse();
		moni = new Monitor();
		
	
	}
	//모든 멤버변수를 전달받는 생성자를 만들고 초기화하세요
	public Computer(KeyBoard key , Mouse mo, Monitor moni) {
		this.key = new KeyBoard();
		this.mo= new Mouse();
		this.moni = new Monitor();
	}
	
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
			key.info();
			mo.info();
			moni.info();

	}

	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKey() {
		return key;
	}

	public void setKey(KeyBoard key) {
		this.key = key;
	}

	public Mouse getMo() {
		return mo;
	}

	public void setMo(Mouse mo) {
		this.mo = mo;
	}

	public Monitor getMoni() {
		return moni;
	}

	public void setMoni(Monitor moni) {
		this.moni = moni;
	}
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	 
	
}
