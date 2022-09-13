package section.exam23;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car(100,true);
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
		car.setSpeed(200);
		System.out.println(car.getSpeed());
		
	}
}
