package section09;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <=5; i++) {
			int problemLocation = car.run();
			
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "�ѱ� Ÿ�̾�� ��ü");
				car.tires[problemLocation-1]
						= new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			
			
			System.out.println("----------------------------------");
		}
	}
}
