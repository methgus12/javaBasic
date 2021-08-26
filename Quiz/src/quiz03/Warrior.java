package quiz03;

public class Warrior extends Player {
	
	
	Warrior(String name, int h, int m, int at, int ar){
		id=name;
		hp=h;
		mp=m;
		attack=at;
		armor=ar;
	}
	
	//전사의 고유한 skill
	
	void bash() {
		System.out.println("스킬사용");
	}
	

	
	
	

}
