package quiz02;

public class Account {
	
	String name ;
	String password;
	int balance;
	
	Account() {
		
	}
	
	int money = 0;
	Account(String pName , String pPassword , int pBalace) {
		
		name = pName;
		password = pPassword;
		balance = pBalace;
	
	}
	
	void deposit(int money) {
		
		balance += money;
		
	}
	
	void withDrwa(int money) {
		
		if(balance < money) {
			System.out.println("출금금액이 부족합니다. ");
		}
		
		balance -= money;
		
	}
	
	
	int getbalance() {

		return balance;
	}

}
