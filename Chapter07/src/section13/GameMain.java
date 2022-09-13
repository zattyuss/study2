package section13;

public class GameMain {
	public static void main(String[] args) {

		Champion ezreal = new Ezreal(530,375);
		ezreal.move(10, 2);
		ezreal.useSkillQ();	
		ezreal.useSkillW();
		ezreal.useSkillE();
		ezreal.useSkillR();
		System.out.println("---------------------------------");
		Champion jinx = new Jinx(610,245);
		jinx.move(10, 2);
		jinx.useSkillQ();
		jinx.useSkillW();
		jinx.useSkillE();
		jinx.useSkillR();
	}
}
