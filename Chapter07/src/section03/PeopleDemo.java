package section03;

public class PeopleDemo {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿","123456-7891231");
		Student s2 = new Student("ȫ���","987654-3214567");
		System.out.println(s1);
		System.out.println(s2.toString());
		
		Student s3 = new Student("�����","123456-7789541");
		System.out.println(s3);
	}
	
}
