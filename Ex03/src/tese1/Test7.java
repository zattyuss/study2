package tese1;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		Apple apple1 = new Apple();
		Apple apple2 = new Apple();
		apples.add(apple1);
		apples.add(apple2);
		
		Orange orange1 = new Orange("������1");
		
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(apple1);
		fruits.add(apple2);
		fruits.add(orange1);
		
		List<Eatable> list = new ArrayList<Eatable>();
		Water water1 = new Water();
		list.add(water1);
		list.add(orange1);
		list.add(apple1);
//		list.add(new Toy());
		
		
		
		
	}
	
}
	
interface Eatable{}
class Toy{}
class Water implements Eatable{}

abstract class Fruit implements Eatable {}
class Apple extends Fruit{}
class Orange extends Fruit{
	String name;
	public Orange(String name) {
		this.name = name;
	}
}

