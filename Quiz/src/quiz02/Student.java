package quiz02;

public class Student {
	
	/*
	 * 멤버변수 
	 * name , no , kor , eng , math
	 * 이름  , 번호 , 국어, 영어 , 수학
	 * 5개를 매개변수로 받아서 초기화 하는 생성자 
	 * 
	 * getTotal() - 국영수 점수를 모두 더해서 double 형으로 반환
	 * getAvg() 총점을 나눈 평균을 double 형으로 반환(소수점 2자리만 *100 /100.0 )
	 * 
	 */
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	double sum = 0;
	double avg=0;
	
	Student() {
	}
	
	Student(String pName, int pNum , int pKor , int pEng, int pMath) {
		name = pName;
		num= pNum;
		kor= pKor;
		eng= pEng;
		math=pMath;

	}
	
	//합계
	double getTotal() {
		sum += (kor + eng + math);
		
		return sum;
		
		//or return = kor + eng + math ;
	}
	
	double getAvg() {
		//getTotal()
		avg = (int)((sum /3) *100) / 100.0 ;
		
		return avg;
		
		//or return (int)((sum /3) *100) / 100.0 ;
}
}
