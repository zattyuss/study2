package section06;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal�� ���� Ŭ���� : ū Ÿ��
		//Dog, Cat ���� Ŭ���� : ���� Ÿ��
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		Dog dog2 = (Dog) new Animal();
		Cat cat2 = (Cat) new Animal();
	}
}

class Animal{}  // ���� Ŭ����


class Dog extends Animal{  //Animal�� ���� Ŭ����
	public Dog() {
		System.out.println("������ ��ü ����");
	}
}
class Cat extends Animal{ //Animal�� ���� Ŭ����
	public Cat() {
		System.out.println("����� ��ü ����");
	}
}