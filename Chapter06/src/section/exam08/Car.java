package section.exam08;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	public Car() { }
	
	public Car(String model) {
		this(model,"����",250);
		System.out.println();
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
