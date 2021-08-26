package quiz10;


public class Warrior extends Player {
	
	public Warrior(String id){
		this.id=id;
		this.hp=1000;
		this.mp=500;
		this.attack=10;
		this.armor=10;
	}

	public void bash(Player p ) {
		/*2.스킬을 사용할 때마다 me 캐릭터의 mp를 100 씩 감소시킵니다.
		 * 캐릭터의 mp가 100이하면 스킬을 사용하지못하고 메서드를 종료시키세요
		 * wizard 와 warrior을 모두받을 수 있도록 
		 * */
		
		if(this.mp <= 100) {
			System.out.println("mp가 부족합니다.");
			return; //매서드의 종료
			
		} else {
			this.mp -=100;
			
		}
		//bash에 적중당한 클래스에 따라서 hp의 감소가 다르게 
		// 처리되도록 bash()를 수정해보세요
		if(p instanceof Warrior) {
			p.hp -= 100;  //p.hp = p.hp -100
			
		} else if( p instanceof Wizard) {
			p.hp -=200;
		}
		
		
	}
	
	
	 
	

	
	

}
