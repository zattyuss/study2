package final1;

public class Person {
	
	final String nation = "´ëÇÑ¹Î±¹";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	public static void main(String[] args) {
		Person p1 = new Person("5678","±æµ¿È«");
		
	}
	
}
