package section.exam20;

public class SingleTonEx {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		
	}
}

class SingleTon{
	
	private static SingleTon SingleTon = new SingleTon();
	
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		return SingleTon;
	}
	
	
}
