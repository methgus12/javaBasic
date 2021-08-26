package quiz06;

public class Car {
	
	String model;
	int speed;
	
	//1. model을 전달받아서 model에 저장하는 생성자를 생성하세요

	Car(String model ) {
		this.model=model;

	}

	/*
	멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
	그렇지 않으면 멤버변수에 매개변수저장 
	*/
	
	void accel(int speed) {
		
		if(this.speed >= 150) {
			System.out.println("속도를 올릴 수 없습니다.");
		} else {
			this.speed = speed;
		}
		

	}
	
	void run() {
		
		for(int i=0; i <=200; i+=30) {//30씩 증가.
			
			this.accel(i); //accel(i)도 가능
			
			System.out.println("현재속도"+this.speed + "km/s");
		}
		/*	
		0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		*/

	}
}







