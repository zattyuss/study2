package section07;

public class Hero {
	
	String name;
	Item item;
	
	// ������
	public Hero(String name) {
		this.name = name;
	}

	// ����
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void info() {
		System.out.println("Ŭ���� ���� ����");
		System.out.println("Ŭ������ : " + this.name);
		System.out.println("���� ���μ� : " + this.item.name);
	}
}
