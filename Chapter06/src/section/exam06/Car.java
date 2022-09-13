package section.exam06;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
