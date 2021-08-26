
public class PenMain {
	
	public static void main(String[] args) {
		
		
		//pen의 기능 , 속성을 사용하려면 설계용 클래스를생성해야합니다.
		
		Pen black = new Pen();
		
		black.ink = "검정";
		black.price=1000;
		black.company="monami";
		black.write();
		black.info();		
		
		Pen blue = new Pen();
		
		blue.ink = "파랑";
		blue.price=1500;
		blue.company="monami";
		blue.write();
		blue.info();		
		
		Pen red= new Pen();
		
		red.ink="빨강";
		red.price=1800;
		red.company="monami";
		red.write();
		red.info();		
		
		//계산기생성
		Calculator cal= new Calculator();
		
		System.out.println(cal.add(black.price));
		System.out.println(cal.add(blue.price));
		System.out.println(cal.add(red.price));
		

		
	}

}
