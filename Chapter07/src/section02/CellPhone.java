package section02;

public class CellPhone {
	protected boolean power;
	protected String model;
	protected String company;
	protected String color;
	protected String phoneNumber;
	
	public CellPhone() {}

	public CellPhone(String model, String color, String phoneNumber) {
		this.model = model;
		this.color = color;
		this.phoneNumber = phoneNumber;
	}
	public void makeAPhoneCall(String dial) {
		System.out.println(dial + "��ȣ�� ��ȭ�� �̴ϴ�.");
	}
	public void setPower(boolean power) {
		this.power = power;
		
		
	}
	
}
