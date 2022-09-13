package section01;

public interface RemoteControl {
	
	//상수 필드
	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	// 추상메소드만 허용
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지 교환");
	}
	
}
