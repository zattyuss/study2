package section01;

public class CellPhone {
	static String company = "애플";
	String model;
	String color;
	
	static void methodA() {
		System.out.println("정적메소드");
	}
	
	void powerOn() {
		System.out.println("전원 켬");
	}
	void powerOff() {
		System.out.println("전원 끔");
	}
	void bell() {
		System.out.println("벨 울림");
	}
	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangup() {
		System.out.println("전화 끊음");
	}
}
