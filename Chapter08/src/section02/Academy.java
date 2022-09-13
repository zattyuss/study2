package section02;

import terran.section2.Repareable;
import terran.section2.Upgradable;

public class Academy extends Building implements Upgradable, Repareable {
	
	public static final int MAX_HP = 600;
	
	public Academy(int hp, int buildTime) {
		super(hp, buildTime);
		System.out.println("사관학교를 건설합니다.");
	}

	@Override
	public void repare() {
		System.out.println("사관학교를 수리합니다.");
		
	}

	@Override
	public void upgrade(String upgrade) {
		System.out.println("업그레이드를 합니다 : " + upgrade);
		
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
		
	}

	
}
