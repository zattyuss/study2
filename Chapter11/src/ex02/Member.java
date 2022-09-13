package ex02;

public class Member {
	private int id;
	private String name;
	
	
	public Member(int id, String name) {;
		this.id = id;
		this.name = name;
	}
	
	//Object ����Ÿ�� Member ����Ÿ��
	// ����Ÿ���� ���������� ����Ÿ���� �޼ҵ� ����� �� �ֳ��� ? X
	// ���� Ÿ�� ��ȯ
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			boolean testId = id == member.getId();
			boolean testName = name.equals(member.getName());
			return testId && testName;
			
		}
		return false;
	}
	// member1 equals�޼ҵ� ���
	// member2 �Ű������� ���� ����
	
	
	
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
	
}