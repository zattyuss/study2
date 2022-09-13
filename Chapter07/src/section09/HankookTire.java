package section09;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		if(accmulateRotation<maxRotation) {
			System.out.println(location + "한국 타이어 수명 : " + (maxRotation-accmulateRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " 한국 타이어 펑크 ***");
			return false;
		}
	}
}
