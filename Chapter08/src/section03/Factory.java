package section03;

public class Factory extends Building implements Generatable{
	// ���� ���� ������ �ǹ��� ��� ������ �����ϸ� ���������ϴ�.

	public Factory(int hp, int buildTime) {
		super(hp, buildTime);
	}

	@Override
	public void Lift() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repareable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generatable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autoRecovery() {
		System.out.println("�ڿ�ȸ��");
		Generatable.super.autoRecovery();
	}
}
