package section03;

public class Student extends People {
	
	int StudentNo;
	
	
	public Student(String name, String ssn) {
		super(name, ssn);
		System.out.println("�л� ��ü ����");
		
		
	}
	public Student(String name, String ssn, int StudentNo) {
		super(name, ssn);
		this.StudentNo = StudentNo;
		
		
		
	}
	@Override
	public String toString() {
		String str = "[People]\n";
		str += "name : " + name +"\n";
		str += "ssn : " + ssn +"\n";
		str += "StudentNo : " + StudentNo +"\n";
		return str;
		

	}
	
	
	
}
