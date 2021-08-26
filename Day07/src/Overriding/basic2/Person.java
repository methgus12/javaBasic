package Overriding.basic2;

public class Person {
	
	String name;
	int age;
	
	//this 활용하기 this.변수
	//번거롭게 이름 바꾸어서 지정할 필요없음
	
	
	String info() {
		return "이름" + name + ",나이 :" + age;
	}
	

}
