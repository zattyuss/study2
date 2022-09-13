package section01;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("¿Àµð¿À ÄÔ");
		
	}

	@Override
	public void turnOff() {
		System.out.println("¿Àµð¿À ²û");
		
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
		System.out.println("ÇöÀç ¿Àµð¿À º¼·ý : " + this.volume);
	
		
	}

}
