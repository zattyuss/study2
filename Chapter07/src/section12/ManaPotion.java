package section12;

public class ManaPotion extends Potion {
	
	int recovery = 30;
	
	@Override
	public void recovery(Character character) {
		int mp = character.getMp();
		int maxMp = character.getMaxMp();
		
		if(mp == maxMp) {
			System.out.println("더 이상 회복할 수 없습니다.");
			return;
		}
		
		mp += this.recovery;
		if(mp >= maxMp) {
			System.out.println("모든 생명력이 회복되었습니다.");
			character.setMp(maxMp);
			return;
		}
		character.setMp(mp);
		System.out.println("마나"+ recovery + " 회복합니다");
	}
}
