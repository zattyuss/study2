package ex05;

public class Member {
	int id;
	String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return id == member.getId() && name.equals(member.getName());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
