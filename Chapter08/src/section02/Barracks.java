package section02;

import terran.section2.Generatable;

public class Barracks extends Building implements Generatable{
	
	public final static int MAX_HP = 1500;
	private boolean isLiftState = false;
	
	public Barracks(int hp, int builTime) {
		super(hp, builTime);
		System.out.println("������ �����մϴ�.");
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
	}
	@Override
	public void lift() {
		String message = isLiftState ? "�ǹ��� �����ϴ�." : "�ǹ��� ��� �ø��ϴ�.";
		System.out.println(message);
		this.isLiftState = !isLiftState;
	}
	@Override
	public void move() {
		if(isLiftState) {
			System.out.println("�ǹ��� �̵��մϴ�.");
			return;
		}
		System.out.println("�ǹ��� �̵��� �� �����ϴ�.");
	}
	@Override
	public void generateUnit() {
		System.out.println("������ �����մϴ�.");
		
	}
	@Override
	public void repare() {
		System.out.println("�ǹ��� �����մϴ�.");
		
	}
	
}
