package section01;

public class DmbDemo {
	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("아이폰","화이트",10);
		
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);
		System.out.println("채널 : " + phone.channel);
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice("여보세요 나야");
		phone.receiveVoice("안녕하세요 저는 홍길동입니다.");
		phone.sendVoice("아 ~ 어 반갑다");
		phone.hangup();
		
		phone.turnOnDmb();
		phone.changeChannelDmb(12);
		phone.trunOffDmb();
		
		System.out.println(CellPhone.company);
		System.out.println(DmbCellPhone.company);
		DmbCellPhone.methodA();
	}
}
