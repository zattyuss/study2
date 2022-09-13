package section13;

public abstract class Champion {
	int level = 1;
	int hp;
	int attack;
	
	
	public Champion(int hp, int attack) {
		this.hp = hp;
		this.attack = attack;
	}
	
	public void move (int x, int y) {
		System.out.println("���� ��ǥ�� �̵� : " + x + "" + y);
	}
	
	// è�Ǿ��� ����ϴ� ��ų
	
	public abstract void useSkillQ();
	public abstract void useSkillW();
	public abstract void useSkillE();
	public abstract void useSkillR();


	
}
