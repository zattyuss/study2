package section.exam23;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car(int speed, boolean stop) {
		
		this.speed = speed;
		this.stop = stop;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public boolean isStop() {
		return this.stop;
	
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
