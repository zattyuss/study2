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
			System.out.println(location + "타이어 수명 : " + (maxRotation-accmulateRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
	}
	
}
