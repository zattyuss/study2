package section12;

public class ManaPotion extends Potion {
	
	int recovery = 30;
	
	@Override
	public void recovery(Character character) {
		int mp = character.getMp();
		int maxMp = character.getMaxMp();
		
		if(mp == maxMp) {
			System.out.println("�� �̻� ȸ���� �� �����ϴ�.");
			return;
		}
		
		mp += this.recovery;
		if(mp >= maxMp) {
			System.out.println("��� ������� ȸ���Ǿ����ϴ�.");
			character.setMp(maxMp);
			return;
		}
		character.setMp(mp);
		System.out.println("����"+ recovery + " ȸ���մϴ�");
	}
}
