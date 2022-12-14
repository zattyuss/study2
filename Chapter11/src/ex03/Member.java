package ex03;

public class Member {
	private int id;
	private String name;
	private String email;
	private String password;
	
	public Member(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getEmai() {
		return email;
	}

	public void setEmai(String emai) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			boolean[] test = {
					id == member.getId(),
					name.equals(member.getName()),
					email.equals(member.getEmai()),
					password.equals(member.getPassword())
		};
			boolean result = true;
			for(boolean b : test) {
				result &= b;
				// result = result && b;
			}
			
			return result;	
		}
		return false;
	}
	
}
