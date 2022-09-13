package section01;

public class RemoteDemo {
	public static void main(String[] args) {
		
		System.out.println(RemoteControl.MAX_VOULME);
		System.out.println(RemoteControl.MIN_VOULME);
		RemoteControl.changeBattery();
		
		
		Television tv = new Television();
		//Television 구현객체
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(50); //디폴트 메소드
		
		Television tv2 = (Television)tv;
		tv.testTv();
		
		
	}
}
