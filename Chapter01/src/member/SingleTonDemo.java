package member;

public class SingleTonDemo {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
