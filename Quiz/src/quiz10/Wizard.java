package quiz10;
public class Wizard extends Player{
	
	public Wizard(String id) {
		
		this.id=id;
		this.hp=500;
		this.mp=1000;
		this.attack=10;
		this.armor=10;
		
	}


	//마법사의 고유한 skill
	
	void arrow() {
		System.out.println("마법사 전용스킬");
	}
	
	//블리자드 스킬은 매개변수로 플레이어 배열을 받습니다.
	public void blizzard (Player [] players) {
		
		System.out.println(this.id + "가 bizzard를 사용합니다.");

		 //매개변수 players 배열을 향상된for문으로 회전
		for(Player p : players ) {
			
			// for 문안에는 10-15까지의 랜덤수 발생
			int ran = (int)(Math.random()*6)+10;
			
			//players 배열의 hp를 각각 랜덤수 만큼 감소시킵니다.
			//players 배열의 이름과 함께 랜덤 피해를 각각 출력하면됩니다.
			p.hp -= ran;
			System.out.println(p.id + "가" + ran + " 만큼 피해를 받았습니다.");
			
			
		}
	}
	

	
	
}
