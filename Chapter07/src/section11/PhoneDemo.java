package section11;

public class PhoneDemo {
	public static void main(String[] args) {
//		Phone phone = new SmartPhone(); 
//		SmartPhone sm = (SmartPhone) new Phone(); 
		
		SmartPhone sm = new SmartPhone();
		sm.makeAPhoneCall();
		sm.playApp("��Ʃ��");
		
		Phone phone = sm;
		phone.makeAPhoneCall();
//		phone.playApp("��Ʃ��");
		
		SmartPhone sm2 = (SmartPhone) phone;
		sm2.makeAPhoneCall();
		sm2.playApp("īī����");
	}
}
