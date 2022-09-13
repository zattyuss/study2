package section13;

public class Jinx extends Champion {
	
	public Jinx(int hp, int attack) {
		super(hp, attack);
	}

	@Override
	public void useSkillQ() {
		System.out.println("Q : 휘릭휘릭!");	
	}

	@Override
	public void useSkillW() {
		System.out.println("W : 빠직!");
	}

	@Override
	public void useSkillE() {
		System.out.println("E : 와작와작 뻥!");
	}

	@Override
	public void useSkillR() {
		System.out.println("R : 초강력 초토화 로켓!");
	}
	
	
	
}
