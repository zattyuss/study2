package section.exam02;

public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 ���������� �ּ� : "+s1);
		
		Student s2 = new Student();
		System.out.println("s2 ���������� �ּ� : "+s2);
		
		s1.name = "ȫ�浿";
		s1.age = 21;
		s1.grade = "2�г�";
		s1.id = 202011676;
		s1.major = "��ǻ�� ����";
		
		s2.name = "�Ӳ���";
		s2.age = 21;
		s2.grade = "3�г�";
		s2.id = 201911676;
		s2.major = "��ǻ�� ����";
		
		System.out.println("s1 �л� �̸� : "+s1.name); 
		System.out.println("s1 �л� ���� : "+s1.age);
		System.out.println("s1 �л� �г� : "+s1.grade);
		System.out.println("s1 �л� �й� : "+s1.id);
		System.out.println("s1 �л� ���� : "+s1.major);
		s1.study();

		System.out.println("=========================================================");
		System.out.println("s2 �л� �̸� : "+s2.name);
		System.out.println("s2 �л� ���� : "+s2.age);
		System.out.println("s2 �л� �г� : "+s2.grade);
		System.out.println("s2 �л� �й� : "+s2.id);
		System.out.println("s1 �л� ���� : "+s2.major);
		s2.goToSchool();
	}
}
