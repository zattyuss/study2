package section03;

public class People {
	public String name;
	public String ssn;
	
	public People() {}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "People [name : " + name + ", ssn : " + ssn + "]";
	}
	
	
}
