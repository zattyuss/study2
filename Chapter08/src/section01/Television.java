package section01;

public class Television implements RemoteControl {

	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Ƽ�� ��");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Ƽ�� ��");
		
	}
	public void testTv() {
		System.out.println("tv test...");
	}
	public void setVolume() {
		System.out.println("Ƽ�� ���� ����");
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
		System.out.println("���� TV ���� : " + this.volume);
	}
	

	
	

}
