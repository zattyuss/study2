package section11;

public class Phone {
	protected String number;
	
	public void makeAPhoneCall() {
		System.out.println("전화를 겁니다.");
	
	}
}

class SmartPhone extends Phone{
	
	String[] apps = {"유튜브","앱스토어","카카오톡"};
	
	public void playApp(String appName) {
		for(String app : apps) {
			if(app.equals(appName)) {
				System.out.println(app+"을 실행합니다");
			}
		}
	}
}
