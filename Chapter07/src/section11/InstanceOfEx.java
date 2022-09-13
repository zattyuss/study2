package section11;

public class InstanceOfEx {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Orange orange = new Orange();
		Banana banana = new Banana();
		
		checkFruitType(apple);
		checkFruitType(orange);
		checkFruitType(banana);
		checkFruitType("����");
		
		if(apple instanceof Apple) {
			System.out.println("�����ü");
		}
	}

	private static void checkFruitType(Object obj) {
		if(obj instanceof Apple) {
			System.out.println("���");
		}else if (obj instanceof Orange) {
			System.out.println("������");
		}else if (obj instanceof Banana) {
			System.out.println("�ٳ���");
		}else {
			System.out.println("�˼�����");
		}
	}
}

class Apple{}
class Orange{}
class Banana{}