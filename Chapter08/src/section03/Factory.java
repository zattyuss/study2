package section03;

public class Factory extends Building implements Generatable{
	// 유닛 생산 가능한 건물은 모두 리프팅 가능하며 수리가능하다.

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
		System.out.println("자연회복");
		Generatable.super.autoRecovery();
	}
}
