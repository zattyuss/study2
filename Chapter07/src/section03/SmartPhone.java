package section03;

import section02.CellPhone;

public class SmartPhone extends CellPhone {
	
	String[] apps;
	
	public SmartPhone() {
		apps = new String[10];
		apps[0] = "��Ʃ��";
		apps[1] = "�۽����";
		apps[2] = "ũ��";
	}
	
	public void appExecute (String appName) {
		if(!this.power) {
			System.out.println("������ ���� �����Դϴ�.");
			return;
		}
		for(String app : apps) {
			if(app!=null && app.equals(appName)) {
			System.out.println(appName + " ���� �����մϴ�.");
			return;
		}
	}
		System.out.println(appName + " ���� �������� �ʽ��ϴ�.");
}
	public void info() {
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.phoneNumber);

	}

	
}
