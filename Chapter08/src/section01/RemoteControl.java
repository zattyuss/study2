package section01;

public interface RemoteControl {
	
	//��� �ʵ�
	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	// �߻�޼ҵ常 ���
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����");
		} else {
			System.out.println("���� ����");
		}
	}
	
	public static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
	
}
