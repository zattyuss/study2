package section13;

public class Jinx extends Champion {
	
	public Jinx(int hp, int attack) {
		super(hp, attack);
	}

	@Override
	public void useSkillQ() {
		System.out.println("Q : �ָ��ָ�!");	
	}

	@Override
	public void useSkillW() {
		System.out.println("W : ����!");
	}

	@Override
	public void useSkillE() {
		System.out.println("E : ���ۿ��� ��!");
	}

	@Override
	public void useSkillR() {
		System.out.println("R : �ʰ��� ����ȭ ����!");
	}
	
	
	
}
