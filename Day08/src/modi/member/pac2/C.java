package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	//생성자
		public C() {
			
			A a = new A() ;
			
			a.var1=1;//public다른 패키지여도 사용가능
			
			//a.var2=2;//default 다른 패키지라 사용불가.
			//a.var3 =3; 밖에서 사용 불가 private
			
			a.method01(); //public다른 패키지여도 사용가능
			
			//a.method02();//default 다른 패키지라 사용불가.
			//a.method03(); private 라 사용불가.
			

}
}

