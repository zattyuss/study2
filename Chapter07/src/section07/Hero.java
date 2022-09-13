package section07;

public class Hero {
	
	String name;
	Item item;
	
	// 생성자
	public Hero(String name) {
		this.name = name;
	}

	// 세터
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void info() {
		System.out.println("클래스 정보 보기");
		System.out.println("클래스명 : " + this.name);
		System.out.println("착용 각인서 : " + this.item.name);
	}
}
