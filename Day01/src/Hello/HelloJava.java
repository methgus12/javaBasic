package Hello;

public class HelloJava {
	public static void main (String[] args) {
		
		System.out.print("줄바꿈이없네요 \n");
		//즉 print 만 하면 줄바꿈 없어서 \n을 붙여주어야함 \n
		
		System.out.print("우리집 강아지는 볼트입니다.\n");
		
		//println() 작성한 코드에 마지막에 \n을 자동으로 삽입
				
				
				
				
				System.out.println("안녕하세요");
				System.out.println("우리집 강아지는 볼트입니다");
				
				//printf() 는 형식지정 출력문 
				System.out.printf("오늘의 %d일 입니다",15);
				System.out.printf("오늘은 %d월 %d일 입니다",2,15);
				
				//위는 줄바꿈을 안줘서 두개가붙어서 나옴 즉 줄바꿈은 따로 해줘야함
				//앞의 출력문의 마지막 혹은 두번째 출력문의 맨 앞에 \n 사용해주면 끝 아래 처럼!
				
				
				System.out.printf("\n오늘은 %d년 %d월 %d일 입니다",2021,2,15);
				
				//서식문자 
				
				//%d : 정수 를 입력받음
				//%f  실수 를 입력 받음 (소수점까지)
				
				System.out.printf("\n 파이값은 %f입니다",3.14 );
				
				//%f사이에 .과 나타내고 싶은 자릿수를 적으면 그 자릿수까지 표현됨 아래 예시 참조
				System.out.printf("\n 파이값은 %.2f입니다",3.14 );
				System.out.printf("\n 파이값은 %.4f입니다",3.14 );
				System.out.printf("\n지구반지름 %7.2f입니다", 6400.00);
				
				
				
				//.앞에 숫자를 입력하면 전체 칸의 자릿수를나타냄 :아래 참고 
				//즉 %  (전체 자리수를 나타냄) .  (실수의 자리수 나타냄)  f
				
				
				
				System.out.printf("\n 파이값은 %10.2f입니다",3.14 );
				
				//%c : 단일 문자를 입력받음
				//%s :문자열 입력받음 즉 장문, 문장
				
				System.out.printf("\n 한글의 시작은 %c입니다", '가' ); 
				//단일문자는 '' 홀 따옴표 사용 '' => ""아님
				
				
				System.out.printf("\n 한글의 시작은 %s입니다","세종대왕" );
				//%s는 한글자를 적더라도 쌍따옴표 사용 "" 
				
				//단축키 
				
				
	
		
		
		
		
		
		
		
		
	}


}
