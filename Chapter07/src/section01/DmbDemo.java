package section01;

public class DmbDemo {
	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("������","ȭ��Ʈ",10);
		
		System.out.println("�� : " + phone.model);
		System.out.println("���� : " + phone.color);
		System.out.println("ä�� : " + phone.channel);
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice("�������� ����");
		phone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�Դϴ�.");
		phone.sendVoice("�� ~ �� �ݰ���");
		phone.hangup();
		
		phone.turnOnDmb();
		phone.changeChannelDmb(12);
		phone.trunOffDmb();
		
		System.out.println(CellPhone.company);
		System.out.println(DmbCellPhone.company);
		DmbCellPhone.methodA();
	}
}
