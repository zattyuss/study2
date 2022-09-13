package section06;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal의 상위 클래스 : 큰 타입
		//Dog, Cat 하위 클래스 : 작은 타입
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
	}
}

class Animal{}  // 상위 클래스


class Dog extends Animal{  //Animal의 하위 클래스
	public Dog() {
		System.out.println("강아지 객체 생성");
	}
}
class Cat extends Animal{ //Animal의 하위 클래스
	public Cat() {
		System.out.println("고양이 객체 생성");
	}
}