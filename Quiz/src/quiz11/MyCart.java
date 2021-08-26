package quiz11;

import java.lang.ProcessHandle.Info;

public class MyCart {
	
	
	// 1.모든 멤버변수와 매서드에 적절한 접근제어자를 선언하세요
	
	private int money; //가진돈 
	private Product [] cart = new Product[1]; //상품을 저장할 배열 MyCart클래스의 멤버변수 
	private int i=0;
	
	//2. Mycart 생성자는 money 만 받아서 초기화 
	
	public MyCart(int money) {
		this.money= money;
	}
	
	/*
	 * 3.buy()메서드 모든 상품을 받도록 선언.
	 * 가진 돈과 물건의 가격을 비교해서 가진돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에서 빼고 add(상품) 메서드를 호출
	 */
	
	public void buy(Product pro) {
			if(this.money < pro.price) {
				System.out.println("금액부족");
				return;
			} 
			this.money -= pro.price;
			add(pro);
		}
	
	/*
	 * 4.add()는 모든 상품을 받도록 선언
 	 * 만약 i의 값이 cart의 크기보다 같거나 크다면 , 
 	 * 기존의 장바구니보다 크기가 2배가 되는 배열을 생성
 	 * 
 	 * 기존 장바구니에값을 새로운 배열에복사
 	 * 새로운 장바구니를 기존의 장바구니와 바꿔주는 기능 
 	 * 
 	 * info() 메서드를 호출합니다.
	 */
	//이부분 미흡 , 복습하기 
	private void add(Product pro) {
		
			if(i >= cart.length) {//장바구니가 가득찬 경우
				Product [] newCart = new Product[cart.length *2];
				for(int j =0; j <cart.length; j++) {
					newCart[j] = cart[j];
			}
			cart = newCart;
			
		}cart[i] = pro; //상품저장
		i++;
		info(); //info 호출
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 이름을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은 금액 출력
	 * main 에서는 buy 메서드만호출하면됩니다. 
	 */
	
	public void info() {
		System.out.println("현재상품");
		int sum =0;
		for(int index=0; index < i; index++) {//i는 상품의개수
			
/*			
			if ( cart[index] instanceof Computer) {
				System.out.print(cart[index].name+ "");
			} else if(cart[index] instanceof Tv) {
				System.out.print(cart[index].name+ "");
			} else if(cart[index] instanceof Radio) {
				System.out.print(cart[index].name+ "");

			}
			
*/
			sum += cart[index].price; //금액누적
			System.out.print(cart[index].name+ "");
		
		}System.out.print("]");
		System.out.println("\n남은금액" + money);
		System.out.println("금액합계" +sum);
	}
	

	
}
