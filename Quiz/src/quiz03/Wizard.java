package quiz03;

public class Wizard extends Player{
	
	Wizard(String name, int h, int m , int at, int ar) {
		
		id=name;
		hp=h;
		mp=m;
		attack=at;
		armor=ar;
		
	}


	//전사의 고유한 skill
	
	void arrow() {
		System.out.println("마법사 전용스킬");
	}
	

	
	
}
