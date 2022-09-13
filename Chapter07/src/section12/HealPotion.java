package section12;

public class HealPotion extends Potion {
	
	int recovery = 70;
	
	@Override
	public void recovery(Character character) {
		int hp = character.getHp();
		int maxHp = character.getMaxHp();
		
		if(hp == maxHp) {
			System.out.println("�� �̻� ȸ���� �� �����ϴ�.");
			return;
		}
		
		
		hp += this.recovery;
		if(hp >= maxHp) {
			System.out.println("��� ������� ȸ���Ǿ����ϴ�");
			character.setHp(maxHp);
			return;
		}
		character.setHp(hp);
		System.out.println("�������"+ recovery + " ȸ���մϴ�");
	}
	
	
	
}
