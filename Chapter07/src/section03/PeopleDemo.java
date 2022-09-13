package section03;

public class PeopleDemo {
	public static void main(String[] args) {
		Student s1 = new Student("È«±æµ¿","123456-7891231");
		Student s2 = new Student("È«±æ¼ø","987654-3214567");
		System.out.println(s1);
		System.out.println(s2.toString());
		
		Student s3 = new Student("Á¤»ó¼ö","123456-7789541");
		System.out.println(s3);
	}
	
}
