package section01;

public class DmbCellPhone extends CellPhone {
	
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "�� DMB ����� ������");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� ���� : " + channel + "��");
	}
	void trunOffDmb() {
		System.out.println("DMB��� ������ �ߴ��մϴ�.");
	}
	
}
