package carcar;

public class Car {
	 String company = "�����ڵ���";
	 String model; 
	 String color;
	 int maxSpeed;
	 
	 
	 
	 public Car() {}

	public Car(String model) {
		this(model, "����",250);
	}

	public Car(String model, String color) {
		this(model, "color",250);
	}

	public Car(String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company : " + company + ", model : " + model + ", color : " + color + ", maxSpeed : " + maxSpeed + "]";
	}	 
	
	
	
}
