package section09;

public class Tire {
	public int maxRotation;
	public int accmulateRotation;
	public String location;
	
	
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		if(accmulateRotation<maxRotation) {
			System.out.println(location + "Ÿ�̾� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Ÿ�̾� ��ũ ***");
			return false;
		}
	}
	
}
