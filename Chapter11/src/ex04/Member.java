package ex04;

public class Member {
	private int id;
	private String name;
	private String email;
	private Address address;
	
	
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return id == member.getId() &&
					name.equals(member.getName()) &&
					email.equals(member.getEmail()) &&
					address.equals(member.getAddress());
			};
		
		return false;
	}
//			
//			boolean[] test = {
//					id == member.getId(),
//					name.equals(member.getName()),
//					email.equals(member.getEmail()),
//					address.equals(member.getAddress())
}
