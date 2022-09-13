package section03;

public class EngineerBay extends Building implements Upgradable, Liftable{

	public EngineerBay(int hp, int buildTime) {
		super(hp, buildTime);
	}

	@Override
	public void repareable() {
	}

	@Override
	public void Lift() {
	}

	@Override
	public void move() {
	}

	@Override
	public void upgradable() {
	}
	@Override
	public void autoRecovery() {
		System.out.println("자연회복");
		Upgradable.super.autoRecovery();
	}
}
