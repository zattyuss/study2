package section03;

// ��������
// ������ �Ұ�
// ���׷��̵� �Ұ�
// ���� �Ұ�
public class SupplyDepot extends Building implements Repareable{

	public SupplyDepot(int hp, int buildTime) {
		super(hp, buildTime);
		
	}

	@Override
	public void repareable() {
	}
	@Override
	public void autoRecovery() {
		System.out.println("�ڿ�ȸ��");
		Repareable.super.autoRecovery();
	}
}
