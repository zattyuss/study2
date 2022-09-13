package section12;

public class VitalPotion extends Potion {
	
	int mpRecovery = 30;
	int hpRecovery = 70;
	
	@Override
	public void recovery(Character character) {
		int hp = character.getHp();
		int mp = character.getMp();
		int maxHp = character.getMaxHp();
		int maxMp = character.getMaxMp();
		
		if(mp == maxMp && hp == maxHp) {
			System.out.println("마나와 생명력 모두 최대치입니다.");
			return;
		}
		
		hp += hpRecovery;
		mp += mpRecovery;
		hp = hp > maxHp ? maxHp : hp;
		mp = mp > maxMp ? maxMp : mp;
		character.setHp(hp);
		character.setMp(mp);
		
		if(hp == maxHp && mp == maxMp) {
			System.out.println("모든 생명력과 마나가 회복되었습니다.");
			return;
		}
		System.out.println("생명력(70)과 마나(30)를 회복합니다");
		
		
	}
}
