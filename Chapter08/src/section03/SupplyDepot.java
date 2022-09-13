package section03;

// 수리가능
// 리프팅 불가
// 업그레이드 불가
// 생산 불가
public class SupplyDepot extends Building implements Repareable{

	public SupplyDepot(int hp, int buildTime) {
		super(hp, buildTime);
		
	}

	@Override
	public void repareable() {
	}
	@Override
	public void autoRecovery() {
		System.out.println("자연회복");
		Repareable.super.autoRecovery();
	}
}
