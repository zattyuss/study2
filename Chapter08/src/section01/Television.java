package section01;

public class Television implements RemoteControl {

	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Æ¼ºñ ÄÔ");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Æ¼ºñ ²û");
		
	}
	public void testTv() {
		System.out.println("tv test...");
	}
	public void setVolume() {
		System.out.println("Æ¼ºñ º¼·ý Á¶Àý");
	}
	
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		} else if(volume < RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý : " + this.volume);
	}
	

	
	

}
