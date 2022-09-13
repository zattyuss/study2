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
		System.out.println("다음 좌표로 이동 : " + x + "" + y);
	}
	
	// 챔피언이 사용하는 스킬
	
	public abstract void useSkillQ();
	public abstract void useSkillW();
	public abstract void useSkillE();
	public abstract void useSkillR();


	
}
