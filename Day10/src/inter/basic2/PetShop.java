package inter.basic2;

public class PetShop  {
	

	//1.carePet() 메서드 선언
	//매개변수는 모든 펫타입을 전달 받을 수 있도록 선언
	public void carePet(IPet pets) {
		
		//기능- instanceof 사용해서 캐스팅하고, "XXX를 돌봅니다."출력
		
		if( pets instanceof Dog) {
			Dog dog = (Dog)pets;
			System.out.println(  "멍멍이을 돌봅니다.");
		} else if (pets instanceof Cat) {
			
			Cat cat = (Cat)pets;
			System.out.println( "냥냥이를 돌봅니다.");
			
		} else if (pets instanceof GoldFish) {
			
			GoldFish fish = (GoldFish)pets;
			System.out.println( "물고기를 돌봅니다.");
		}

	}
	/*
	 * 2.petInfo()메서드 선언
	 * 매개변수는 팻배열을 받도록 선언
	 * 기능-모든 팻의 play 메서드를 실행
	 */
	
	
	public void petInfo(IPet [] arr) {
		
		for(int i =0; i < arr.length ; i++) {
			arr[i].play();
		}
		
	}
	
	

	
}
