package ex08;

public class Greeting {
	
	void greet(final String message) {
//		message = "Hi";
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		Greeting g = new Greeting();
		g.greet("?ȳ?");
	}
	
	
}
