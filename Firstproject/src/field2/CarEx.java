package field2;

public class CarEx {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("����ȸ�� : " +car.getCompany());
		System.out.println("�𵨸� : " + car.getCompany());
		System.out.println("���� : " + car.getColor());
		System.out.println("�ְ�ӵ� : " + car.getMaxSpeed());
		System.out.println("����ӵ� : " + car.getSpeed());
		
		car.setSpeed(60);
		System.out.println("������ �ӵ� : " +car.getSpeed());
	
	
	
	}		
}



