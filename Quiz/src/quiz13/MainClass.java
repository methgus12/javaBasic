package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		//main에서는 marine 과 탱크 수송선을 생성하고 수송선에 전달해서 확인.
		
		Marin m1 = new Marin();
		Marin m2 = new Marin();
		Marin m3 = new Marin();
		Marin m4 = new Marin();
		Marin m5 = new Marin();
		
		
		Tank t1=new Tank();
		Tank t2=new Tank();
		
		
		Dropship ship = new Dropship();
		
		ship.ride(m1);
		ship.ride(m2);
		ship.ride(m3);
		ship.ride(t1);
		ship.ride(t2); //자리 없어서 불가.
		ship.ride(m4);
		
		ship.move(10, 10);//이동
		
		ship.hold();
		m1.hold();
	}

}
