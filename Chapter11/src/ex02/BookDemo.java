package ex02;

public class BookDemo {
	public static void main(String[] args) {
		Book book1 = new Book(1, "이것이 자바다", "한빛미디어");
		Book book2 = new Book(1, "이것이 자바다", "한빛미디어");
		
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book2));
		
		Onwer onwer = new Onwer();
		System.out.println(book1.equals(onwer));
	}
}
class Onwer{
	int id;
	String company = "한빛미디어";
}