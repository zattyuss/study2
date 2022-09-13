package section.exam04;

public class Car {
	String company = "HYUNDAI";
	String model = "G80";
	String color = "WHITE";
	int maxSpeed = 350;
	int speed;
	
	public Car() {
		System.out.println("기본 생성자 사용");
	}
	
	public Car(String company) {
		System.out.println("매개변수가 1개인 생성자 사용");
		this.company = company;
	}
}
