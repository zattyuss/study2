package section.exam04;

public class Car {
	String company = "HYUNDAI";
	String model = "G80";
	String color = "WHITE";
	int maxSpeed = 350;
	int speed;
	
	public Car() {
		System.out.println("�⺻ ������ ���");
	}
	
	public Car(String company) {
		System.out.println("�Ű������� 1���� ������ ���");
		this.company = company;
	}
}
