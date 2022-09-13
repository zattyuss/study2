package section11;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new SmartPhone();
		SmartPhone phone3 = new SmartPhone();
		
		CheckType(phone1);
		CheckType(phone2);
		CheckType(phone3);
	}
	
	
private static void CheckType(Object obj) {
	if(obj instanceof SmartPhone) {
		System.out.println("SmartPhone 타입");
	}else {
		System.out.println("SmartPhone 타입 아님");
	}
		
	}


}

	