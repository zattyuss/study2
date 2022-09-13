package section09;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
		@Override
		public boolean roll() {
			if(accmulateRotation<maxRotation) {
				System.out.println(location + "금호 타이어 수명 : " + (maxRotation-accmulateRotation) + "회");
				return true;
			}else {
				System.out.println("***" + location + " 금호 타이어 펑크 ***");
				return false;
			}
	}
	
	
}
