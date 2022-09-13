package section11;

public class InstanceOfEx {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Orange orange = new Orange();
		Banana banana = new Banana();
		
		checkFruitType(apple);
		checkFruitType(orange);
		checkFruitType(banana);
		checkFruitType("이지");
		
		if(apple instanceof Apple) {
			System.out.println("사과객체");
		}
	}

	private static void checkFruitType(Object obj) {
		if(obj instanceof Apple) {
			System.out.println("사과");
		}else if (obj instanceof Orange) {
			System.out.println("오렌지");
		}else if (obj instanceof Banana) {
			System.out.println("바나나");
		}else {
			System.out.println("알수없음");
		}
	}
}

class Apple{}
class Orange{}
class Banana{}