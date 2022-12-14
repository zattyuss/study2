package ex03;

public class FruitDemo {
	public static void main(String[] args) {
		
		//하위타입을 상위타입에 할당
		Fruit apple1 = new Apple(); // 자동 타입 변환(묵시적 타입 변환)
		
		// 다시 하위타입으로 강제 타입 변환 가능
		Apple apple2 = (Apple) apple1;
		
		// 상위타입을 하위타입에 할당
		Fruit fruit = new Fruit();
		try {
			Apple apple3 = (Apple) fruit;			
		} catch (Exception e) {
			System.out.println("캐스팅 불가");
		}
		
		Fruit banana = new Banana();
		Apple apple4 = (Apple) banana;
		
		
		
	}
}
class Toy{}
class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}