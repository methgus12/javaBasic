package basic;

import java.util.Scanner;

public class StudentManager {
	static String [] nameList = new String [100]; //문자
	static String [] genderList = new String[100];
	static int [] ageList = new int [100]; //숫자
	
	//현재 사람수가 몇명이 저장되어있는지
	static int count = 0;
	//index(위치)를 조정하기 위한 변수
	static int index = -1;
	
	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	//학생정보를 저장하는 배열 3개
	
	/*String [] nameList = new String [100]; //문자
	String [] genderList = new String[100];
	int [] ageList = new int [100]; //숫자
	
	//현재 사람수가 몇명이 저장되어있는지
	int count = 0;
	//index(위치)를 조정하기 위한 변수
	//int index = -1;
	*/
	
	es:while(true) {
		System.out.println("[info] 고객수 :" + count+ "명" + ", 현재위치 : " + index);
		System.out.println("[menu(i).Insert, (p)Prev , (n)Next, (c)Current, (u)Update, (d)Delete , (q)Quit");
		System.out.print("메뉴>");
		String menu = scan.next();
		
		switch (menu) {
		case "i":
				/*
				 * 이름, 성별, 나이를 입력받아서 배열에 순서대로 저장
				 * 사람수 증가
				 */
			System.out.println("=======고객정보입력========");
			System.out.print("이름:");
			String name= scan.next();
			System.out.print("성별:");
			String gender = scan.next();
			System.out.print("나이:");
			int age = scan.nextInt();
			nameList[count] = name;
			genderList[count]= gender;
			ageList[count] = age;
			count++; //사람수 증
			input();

			System.out.println("========================");
			
			break;

		case "p":
			System.out.println("=======이전정보입력========");
			/*
			 * index의 번호가 0이하면 "이전정보가 없습니다" 출력
			 * 그렇지않으면 index를 이동해서 이전고객정보를 보여주면됩니다.
			 */
			if(index <= 0 ) {//이전으로 갈수없는 상태
				System.out.println("이전정보가 없습니다.");
			} else { 
				index-- ; //이전인덱스 불러오기 
				System.out.println("이름:" + nameList[index] );
				System.out.println("성별:"+ genderList[index]);
				System.out.println("나이:"+ ageList[index]); //이전 정보들나타내기
			}

			System.out.println("========================");
			break;
			
		case "n":
			System.out.println("=======다음고객정보입력=======");
			/*
			 * 다음고객정보를 출력할 수 없는 조건을 고려해서 "다음 정보가 없습니다" 출력 (index와 count와 연관이있습니다)
			 * 그렇지 않으면 index를 이동하고 다음 고객정보를 보여주면 됩니다.
			 */
			
			if (index >= count-1 ) {
				System.out.println("다음 고객정보가 존재하지않습니다'");
				
			} else {
				index++;
				System.out.println("이름:" + nameList[index] );
				System.out.println("성별:"+ genderList[index]);
				System.out.println("나이:"+ ageList[index]);
			}

			System.out.println("========================");
			break;
			
		case "c":
			System.out.println("=======현재고객정보입력=======");
			/*
			 *현재 고객정보를 출력할 수 있는 조건을 고려해서 현재정보를 출력해주면 됩니다.
			 *힌트) index는 ??보다 커야하고 ??보다 작아야합니다 
			 * 
			 */
			if (index >= 0 && index < count) {//출력가능한현재위치
				System.out.println("이름:" + nameList[index] );
				System.out.println("성별:"+ genderList[index]);
				System.out.println("나이:"+ ageList[index]);
			} else {
				System.out.println("현재고객정보가 존재하지않습니다.");
			}
			
			System.out.println("========================");
			break;
			
		case "u" :
			System.out.println("=======현재고객정보수정=======");
			/*
			 * 현재정보를출력할수 있는 조건을 고려해서 스캐너를 통해 이름, 성별, 나이를 받고 수정해주면됩니다.
			 */
			if(index >= 0 && index < count) {
				
				System.out.println("고객정보 수정을 완료하였습니다");
				System.out.print(nameList[index]+ "님의 정보를 수정합니다.");
				System.out.print("수정할이름 :");
				nameList[index] =scan.next(); //굳이 변수를 안만들어도 한번에 가능  간결해짐
				System.out.println("수정할 성별 :");
			    genderList[index] =scan.next();
			    System.out.println("수정할 나 :");
			    ageList[index] =scan.nextInt();

			} else {
				System.out.println("수정할 데이터가 존재하지않습니다");
			}
			
		System.out.println("========================");
			break;
			
		case "d":
			System.out.println("=======현재고객정보삭제=======");
			/*
			 * 현재 고객정보를 삭제할 수 있는 조건을 고려해서 현재 위치에서 부터 뒤에있는 배열요소를 
			 * 당겨와서 덮어씌웁니다.
			 * 고객수감소
			 */
			
			
			if(index >= 0 && index < count)  {
				
				for(int i = index ; i < count-1;i++) {
				nameList[i] = nameList[i+1];
				genderList[i] = genderList[i+1];
				ageList[i] = ageList[i+1];
				}count--; //사람수감
			} else {
				System.out.println("삭제할 데이터가 존재하지않습니다.");
			}

			System.out.println("========================");
			
			break;

			
		case "q":
			scan.close();
			System.out.println("프로그램 종료");
			System.exit(0);
			
			break es;

		default :
			System.out.println("메뉴를 잘못입력했습니다.");
			break;
		}
		
	}
	
	
	

	}static void input() {
		
	}
}

