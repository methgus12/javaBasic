package poly.instanceof_;

public class House {
	/*
	 * Studet [] arr ;
	 * Employee [] arr2;
	 * Teacher[] arr3;
	 */
	
	private Person[] arr = new Person[100]; //자식클래스를 저장할 배열
	private int index; //배열을 관리할 index
	
	House() {
		arr= new Person[100];
		
	}

	
	 /* 1.person의 자식객체를 전달 받을 수 있는 setIn() 을 생성하세요
	 * 기능 -Person 배열에 순서대로 자식클래스를 저장
	 */
	public void setIn(Person s ) {
		arr[index]= s;
		index++;
		
	}

	 /*
	 * 2.info () 는 arr에 있는 학생정보를 전부 출력해주는 메서드를 생성하세요
	 */
	public void info() {
		for(int i =0; i < index ; i++) {
			System.out.println(arr[i].info());
			
			
		
	}


	
	
	}
}
