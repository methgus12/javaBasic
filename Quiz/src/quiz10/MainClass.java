package quiz10;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한소현");
		
		Wizard play2= new Wizard("플레이어1");
		
		Warrior play3 = new Warrior("플레이어2");
		
		me.bash(play2);
		me.bash(play3);
		
		//확인
		play2.info();
		play3.info();
		
		//문제 2확인 
		//players 배열의 이름과 함께 랜덤 피해를 각각 출력하세요 
	
		Player [] players = {me,play2, play3};
		play2.blizzard(players);
		play2.blizzard(players);

		me.info();
		play2.info();

}
}
