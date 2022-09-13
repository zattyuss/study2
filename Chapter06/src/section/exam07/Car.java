package section.exam07;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		System.out.println("기본생성자 호출");
		color = "검정";
		maxSpeed = 250;
	}
	public Car(String model) {
		System.out.println("model값을 받습니다.");
		this.model = model;
	}
	public Car(String model, String color) {
		System.out.println("model값과 color값을 받습니다.");
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
