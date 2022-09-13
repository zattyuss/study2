package tv;

public class Television {
	static String company ="LG";
	static String model ="LED";
	static String info;
	String color;
	
	// 스태틱(메소드) 영억, 힙 영역(객체), 스택영역
	
	static {
		System.out.println("스태틱 블록");
		info = company + "_" + model;
	}
	
}
