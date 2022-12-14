package ex02;

public class Member {
	private int id;
	private String name;
	
	
	public Member(int id, String name) {;
		this.id = id;
		this.name = name;
	}
	
	//Object 상위타입 Member 하위타입
	// 상위타입의 참조변수로 하위타입의 메소드 사용할 수 있나요 ? X
	// 강제 타입 변환
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
	// member1 equals메소드 사용
	// member2 매개변수로 전달 받음
	
	
	
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
