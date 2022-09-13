package section02;

import terran.section2.Repareable;
import terran.section2.Upgradable;

public class Academy extends Building implements Upgradable, Repareable {
	
	public static final int MAX_HP = 600;
	
	public Academy(int hp, int buildTime) {
		super(hp, buildTime);
		System.out.println("����б��� �Ǽ��մϴ�.");
	}

	@Override
	public void repare() {
		System.out.println("����б��� �����մϴ�.");
		
	}

	@Override
	public void upgrade(String upgrade) {
		System.out.println("���׷��̵带 �մϴ� : " + upgrade);
		
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
		
	}

	
}
