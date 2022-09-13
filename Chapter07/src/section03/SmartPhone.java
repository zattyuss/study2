package section03;

import section02.CellPhone;

public class SmartPhone extends CellPhone {
	
	String[] apps;
	
	public SmartPhone() {
		apps = new String[10];
		apps[0] = "유튜브";
		apps[1] = "앱스토어";
		apps[2] = "크롬";
	}
	
	public void appExecute (String appName) {
		if(!this.power) {
			System.out.println("전원이 꺼진 상태입니다.");
			return;
		}
		for(String app : apps) {
			if(app!=null && app.equals(appName)) {
			System.out.println(appName + " 앱을 실행합니다.");
			return;
		}
	}
		System.out.println(appName + " 앱이 존재하지 않습니다.");
}
	public void info() {
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.phoneNumber);

	}

	
}
