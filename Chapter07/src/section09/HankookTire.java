package section09;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		if(accmulateRotation<maxRotation) {
			System.out.println(location + "�ѱ� Ÿ�̾� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + " �ѱ� Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
