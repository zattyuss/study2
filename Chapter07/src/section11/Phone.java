package section11;

public class Phone {
	protected String number;
	
	public void makeAPhoneCall() {
		System.out.println("��ȭ�� �̴ϴ�.");
	
	}
}

class SmartPhone extends Phone{
	
	String[] apps = {"��Ʃ��","�۽����","īī����"};
	
	public void playApp(String appName) {
		for(String app : apps) {
			if(app.equals(appName)) {
				System.out.println(app+"�� �����մϴ�");
			}
		}
	}
}
