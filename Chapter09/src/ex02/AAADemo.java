package ex02;

import ex02.AAA.BBB;

public class AAADemo {
	public static void main(String[] args) {
		System.out.println("(��)��� : " + AAA.BBB.CC);
		
		AAA aaa = new AAA();
		BBB bbb= aaa.new BBB();
		bbb.methodB(); // ����Ŭ������ �ν��Ͻ� �޼ҵ�
		System.out.println(bbb.aa); // ����Ŭ������ �ν��Ͻ� �ʵ�
		
		
		
		
		
		
	}
}
