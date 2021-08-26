package exception.myexception;

public class Account {
	
	//접근제어자를 붙여주세요
	//withDraw()에서 잔액이 출금 잔액보다 작다면, 
	//MyException으로 예외를 발생시키고 처리하는 코드를작성해주세요
	
	private String name ;
	private String password;
	private int balace;
	
	public Account() {
		
	}
	
	int money = 0;
	public Account(String pName , String pPassword , int pBalace) {
		
		name = pName;
		password = pPassword;
		balace = pBalace;
	
	}
	
	public void deposit(int money) {
		
		balace += money;
		
	}
	
	public void withDrwa(int money)throws MyException {
		
		if(balace <money) {
			throw new MyException ((money - balace) + "원 부족");
			
		} balace -= money;
		
	
		
		
	}
	
	
	public int getbalace() {

		return balace;
	}

}
