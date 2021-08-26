package quiz13;

public class Dropship extends Unit {
	
	//1.유닛을 저장할 수 있는 3칸 배열을 생성 . index 변수도 선언
	private Unit [] unit = new Unit[8];
	private int index =0;
	
	public Dropship() {
		super(0,0,200);
	}
	
	//hold 기능은 동일합니다. 
	@Override
	public void hold() {
		
		System.out.println("현재위치:" + x + "," + y);
		
		
		this.stop();
	}
	
	//move의 기능 
	/*
	 * 수송선이 움직이면 수송선에 타고있는 유닛의 위치를 전부 드랍십의 위치로 변경 
	 */
	
	@Override
	public void move(int x, int y) {
		int length = (x-this.x)*(x-this.x) + (y-this.y) *(y-this.y);
		int distance=(int)Math.sqrt(length);
		
		this.x=x;
		this.y=y;
		System.out.println("이동거리:" + distance);
		
		for(int i =0; i < index; i++) {
			
			if(unit[i] != null) {
				unit[i].x = this.x;
				unit[i].y=this.y;
			}
		}
		
	}
	/*
	 * 3.드랍쉽만의 기능 ride ()
	 * -배열의 크기는 8고정, 수송선 안에는 탱크와 마린이 탈수있습니다.
	 * 탱크는 4칸을 사용하고 마린은 배열은1칸씩 사용
	 * 배열에 유닛이 탈수있으면 , 매개변수로 받은 유닛을 배열에 저장
	 * (단 탱크가 배열에 타4칸 처리)
	 * 배열이 전부 차거나 탈수 있는 공간이 없으면 , 수송선에 공간이 부족합니다 출력 하고 종료
	 * 
	 * 수송선에 탄 유닛을 전부 가로로 출력 
	 */

	
	public void ride(Unit unit) {
		//마린이 들어갈 수 있는 조건 
		if (unit instanceof Marin && index <=7) {
			this.unit[index]=unit;
			index++;
			
			
		} else if (unit instanceof Tank && index <= 4) {
			this.unit[index] =unit;
			index+=4;
			
		} else {
			System.out.println("공간이부족합니다.");
			return;
			
		}
		System.out.print("수송선 정보:");
		for(int i =0; i < index; i++) {
			if(this.unit[i] instanceof Marin) {
				System.out.print("M");

			}else if (this.unit[i] instanceof Tank) {
				System.out.print("T");
				
			}
		}
		System.out.println();
		
		}
	
		
		
		
	}
	
	
	
	

