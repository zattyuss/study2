package section10;

public class DriverEx {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();
		
		driver.drive(taxi);
		driver.drive(bus);
	}
}
