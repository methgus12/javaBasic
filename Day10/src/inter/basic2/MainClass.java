package inter.basic2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog =new Dog();
		Animal cat=new Cat();
		Animal tiger = new Tiger();
		
		//1.Animal[] 을 생성하고 저장하고, 향상된 포문으로 동물의 기능을 출력하세요
		
		Animal [] arr = {dog,cat,tiger};
		for(Animal a : arr) {
			a.eat();
		}
		//2.IPet[] 을 생성 후 (강아지,고양이,금붕어) 를 저장합니다.
		//향상된 for문으로 팻의 기능을 출력을 해보세요 .
		//IPet과 Animal은 서로 타입은 다른데, 
		//자식 클래스가 상호연관성을 가지면 형변환이 됩니다.
		
		IPet [] arr2 = new IPet[3];
		arr2[0] = (IPet)dog;
		arr2[1] =(IPet)cat;
		arr2[2]= new GoldFish();
		
		for (IPet ip : arr2) {
			ip.play();
		}
		
		
		//전달 petshop
		
		IPet p = new Dog();
		PetShop shop = new PetShop();
		
		shop.carePet(new Dog());//가능
		shop.carePet(p); //가능
		shop.carePet(arr2[2]);//가능
		
		shop.petInfo(arr2); //pet타입의 배열

		
		
	}

}
