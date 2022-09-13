package test;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		
		Apple apple1 = new Apple();
		Apple apple2 = new Apple();
		Apple apple3 = new Apple();
		
		System.out.println(apples);
		
		apples.add(apple1);
		
		System.out.println(apples);
		apples.add(apple2);
		apples.add(apple3);
		System.out.println(apples);
		System.out.println("사과바구니에 담긴 전체 사과의 개수 : " + apples.size());
		
		List<Orange> oranges = new ArrayList<Orange>();
		Orange orange1 = new Orange("오렌지1");
		Orange orange2 = new Orange("오렌지2");
		oranges.add(orange1);
		oranges.add(orange2);
		System.out.println(oranges);
		Orange getOrange = oranges.get(1);
		System.out.println(getOrange.name);
		System.out.println(oranges.get(0).name);
		
		
	}
}

class Fruit{}
class Apple{}
class Orange{
	String name;
	public Orange(String name) {
		this.name = name;
	}
}
