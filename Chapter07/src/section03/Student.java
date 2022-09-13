package section03;

public class Student extends People {
	
	int StudentNo;
	
	
	public Student(String name, String ssn) {
		super(name, ssn);
		System.out.println("切积 按眉 积己");
		
		
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
