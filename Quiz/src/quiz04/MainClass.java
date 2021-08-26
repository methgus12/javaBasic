package quiz04;
//자료를 옮겨 받을때 꼭확인하세요!!

public class MainClass extends Phone {

	public static void main(String[] args) {
		
		//Dmb폰 객체 생성
		DmbPhone dp = new DmbPhone("햅틱", "메탈그레이", 10);

		//Phone클래스에서 상속받은 멤버 변수에 접근
		
		System.out.println("모델 >" + dp.model);
		System.out.println("색상>" + dp.color);


		//Phone에서 상속받은 메서드 호출
		
		dp.powerOn();
		dp.powerOff();
		dp.ring();
		dp.sendVoice("민정아 술먹자");
		dp.recieveVoice("여명아 나는 술 싫어해 ㅜㅜ ");
		dp.hangUp();

		//DmbPhone에서 선언한 메서드 호출
		dp.turnOnDmb(); //기능: TV를 켭니다 출력
		dp.changeChannel(7); //기능: channel변수를 전달받은 변수로 변경후 출력
		dp.turnOffDmb(); //기능: TV를 끕니다 출력
		dp.powerOff();


	}

}
