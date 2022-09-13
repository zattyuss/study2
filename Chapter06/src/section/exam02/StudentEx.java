package section.exam02;

public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 참조변수의 주소 : "+s1);
		
		Student s2 = new Student();
		System.out.println("s2 참조변수의 주소 : "+s2);
		
		s1.name = "홍길동";
		s1.age = 21;
		s1.grade = "2학년";
		s1.id = 202011676;
		s1.major = "컴퓨터 공학";
		
		s2.name = "임꺽정";
		s2.age = 21;
		s2.grade = "3학년";
		s2.id = 201911676;
		s2.major = "컴퓨터 공학";
		
		System.out.println("s1 학생 이름 : "+s1.name); 
		System.out.println("s1 학생 나이 : "+s1.age);
		System.out.println("s1 학생 학년 : "+s1.grade);
		System.out.println("s1 학생 학번 : "+s1.id);
		System.out.println("s1 학생 전공 : "+s1.major);
		s1.study();

		System.out.println("=========================================================");
		System.out.println("s2 학생 이름 : "+s2.name);
		System.out.println("s2 학생 나이 : "+s2.age);
		System.out.println("s2 학생 학년 : "+s2.grade);
		System.out.println("s2 학생 학번 : "+s2.id);
		System.out.println("s1 학생 전공 : "+s2.major);
		s2.goToSchool();
	}
}
