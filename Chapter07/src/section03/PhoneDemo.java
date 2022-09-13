package section03;

public class PhoneDemo {
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.makeAPhoneCall("01098858574");
		sm.info();
		sm.setPower(true);
		sm.appExecute("À¯Æ©ºê");
		sm.appExecute("¾Û½ºÅä¾î");
		sm.appExecute("°è»ê±â");
		
	}
}
