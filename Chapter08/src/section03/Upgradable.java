package section03;

public interface Upgradable extends Repareable {
	// 업그레이드 가능한 건물은 모두 수리가능
	// 업그레이드 가능한 건물중에 리프팅이 되는 것도 있고
	// 안 되는 것도 있다.
	void upgradable();
}
