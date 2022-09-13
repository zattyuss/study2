package section.exam07;

public class CarEx {
	public static void main(String[] args) {
//		Car car1 = new Car();
//		System.out.println(car1);
//		System.out.println(car1.company);
//		System.out.println(car1.color);
//		System.out.println(car1.maxSpeed);
//		
//		Car car2 = new Car("그랜저");
//		System.out.println(car2.model);
		
		Car car3 = new Car("소나타", "검정");
		System.out.println(car3.model);
		System.out.println(car3.color);
		
		Car car4 = new Car("G80","흰색",300);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		
	}
}
