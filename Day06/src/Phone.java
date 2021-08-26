
public class Phone {
	
	//멤버변수
	
	
	//생성자 : 생성자는 클래스 이름과 대/소문자까지 동일함
	//반환유형은 없습니다. void, int 등 이런것 없음!
	//위치는 상관없으나 , 일반적으로 변수 아래에 만듬 .

	
	Phone (){
		//생성자 
		System.out.println("생성자 호출!");
		model ="iphone";
		price= 1000000;
		color = "검정";
		}
	
	//생성자는 여러개 선언 가능
	//단 매개변수의 종류, 개수가 달라야함 
	Phone(String pColor){
		model ="애니콜";
		price=10000;
		color = pColor;
		
	}
	
	Phone(int pPrice , String pColor){
		model="가로본능";
		price = pPrice;
		color= pColor;
	}
	
	Phone(String pModel, String pColor){
		model= "ruru";
		color= pColor;
		price= 70000000;
		
	}
	
	Phone (String pColor, int pPrice , String pModel){
		color = pColor;
		price = pPrice;
		model =pModel;
		
	}
	String model;
	int price;
	String color;
	
	//메서드
	void info() {
		
		System.out.println("------------폰의 정보-----------");
		System.out.println("모델>" + model);
		System.out.println("가격>" + price);
		System.out.println("색상>" + color);
		
		
		
	}
	
	

}
