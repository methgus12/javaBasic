package quiz02;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account acc = new Account("탁소현", "5383", 1000);
		
		acc.deposit(2000);
		acc.withDrwa(4000);
		
		int bal = acc.getbalance();
		System.out.println(acc.name + "님의 계좌 잔액은 " + bal + "원입니다.");
		
		
	}

}
