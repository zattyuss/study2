package section13;

public class Ezreal extends Champion{

	public Ezreal(int hp, int attack) {
		super(hp, attack);
	}

	@Override
	public void useSkillQ() {
		System.out.println("Q : �ź��� ȭ��");
	}

	@Override
	public void useSkillW() {
		System.out.println("W : ������ �帧");		
	}

	@Override
	public void useSkillE() {
		System.out.println("E : ���� �̵�");
	}

	@Override
	public void useSkillR() {
		System.out.println("R : ������ �ϰ�");
	}
	
	
}
