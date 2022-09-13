package model;

public class Member {
	
	private int id;
	private String name;
	private String password;
	private String email;
	
	public Member(int id, String name, String password, String email) {
		this(name, password, email);
		this.id = id;

	}

	public Member(String name, String password, String email) {
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
