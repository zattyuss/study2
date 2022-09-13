package section11;

public class PhoneDemo {
	public static void main(String[] args) {
//		Phone phone = new SmartPhone(); 
//		SmartPhone sm = (SmartPhone) new Phone(); 
		
		SmartPhone sm = new SmartPhone();
		sm.makeAPhoneCall();
		sm.playApp("À¯Æ©ºê");
		
		Phone phone = sm;
		phone.makeAPhoneCall();
//		phone.playApp("À¯Æ©ºê");
		
		SmartPhone sm2 = (SmartPhone) phone;
		sm2.makeAPhoneCall();
		sm2.playApp("Ä«Ä«¿ÀÅå");
	}
}
