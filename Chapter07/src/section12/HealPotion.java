package section12;

public class HealPotion extends Potion {
	
	int recovery = 70;
	
	@Override
	public void recovery(Character character) {
		int hp = character.getHp();
		int maxHp = character.getMaxHp();
		
		if(hp == maxHp) {
			System.out.println("더 이상 회복할 수 없습니다.");
			return;
		}
		
		
		hp += this.recovery;
		if(hp >= maxHp) {
			System.out.println("모든 생명력이 회복되었습니다");
			character.setHp(maxHp);
			return;
		}
		character.setHp(hp);
		System.out.println("생명력을"+ recovery + " 회복합니다");
	}
	
	
	
}
