package modi.member.pac1;

public class B {
	
	//생성자
	public B() {
		A a = new A() ;
		a.var1=1;//public
		a.var2=2;//default
		//a.var3 =3; 밖에서 사용 불가 private
		
		a.method01();
		a.method02();
		//a.method03(); private 라 사용불가.
	}

}
