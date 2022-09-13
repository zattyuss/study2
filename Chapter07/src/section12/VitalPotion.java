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
			System.out.println("������ ����� ��� �ִ�ġ�Դϴ�.");
			return;
		}
		
		hp += hpRecovery;
		mp += mpRecovery;
		hp = hp > maxHp ? maxHp : hp;
		mp = mp > maxMp ? maxMp : mp;
		character.setHp(hp);
		character.setMp(mp);
		
		if(hp == maxHp && mp == maxMp) {
			System.out.println("��� ����°� ������ ȸ���Ǿ����ϴ�.");
			return;
		}
		System.out.println("�����(70)�� ����(30)�� ȸ���մϴ�");
		
		
	}
}
