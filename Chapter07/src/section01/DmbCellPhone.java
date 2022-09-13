package section01;

public class DmbCellPhone extends CellPhone {
	
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송을 수신함");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 변경 : " + channel + "번");
	}
	void trunOffDmb() {
		System.out.println("DMB방송 수신을 중단합니다.");
	}
	
}
