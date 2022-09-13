package ex02;

import ex02.AAA.BBB;

public class AAADemo {
	public static void main(String[] args) {
		System.out.println("(정)상수 : " + AAA.BBB.CC);
		
		AAA aaa = new AAA();
		BBB bbb= aaa.new BBB();
		bbb.methodB(); // 내부클래스의 인스턴스 메소드
		System.out.println(bbb.aa); // 내부클래스의 인스턴스 필드
		
		
		
		
		
		
	}
}
