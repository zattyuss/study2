package ex02;

public class BookDemo {
	public static void main(String[] args) {
		Book book1 = new Book(1, "�̰��� �ڹٴ�", "�Ѻ��̵��");
		Book book2 = new Book(1, "�̰��� �ڹٴ�", "�Ѻ��̵��");
		
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book2));
		
		Onwer onwer = new Onwer();
		System.out.println(book1.equals(onwer));
	}
}
class Onwer{
	int id;
	String company = "�Ѻ��̵��";
}