package section.exam07;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		System.out.println("�⺻������ ȣ��");
		color = "����";
		maxSpeed = 250;
	}
	public Car(String model) {
		System.out.println("model���� �޽��ϴ�.");
		this.model = model;
	}
	public Car(String model, String color) {
		System.out.println("model���� color���� �޽��ϴ�.");
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
