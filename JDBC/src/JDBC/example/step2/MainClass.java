package JDBC.example.step2;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//모델 객체 생성
		IMembersDAO dao = new MembersDAO();
		
		
		while(true) {
			
			System.out.println("=======메뉴선택=======");
			System.out.println("[1.회원조회 2.회원추가 3.회원수정 4.회원삭제]");
			
			System.out.print("선택하세용 >");
			String menu = scan.next();
		
		switch (menu) {
		case "1":
			System.out.print("조회할ID >");
			String id = scan.next();
			
			Members vo = dao.select(id);
			
			if(vo==null) {
				System.out.println("존재하지않는 데이터입니다.");
			}else {
				System.out.println("아이디:" +vo.getId());
				System.out.println("비밀번호:"+ vo.getPw());
				System.out.println("이름:" +vo.getName());
				System.out.println("이메일:"+vo.getEmail());
				
			}
			break;
		case "2":
			/*
			 * 인터페이스에 insert메서드를 선언하고 model 클래스에서는 
			 * 데이터 베이스에insert하는 메서드를 오버라이딩해서 작성
			 * 해당 메서드가 1을 반환한다면 , 정상적으로 출력되었습니다를 출력
			 * 0을 반환하면 다시입력하세요를출력
			 */
			
			System.out.print("아이디>");
			String ids =scan.next();
			
			System.out.print("비밀번호>");
			String pw = scan.next();
			
			System.out.print("이름>");
			String name =scan.next();
			
			System.out.print("이메일>");
			String email =scan.next();
			
			int result = dao.insert(ids, pw, name, email);
			
			if (result ==1) {
				System.out.println("정상입력되었습니당");
			}else {
				System.out.println("다시 입력해주세요");
			}
			
			
			
			
			break;
			
		case "3":
			//아이디 , 비밀번호 , 이름 , 이메일을 받아서 db에 update 수행
			//인터페이스에 update메서드를 선언하고 model에서는 오버라이딩해서 작성
			//성공시 "정상 처리되었습니다. " , 실패시 "존재하지않는 아이디 입니다."
		
			
			System.out.print("아이디>");
			String upid =scan.next();
			
			System.out.print("비밀번호>");
			String uppw = scan.next();
			
			System.out.print("이름>");
			String upname =scan.next();
			
			System.out.print("이메일>");
			String upemail =scan.next();
			
			int upresult = dao.update(upid, uppw, upname, upemail);
			
			
			if(upresult ==1) {
				System.out.println("정상처리되었습니당~~~");
			}else {
				System.out.println("존재하지않는 아이디입니당 다시 입력해주세요!ㅜ_ㅜ");
			}
			
			
		  
		   break;
		
		case "4":
			
			break;
			
			default:
			
			
			
			
			
		
			
		}
		}
	}
}
