package example1;

import section05.Phone;

public class PhoneMain2 extends Phone {
	
	public static void main(String[] args) {
		PhoneMain2 p = new PhoneMain2();
		System.out.println(p.test);
		
		p.test1();
	}
	public void test1() {
		System.out.println(test);
	}
}
