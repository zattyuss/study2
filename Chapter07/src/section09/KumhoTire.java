package section09;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
		@Override
		public boolean roll() {
			if(accmulateRotation<maxRotation) {
				System.out.println(location + "��ȣ Ÿ�̾� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
				return true;
			}else {
				System.out.println("***" + location + " ��ȣ Ÿ�̾� ��ũ ***");
				return false;
			}
	}
	
	
}
