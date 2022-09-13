package section13;

public class Ezreal extends Champion{

	public Ezreal(int hp, int attack) {
		super(hp, attack);
	}

	@Override
	public void useSkillQ() {
		System.out.println("Q : 신비한 화살");
	}

	@Override
	public void useSkillW() {
		System.out.println("W : 정수의 흐름");		
	}

	@Override
	public void useSkillE() {
		System.out.println("E : 비전 이동");
	}

	@Override
	public void useSkillR() {
		System.out.println("R : 정조준 일격");
	}
	
	
}
