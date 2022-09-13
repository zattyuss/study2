package field2;

public class CarEx {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("제작회사 : " +car.getCompany());
		System.out.println("모델명 : " + car.getCompany());
		System.out.println("색깔 : " + car.getColor());
		System.out.println("최고속도 : " + car.getMaxSpeed());
		System.out.println("현재속도 : " + car.getSpeed());
		
		car.setSpeed(60);
		System.out.println("수정된 속도 : " +car.getSpeed());
	
	
	
	}		
}



