package ex03;

public class FruitDemo {
	public static void main(String[] args) {
		
		//����Ÿ���� ����Ÿ�Կ� �Ҵ�
		Fruit apple1 = new Apple(); // �ڵ� Ÿ�� ��ȯ(������ Ÿ�� ��ȯ)
		
		// �ٽ� ����Ÿ������ ���� Ÿ�� ��ȯ ����
		Apple apple2 = (Apple) apple1;
		
		// ����Ÿ���� ����Ÿ�Կ� �Ҵ�
		Fruit fruit = new Fruit();
		try {
			Apple apple3 = (Apple) fruit;			
		} catch (Exception e) {
			System.out.println("ĳ���� �Ұ�");
		}
		
		Fruit banana = new Banana();
		Apple apple4 = (Apple) banana;
		
		
		
	}
}
class Toy{}
class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}