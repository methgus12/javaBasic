package quiz02;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student stu = new Student("탁소현" , 1, 45, 92, 99);
		
		double total = stu.getTotal();
		double avgg = stu.getAvg();
		
		System.out.println("세과목 합산 점수 >" + total);
		System.out.println("세과목 평균 점수 >" + avgg);
		
		Student stu2 = new Student("심여명" , 2, 78    , 92,89);
		double total2 = stu2.getTotal();
		double avgg2 = stu2.getAvg();
		
		System.out.println("세과목 합산 점수 >" + total2);
		System.out.println("세과목 평균 점수 >" + avgg2);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
